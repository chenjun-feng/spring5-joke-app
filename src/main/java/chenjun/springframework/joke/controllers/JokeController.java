package chenjun.springframework.joke.controllers;

import chenjun.springframework.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    // == fields ==
    private JokeService jokeService;

    // == constructor ==
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    // == request handlers ==
    @RequestMapping({"/",""})
    public String showJokes(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}

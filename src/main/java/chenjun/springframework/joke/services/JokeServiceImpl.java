package chenjun.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    // == fields ==
    private ChuckNorrisQuotes chuckNorrisQuotes;

    // == constructor ==
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    // == public methods ==
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

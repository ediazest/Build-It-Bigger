package com.example;

import java.util.Random;

public class JokeProvider {

    private String[] jokes = {"What could be a computer’s favorite dance item?\n" +
            "Disk – o!", "Which is the place pencils like to go for a vacation?\n" +
            "Pencil – vania!", "How do the prisoners communicate with each other?\n" +
            "Through cell phones!", "I haven't spoken a word to my wife in years. She hates to be interrupted.",
            "They threw me out of the cinema today for bringing my own food. But come on; the prices are way too high, plus I haven't had a barbecue in months.",
            "Mum, I'm already 14, can't I finally get a bra?!\n" +
                    "-\n" +
                    "NO Harold!"};

    public String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}

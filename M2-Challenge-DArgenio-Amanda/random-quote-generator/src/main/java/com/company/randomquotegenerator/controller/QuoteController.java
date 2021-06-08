package com.company.randomquotegenerator.controller;

import com.company.randomquotegenerator.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(idCounter++, "Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall."),
            new Quote(idCounter++, "Walt Disney", "The way to get started is to quit talking and begin doing."),
            new Quote(idCounter++, "Robert Louis Stevenson", " Don't judge each day by the harvest you reap but by the seeds that you plant."),
            new Quote(idCounter++, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn."),
            new Quote(idCounter++, "Babe Ruth", "Never let the fear of striking out keep you from playing the game."),
            new Quote(idCounter++, "Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma -- which is living with the results of other people's thinking."),
            new Quote(idCounter++, "Ayn Rand", "The question isn't who is going to let me; it's who is going to stop me."),
            new Quote(idCounter++, "Michel De Montaigne", "He who fears he will suffer, already suffers because he fears."),
            new Quote(idCounter++, "Thich Nhat Hanh", "The most precious gift we can offer others is our presence. When mindfulness embraces those we love, they will bloom like flowers."),
            new Quote(idCounter++, "Grace Hopper", "The most damaging phrase is, \"It's always been done this way\".")
    ));

    @GetMapping(value = "/quote")
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {

        int minIndex = 1;
        int maxIndex = quoteList.size();
        int randomIndex = (int) Math.floor(Math.random() * (maxIndex - minIndex + 1));
        int index;

        Quote result = quoteList.get(randomIndex);
        System.out.println(result);
        return result;

    }

    @GetMapping(value = "/all")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Quote> getAll() {

        return quoteList;
    }

}

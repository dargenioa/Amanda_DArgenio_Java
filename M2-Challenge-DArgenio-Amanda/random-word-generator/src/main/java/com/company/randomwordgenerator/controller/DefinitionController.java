package com.company.randomwordgenerator.controller;

import com.company.randomwordgenerator.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DefinitionController {

    private static int idCounter = 1;

    private static List<Definition> definitionsList = new ArrayList<>(Arrays.asList(
            new Definition(idCounter++, "Innovation", "The introduction of something new.  A new method, idea, product, etc."),
            new Definition(idCounter++, "Enjoin", "To direct or impose by authoritative order or with urgent admonition."),
            new Definition(idCounter++, "Aptitude", "A natural ability to do something."),
            new Definition(idCounter++, "Berserk", "Out of control with anger or excitement, wild or frenzied."),
            new Definition(idCounter++, "Random", "Made, done, happening, or chosen without method or conscious decision."),
            new Definition(idCounter++, "Wholesome", "Conductive to or suggestive of good health and physical well-being."),
            new Definition(idCounter++, "Computer", "An electronic device for storing and processing data, typically in a binary form, according to instructions given to it in a variable program."),
            new Definition(idCounter++, "Variable", "Not consistent or having a fixed patterns; liable to change."),
            new Definition(idCounter++, "Algorithm", "A process or set of rules to be followed in  calculations or other problem-solving operations, especially by a computer."),
            new Definition(idCounter++, "Opportunity", "A set of circumstances that makes it possible to do something")
    ));

    @GetMapping(value = "/word")
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomWord() {

        int minIndex = 1;
        int maxIndex = definitionsList.size();
        int randomIndex = (int) Math.floor(Math.random() * (maxIndex - minIndex + 1));

        Definition result = definitionsList.get(randomIndex);
        System.out.println(result);

        return result;
    }
}



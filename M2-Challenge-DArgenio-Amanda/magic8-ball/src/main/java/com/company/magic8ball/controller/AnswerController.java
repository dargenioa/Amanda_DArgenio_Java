package com.company.magic8ball.controller;


import com.company.magic8ball.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {

    private static int idCounter = 1;

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer(idCounter++, "Ask again later."),
            new Answer(idCounter++, "Without a doubt." ),
            new Answer(idCounter++, "It is decidedly so."),
            new Answer(idCounter++, "Yes, definitely."),
            new Answer(idCounter++, "Don't count on it."),
            new Answer(idCounter++, "Reply hazy, try again."),
            new Answer(idCounter++, "Signs point to yes."),
            new Answer(idCounter++, "Cannot predict now."),
            new Answer(idCounter++, "My sources say no."),
            new Answer(idCounter++, "Most likely.")
    ));

    @PostMapping(value = "/magic")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer askQuestion(@RequestBody Answer answer) {

        int minIndex = 1;
        int maxIndex = answerList.size();
        int randomIndex = (int)Math.floor(Math.random() * (maxIndex - minIndex + 1));

        Answer randomAnswer = answerList.get(randomIndex);
        String response = randomAnswer.getAnswer();
        int id = randomAnswer.getId();

        answer.getQuestion();
        answer.setAnswer(response);
        answer.setId(id);


        return answer;

    }
}

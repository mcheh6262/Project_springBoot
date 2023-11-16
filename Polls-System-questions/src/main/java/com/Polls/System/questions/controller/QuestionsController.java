package com.Polls.System.questions.controller;

import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.modle.QuestionsRequest;
import com.Polls.System.questions.modle.QuestionsResponse;
import com.Polls.System.questions.service.QuestionsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;
    @PostMapping
    public QuestionsResponse createQuestions(@RequestBody QuestionsRequest questionsRequest) {
         return questionsService.createQuestions(questionsRequest);

    }
    @DeleteMapping
    public String deleteQuestions(@RequestParam int id){
        questionsService.deleteQuestions(id);
        return "The question was deleted";
    }
    @PutMapping
    public String updateQuestions(@RequestParam int id, String question_title){
         questionsService.updateQuestions(id,question_title);
         return "The questions can be changed";
    }
    @GetMapping(value = "/id-question")
    Questions getQuestionsById(@RequestParam Integer id){
        return questionsService.getQuestionsById(id);
    };
    @GetMapping(value = "/all-question")
    List<Questions> getAllQuestions(){
        return questionsService.getAllQuestions();
    };

}

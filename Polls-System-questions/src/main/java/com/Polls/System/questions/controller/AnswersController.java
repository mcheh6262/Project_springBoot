package com.Polls.System.questions.controller;

import com.Polls.System.questions.modle.Answers;
import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswersController {

    @Autowired
    private AnswersService answersService;

    @PostMapping
    public Integer createAnswers(@RequestBody Answers answers){
        answersService.createAnswers(answers);
        return -1;
    }
    @DeleteMapping
    public String deleteAnswers(@RequestParam int id){
        answersService.deleteAnswers(id);
        return "The answer wad deleted";
    }
    @PutMapping
    public String updateAnswers(@RequestParam int id, String selected_answer){
         answersService.updateAnswers(id, selected_answer);
         return "The questions can be changed";
    }
    @GetMapping(value = "/answer")
    public Answers getAnswersById(@RequestBody Integer id){
        return answersService.getAnswersById(id);
    };
    @GetMapping(value = "/all")
    public List<Answers> getAllAnswers(){
        return answersService.getAllAnswers();
    };
    @GetMapping(value = "/id")
    Answers getSelectAnswerById(@RequestBody int question_id){
        return answersService.getSelectAnswerById(question_id);
    };
    @GetMapping(value = "/many")
    Answers getHowManyAnswersDidUserAnswer(@RequestParam int users_id, String selected_answer){
        return answersService.getHowManyAnswersDidUserAnswer(users_id, selected_answer);
    };
    @GetMapping(value = "/total")
    Answers getUsersAnswerQuestionTotal(@RequestParam int users_id, int question_id) {
        return answersService.getUsersAnswerQuestionTotal(users_id,question_id);
    };
    @GetMapping(value = "/submitted")
    Answers getUserAnswerSubmitted(int users_id) {
        return answersService.getUserAnswerSubmitted(users_id);
    };
}

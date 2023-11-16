package com.Polls.System.questions.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    private UsersApiService usersApiService;
    @GetMapping
    String getStringAnswersApiService(){
        return usersApiService.getStringFromUsersApiService();
    }

}

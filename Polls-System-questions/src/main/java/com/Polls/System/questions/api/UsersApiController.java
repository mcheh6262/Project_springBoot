package com.Polls.System.questions.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersApiController {

    @Autowired
    private UsersApiService userApiService;

    @GetMapping
    String getStringFromUsersApiService(){
        return userApiService.getStringFromUsersApiService();
    }
}

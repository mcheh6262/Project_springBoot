package com.Polls.System.questions.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "usersApi",
        url = "${users.url}"
)
public interface UsersApiService {
@GetMapping
    String getStringFromUsersApiService();

}

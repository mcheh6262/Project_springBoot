package com.Polls.System.questions.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "AnswersApiService",
        url = "$questions.url}"
)
public interface AnswersApiService {
    @GetMapping
    String getStringAnswersApiService();
}

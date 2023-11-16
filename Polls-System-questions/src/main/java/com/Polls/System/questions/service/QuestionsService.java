package com.Polls.System.questions.service;

import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.modle.QuestionsRequest;
import com.Polls.System.questions.modle.QuestionsResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface QuestionsService {
    QuestionsResponse createQuestions(QuestionsRequest questionsRequest);
    void deleteQuestions(int id);
    void updateQuestions(int id,String question_title);
    Questions getQuestionsById(Integer id);
    List<Questions> getAllQuestions();
}

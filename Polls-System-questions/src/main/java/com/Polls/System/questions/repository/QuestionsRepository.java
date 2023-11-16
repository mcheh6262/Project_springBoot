package com.Polls.System.questions.repository;

import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.modle.QuestionsRequest;

import java.util.List;

public interface QuestionsRepository {
    void createQuestions(Questions questions);
    void deleteQuestions(int id);
    void updateQuestions(int id, String question_title);
    Questions getQuestionsById(Integer id);
    List<Questions>getAllQuestions();


}

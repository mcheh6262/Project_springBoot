package com.Polls.System.questions.repository;

import com.Polls.System.questions.modle.Answers;
import com.Polls.System.questions.modle.Questions;

import java.util.List;

public interface AnswersRepository {
    void createAnswers(Answers answers);
    void deleteAnswers(int id);
    void updateAnswers(int id, String selected_answer);

    Answers getAnswersById(Integer id);
    List<Answers> getAllAnswers();
    Answers getSelectAnswerById(int question_id);
    Answers getHowManyAnswersDidUserAnswer(int users_id, String selected_answer);
    Answers getUsersAnswerQuestionTotal(int users_id, int question_id);
    Answers getUserAnswerSubmitted(int users_id);

}

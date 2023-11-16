package com.Polls.System.questions.service;

import com.Polls.System.questions.modle.Answers;
import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.repository.AnswersRepositoryIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswersServiceIml implements AnswersService{
    @Autowired
    AnswersRepositoryIml answersRepository;
    @Override
    public void createAnswers(Answers answers) {
        if (answers.getSelected_answer().isEmpty()){
            throw new IllegalArgumentException("Answer cannot be empty.");
        }else {
            answersRepository.createAnswers(answers);
        }


    }

    @Override
    public void deleteAnswers(int id) {
        answersRepository.deleteAnswers(id);

    }

    @Override
    public void updateAnswers(int id,String selected_answer) {
        answersRepository.updateAnswers(id,selected_answer);

    }

    @Override
    public Answers getAnswersById(Integer id) {
        return answersRepository.getAnswersById(id);
    }

    @Override
    public List<Answers> getAllAnswers() {
        return answersRepository.getAllAnswers();
    }

    @Override
    public Answers getSelectAnswerById(int question_id) {
        return answersRepository.getSelectAnswerById(question_id);
    }

    @Override
    public Answers getHowManyAnswersDidUserAnswer(int users_id, String selected_answer) {
        return answersRepository.getHowManyAnswersDidUserAnswer(users_id,selected_answer);
    }
    @Override
    public Answers getUsersAnswerQuestionTotal(int users_id, int question_id) {
        return answersRepository.getUsersAnswerQuestionTotal(users_id, question_id);
    }
    @Override
    public Answers getUserAnswerSubmitted(int users_id) {
        return answersRepository.getUserAnswerSubmitted(users_id);
    };


}

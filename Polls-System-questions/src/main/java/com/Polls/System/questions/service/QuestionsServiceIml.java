package com.Polls.System.questions.service;

import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.modle.QuestionsRequest;
import com.Polls.System.questions.modle.QuestionsResponse;
import com.Polls.System.questions.modle.Users;
import com.Polls.System.questions.repository.QuestionRepositoryIml;
import com.Polls.System.questions.repository.QuestionsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionsServiceIml implements QuestionsService{
    @Autowired
    private QuestionRepositoryIml questionRepository;

    @Override
    public QuestionsResponse createQuestions(QuestionsRequest questionsRequest) {
        Users users = questionsRequest.getUsers();
        QuestionsResponse questionsResponse = null;

        if (questionsRequest.getUsers().getId() != 0){
            questionRepository.createQuestions(questionsRequest.getQuestions());
            questionsResponse = new QuestionsResponse();
        }else {
            questionRepository.deleteQuestions(users.getId());
        }
        return questionsResponse;
    }
    @Override
    public void deleteQuestions(int id) {
        questionRepository.deleteQuestions(id);

    }

    @Override
    public void updateQuestions(int id,String question_title) {
        questionRepository.updateQuestions(id,question_title);

    }

    @Override
    public Questions getQuestionsById(Integer id) {
        return questionRepository.getQuestionsById(id);
    }

    @Override
    public List<Questions> getAllQuestions() {
       return questionRepository.getAllQuestions();
    }
}

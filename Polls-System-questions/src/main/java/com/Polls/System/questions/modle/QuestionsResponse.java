package com.Polls.System.questions.modle;

import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


public class QuestionsResponse {
    private Users users;
    private List questions;

    public QuestionsResponse(Users users, List questions) {
        this.users = users;
        this.questions = questions;
    }

    public QuestionsResponse() {


    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List getQuestions() {
        return questions;
    }

    public void setQuestions(List questions) {
        this.questions = questions;
    }
}

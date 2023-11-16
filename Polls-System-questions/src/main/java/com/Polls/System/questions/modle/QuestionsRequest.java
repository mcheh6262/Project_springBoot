package com.Polls.System.questions.modle;

public class QuestionsRequest {
    private Questions questions;
    private Users users;

    public QuestionsRequest(Questions questions, Users users) {
        this.questions = questions;
        this.users = users;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}

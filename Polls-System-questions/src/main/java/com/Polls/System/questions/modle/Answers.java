package com.Polls.System.questions.modle;

public class Answers {
    private int id;
    private int question_id;
    private int users_id;
   private String selected_answer;

    public Answers(int id, int question_id, int users_id, String selected_answer) {
        this.id = id;
        this.question_id = question_id;
        this.users_id = users_id;
        this.selected_answer = selected_answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public String getSelected_answer() {
        return selected_answer;
    }

    public void setSelected_answer(String selected_answer) {
        this.selected_answer = selected_answer;
    }
}

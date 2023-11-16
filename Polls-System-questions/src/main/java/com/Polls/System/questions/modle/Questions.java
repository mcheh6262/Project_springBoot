package com.Polls.System.questions.modle;

public class Questions {
    private int id;
    private String question_title;
    private String question_first_answer;
    private String question_second_answer;
    private String question_third_answer;
    private String question_fourth_answer;

    public Questions(int id, String question_title, String question_first_answer, String question_second_answer, String question_third_answer, String question_fourth_answer) {
        this.id = id;
        this.question_title = question_title;
        this.question_first_answer = question_first_answer;
        this.question_second_answer = question_second_answer;
        this.question_third_answer = question_third_answer;
        this.question_fourth_answer = question_fourth_answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public String getQuestion_first_answer() {
        return question_first_answer;
    }

    public void setQuestion_first_answer(String question_first_answer) {
        this.question_first_answer = question_first_answer;
    }

    public String getQuestion_second_answer() {
        return question_second_answer;
    }

    public void setQuestion_second_answer(String question_second_answer) {
        this.question_second_answer = question_second_answer;
    }

    public String getQuestion_third_answer() {
        return question_third_answer;
    }

    public void setQuestion_third_answer(String question_third_answer) {
        this.question_third_answer = question_third_answer;
    }

    public String getQuestion_fourth_answer() {
        return question_fourth_answer;
    }

    public void setQuestion_fourth_answer(String question_fourth_answer) {
        this.question_fourth_answer = question_fourth_answer;
    }
}

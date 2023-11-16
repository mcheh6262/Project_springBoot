package com.Polls.System.questions.repository;

import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.modle.Questions;
import com.Polls.System.questions.repository.mapper.QuestionsMapper;
import com.Polls.System.questions.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class QuestionRepositoryIml implements QuestionsRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createQuestions(Questions questions) {
        String sql = "INSERT INTO" + Constants.QUESTION_TABLE + "(question_title, question_first_answer, question_second_answer, question_third_answer, question_fourth_answer VALES (?,?,?,?,?)";
        jdbcTemplate.update(sql,questions.getQuestion_title(),questions.getQuestion_first_answer(),questions.getQuestion_second_answer(),questions.getQuestion_third_answer(),questions.getQuestion_fourth_answer());

    }

    @Override
    public void deleteQuestions(int id) {
        String sql = "DELETE FROM" + Constants.QUESTION_TABLE + "WHERE id = ?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public void updateQuestions(int id, String question_title) {
        String sql = "UPDATE" + Constants.QUESTION_TABLE + "SET question_title = ? WHERE id = ?";
        jdbcTemplate.update(sql,question_title,id);

    }

    @Override
    public Questions getQuestionsById(Integer id) {
        String sql = "SELECT * FROM" + Constants.QUESTION_TABLE + "WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new QuestionsMapper(),id);
    }

    @Override
    public List<Questions> getAllQuestions() {
        String sql = "SELECT * FROM" + Constants.QUESTION_TABLE;
        return jdbcTemplate.query(sql,new QuestionsMapper());
    }


}

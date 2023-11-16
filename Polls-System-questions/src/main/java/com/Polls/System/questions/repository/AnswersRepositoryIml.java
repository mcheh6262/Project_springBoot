package com.Polls.System.questions.repository;

import com.Polls.System.questions.modle.Answers;
import com.Polls.System.questions.repository.mapper.AnswersMapper;
import com.Polls.System.questions.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AnswersRepositoryIml implements AnswersRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createAnswers(Answers answers) {
        String sql = "INSERT INTO" + Constants.ANSWERS_TABLE + "(question_id, users_id, selected_answer) VALUES (?,?,?)";
        jdbcTemplate.update(sql,answers.getQuestion_id(), answers.getUsers_id(),answers.getSelected_answer());
    }


    @Override
    public void deleteAnswers(int id) {
        String sql = "DELETE FROM" + Constants.ANSWERS_TABLE + " WHERE id = ?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public void updateAnswers(int id, String selected_answer) {
        String sql = "UPDATE" + Constants.ANSWERS_TABLE + "SET question_title = ? WHERE id = ?";
        jdbcTemplate.update(sql, id, selected_answer);

    }

    @Override
    public Answers getAnswersById(Integer id) {
        String sql = "SELECT * FROM" + Constants.ANSWERS_TABLE + "WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new AnswersMapper(),id);
    }

    @Override
    public List<Answers> getAllAnswers() {
        String sql = "SELECT * FROM " + Constants.ANSWERS_TABLE;
        return jdbcTemplate.query(sql,new AnswersMapper());
    }

    @Override
    public Answers getSelectAnswerById(int question_id) {
        String sql = "SELECT * FROM " + Constants.ANSWERS_TABLE + "WHERE question_id = ?";
        return jdbcTemplate.queryForObject(sql,new AnswersMapper(),question_id);
    }

    @Override
    public Answers getHowManyAnswersDidUserAnswer(int users_id, String selected_answer) {
        String sql = "SELECT COUNT(*)" + Constants.ANSWERS_TABLE + "FROM answer WHERE user_id = ? selected_answer = ?";
        return jdbcTemplate.queryForObject(sql,new AnswersMapper(),users_id,selected_answer);
    }

    public Answers getUsersAnswerQuestionTotal(int users_id, int question_id){
        String sql = "SELECT COUNT(*) AS" + Constants.ANSWERS_TABLE + "FROM users_id = ? WHERE question_id = ?";
        return jdbcTemplate.queryForObject(sql,new AnswersMapper(),users_id,question_id);
    }
    public Answers getUserAnswerSubmitted(int users_id){
        String sql = "SELECT question_id, selected_answer FROM" + Constants.ANSWERS_TABLE + "WHERE users_id = ?";
        return jdbcTemplate.queryForObject(sql,new AnswersMapper(),users_id);
    }


}

package com.Polls.System.questions.repository.mapper;

import com.Polls.System.questions.modle.Questions;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionsMapper implements RowMapper<Questions> {
    @Override
    public Questions mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Questions(
                rs.getInt("id"),
                rs.getString("question_title"),
                rs.getString("question_first_answer"),
                rs.getString("question_second_answer"),
                rs.getString("question_third_answer"),
                rs.getString("question_fourth_answer")
        );
    }
}

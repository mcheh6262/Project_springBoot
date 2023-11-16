package com.Polls.System.questions.repository.mapper;

import com.Polls.System.questions.modle.Answers;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersMapper implements RowMapper<Answers> {
    @Override
    public Answers mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Answers(
                rs.getInt("id"),
                rs.getInt("question_id"),
                rs.getInt("users_id"),
                rs.getString("selected_answer")
        );
    }
}

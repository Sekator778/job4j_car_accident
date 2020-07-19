package ru.job4j.accident.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.accident.model.Accident;

import java.util.List;

/**
 * repository class for work with DB using JdbcTemplate
 * through layer JdbcConfig where read properties and init pool
 */
//@Repository
public class AccidentJdbcTemplate {
    private final JdbcTemplate jdbcTemplate;

    public AccidentJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Accident addAccident(Accident accident) {
        jdbcTemplate.update("INSERT INTO accident(name) values (?)", accident.getName());
        return accident;
    }

    @Transactional(readOnly = true)
    public List<Accident> findAll() {
        return jdbcTemplate.query("SElECT * from accident",
                (resultSet, row) -> {
                    Accident accident = new Accident();
                    accident.setId(resultSet.getInt("id"));
                    accident.setName(resultSet.getString("name"));
                    accident.setText(resultSet.getString("text"));
                    accident.setAddress(resultSet.getString("address"));
                    return accident;
                });
    }
}

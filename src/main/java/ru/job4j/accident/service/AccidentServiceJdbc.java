package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentJdbcTemplate;

import java.util.List;

/**
 *
 */
//@Service
public class AccidentServiceJdbc implements AccidentService {
    private final AccidentJdbcTemplate jdbc;

    public AccidentServiceJdbc(AccidentJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Accident> findAll() {
        return jdbc.findAll();
    }

    @Override
    public Accident addAccident(Accident accident) {
        return jdbc.addAccident(accident);
    }

    @Override
    public void deleteAccident(Accident accident) {

    }
}

package ru.job4j.accident.service;

import ru.job4j.accident.model.Accident;

import java.util.List;

public interface AccidentService {
    List<Accident> findAll();
    Accident addAccident(Accident accident);
    void deleteAccident(Accident accident);
}

package ru.job4j.accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.HashMap;

/**
 *
 */
@Repository
public class AccidentMem {
    private HashMap<Integer, Accident> accidents;
    public boolean addAccident(Accident accident) {
        return accidents.put(accident.getId(), accident) != null;
    }
    public boolean removeAccident(Accident accident) {
        return accidents.remove(accident) != null;
    }
    private void init() {
//        Accident accident = new Accident()
    }
}

package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

import java.util.List;

/**
 * service to receive and work accident
 */
//@Service
public class AccidentServiceMem {
    private final AccidentMem mem;

    public AccidentServiceMem(AccidentMem mem) {
        this.mem = mem;
    }

    /**
     * method return all accidents
     * @return list accidents
     */
    public List<Accident> findAll(){
        return mem.findAll();
    }

}

package ru.job4j.accident.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;

import java.util.List;

/**
 *
 */
@Service
public class AccidentServiceHbm implements AccidentService {
    private final AccidentHibernate hibernate;
    private final Logger LOG = LogManager.getLogger(AccidentServiceHbm.class.getName());

    public AccidentServiceHbm(AccidentHibernate hibernate) {
        this.hibernate = hibernate;
    }

    @Override
    public Accident addAccident(Accident accident) {
        LOG.info("model save to DB");
        return hibernate.addAccident(accident);
    }

    @Override
    public void deleteAccident(Accident accident) {
        hibernate.deleteAccident(accident);

    }

    @Override
    public List<Accident> findAll() {
        return hibernate.findAll();
    }
}

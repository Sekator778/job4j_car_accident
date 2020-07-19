package ru.job4j.accident.repository;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.accident.model.Accident;

import java.util.List;

@Repository
public class AccidentHibernate {
    private final SessionFactory sessionFactory;
    private final Logger LOG = LogManager.getLogger(AccidentHibernate.class.getName());


    public AccidentHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Accident addAccident(Accident accident) {
        try (Session session = sessionFactory.openSession()) {
            session.save(accident);
            return accident;
        } catch (Exception e) {
            LOG.error("session cannot saved", e);
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<Accident> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session
                    .createQuery("from Accident", Accident.class)
                    .list();
        }
    }
    public void deleteAccident(Accident accident) {
        try(Session session = sessionFactory.openSession()) {
            session.delete(accident);
        }
    }
}
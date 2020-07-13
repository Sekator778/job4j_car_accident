package ru.job4j.accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.*;

/**
 * repository all accident
 */
@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents;

    public AccidentMem() {
        accidents = new HashMap<Integer, Accident>();
        init();
    }

    /**
     * Method add new accident
     *
     * @param accident - new accident
     * @return = true if success
     */
    public boolean addAccident(Accident accident) {
        return accidents.put(accident.getId(), accident) != null;
    }

    /**
     * remove accident
     */
    public boolean removeAccident(Accident accident) {
        return accidents.remove(accident) != null;
    }

    /**
     * method for fill in store
     */
    private void init() {
        Accident accident1 = new Accident(1, "Bob", "some accident speed over limit", "Kytyzova 15");
        Accident accident2 = new Accident(2, "Garson", "easy accident cross two white lane", "Korolyova 26");
        Accident accident3 = new Accident(3, "Karlson", "hard accident riding without a belt", "Koshkina 7");
        addAccident(accident1);
        addAccident(accident2);
        addAccident(accident3);
    }

    /**
     * @return list all accidents
     */
    public List<Accident> findAll() {
        return new ArrayList<Accident>(accidents.values());
    }
}

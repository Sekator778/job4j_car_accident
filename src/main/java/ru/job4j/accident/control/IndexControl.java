package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;
import ru.job4j.accident.repository.AccidentJdbcTemplate;

import java.util.List;

/**
 * Обработкой вида будет заниматься контроллер. Это обычный класс с особыми аннотациями.
 * Spring сканирует проект и регистрирует этот контроллер. Когда на Dispacher приходит запрос, он ищет подходящий контроллер.
 *
 * Метод index возвращает имя вида без расширения.
 */
@Controller
public class IndexControl {
    private final AccidentHibernate service;

    public IndexControl(AccidentHibernate service) {
        this.service = service;
    }


    /**
     * method register list accidents for display index.jsp
     * @param model - accident
     * @return - list accident how "ACCIDENTS"
     */
    @GetMapping("/")
    public String index(Model model) {
        List<Accident> accidents = service.findAll();
        model.addAttribute("ACCIDENTS", accidents);
        return "index";
    }
}

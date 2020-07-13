package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Обработкой вида будет заниматься контроллер. Это обычный класс с особыми аннотациями.
 * Spring сканирует проект и регистрирует этот контроллер. Когда на Dispacher приходит запрос, он ищет подходящий контроллер.
 *
 * Метод index возвращает имя вида без расширения.
 */
@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}

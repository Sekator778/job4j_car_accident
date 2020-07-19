package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.service.AccidentServiceHbm;

@Controller
public class AccidentControl {
    private final AccidentServiceHbm accidents;

    public AccidentControl(AccidentServiceHbm accidents) {
        this.accidents = accidents;
    }
    @GetMapping("/create")
    public String create() {
        return "accident/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.addAccident(accident);
        return "redirect:/";
    }
    @GetMapping("/edit")
    public String edit() {
        return "accident/edit";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute Accident accident) {
        accidents.deleteAccident(accident);
        return "redirect:/";
    }
}

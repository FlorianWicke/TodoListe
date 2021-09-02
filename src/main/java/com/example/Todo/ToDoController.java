package com.example.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ToDoController {
    List toDoListe = new ArrayList();

    @GetMapping("/")
    public String index(Model model) {
        ToDo eins = new ToDo();
        eins.setInhalt("Gemüse einkaufen");
        ToDo zwei = new ToDo();
        zwei.setInhalt("Hausaufgaben machen");
        toDoListe.add(eins);
        toDoListe.add(zwei);
        model.addAttribute("todoliste", toDoListe);
        return "Startseite";
    }

    @GetMapping("/todo")
    public String todo(Model model) {
        ToDo eins = new ToDo();
        eins.setInhalt("Gemüse einkaufen");
        model.addAttribute("todo", eins);
        return "todo";
    }

    @PostMapping("/todosubmit")
    public String ideeSubmit(@ModelAttribute ToDo todo, Model model) {
        toDoListe.add(todo);
        model.addAttribute("todo", todo );
        return "todosubmit";
    }

    @PostMapping("/todochange")
    public String todoChange(@ModelAttribute ToDo todo, Model model) {
        todo.setDone(true);
        return "redirect:/";
    }

    @GetMapping("/todoanzeigen")
    public String ideeAnzeigen(Model model) {
        ToDo eins = new ToDo();
        eins.setInhalt("Gemüse einkaufen");
        ToDo zwei = new ToDo();
        zwei.setInhalt("Hausaufgaben machen");
        toDoListe.add(eins);
        toDoListe.add(zwei);
        model.addAttribute("todoliste", toDoListe);
        return "todoanzeigen";
    }

}

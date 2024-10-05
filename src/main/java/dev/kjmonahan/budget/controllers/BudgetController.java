package dev.kjmonahan.budget.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BudgetController {

    // Homepage
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Budget Tracker");
        return "home.html";
    }
}

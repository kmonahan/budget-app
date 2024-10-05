package dev.kjmonahan.budget.controllers;

import dev.kjmonahan.budget.data.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BudgetController {
    @Autowired
    private ExpenseRepository expenseRepository;

    // Homepage
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Budget Tracker");
        model.addAttribute("allExpenses", expenseRepository.findAll());
        return "home";
    }

}

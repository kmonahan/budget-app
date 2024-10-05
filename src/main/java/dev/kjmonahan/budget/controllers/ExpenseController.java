package dev.kjmonahan.budget.controllers;

import dev.kjmonahan.budget.data.ExpenseRepository;
import dev.kjmonahan.budget.models.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("expenses")
public class ExpenseController {
    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("add")
    public String renderAddExpense(Model model) {
        model.addAttribute("expense", new Expense());
        return "add-expense";
    }

    @PostMapping("add")
    public String processAddExpense(@ModelAttribute Expense newExpense) {
        expenseRepository.save(newExpense);
        return "redirect:/";
    }
}

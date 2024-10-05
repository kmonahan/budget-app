package dev.kjmonahan.budget.controllers;

import dev.kjmonahan.budget.data.CategoryRepository;
import dev.kjmonahan.budget.models.Category;
import dev.kjmonahan.budget.models.CategoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("add")
    public String renderAddCategory(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("types", CategoryType.values());
        return "add-category";
    }

    @PostMapping("add")
    public String createCategory(@ModelAttribute Category newCategory) {
        categoryRepository.save(newCategory);
        return "redirect:/";
    }
}

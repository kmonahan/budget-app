package dev.kjmonahan.budget.data;

import dev.kjmonahan.budget.models.Expense;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExpenseData {
    private static final Map<Integer, Expense> expenses = new HashMap<>();

    public static Collection<Expense> getAll() {
        return expenses.values();
    }

    public static void add(Expense expense) {
        expenses.put(expense.getId(), expense);
    }

    public static Expense getById(Integer id) {
        return expenses.get(id);
    }

    public static void remove(Integer id) {
        expenses.remove(id);
    }
}

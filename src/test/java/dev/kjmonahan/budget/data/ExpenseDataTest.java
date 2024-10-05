package dev.kjmonahan.budget.data;

import dev.kjmonahan.budget.models.Expense;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseDataTest {
    Expense expense;

    @BeforeEach
    public void createExpense() {
        expense = new Expense(13, new Date(), "Test Payee", "Test Category");
    }

    @Test
    void add() {
        ExpenseData.add(expense);
        assertTrue(ExpenseData.getAll().contains(expense));
    }

    @Test
    void getById() {
        ExpenseData.add(expense);
        assertEquals(ExpenseData.getById(expense.getId()), expense);
    }

    @Test
    void remove() {
        ExpenseData.remove(expense.getId());
        assertFalse(ExpenseData.getAll().contains(expense));
    }
}
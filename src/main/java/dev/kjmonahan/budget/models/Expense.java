package dev.kjmonahan.budget.models;

import java.util.Date;

public class Expense {
    private int id;
    private static int nextId = 1;
    private double amount;
    private Date transationDate;
    private String payee;
    private String category;
    private String note;
    private boolean cleared;

    public Expense(double amount, Date transationDate, String payee, String category, String note, boolean cleared) {
        this.id = nextId;
        nextId++;
        this.amount = amount;
        this.transationDate = transationDate;
        this.payee = payee;
        this.category = category;
        this.note = note;
        this.cleared = cleared;
    }

    public Expense(double amount, Date transationDate, String payee, String category) {
        this(amount, transationDate, payee, category, "", false);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransationDate() {
        return transationDate;
    }

    public void setTransationDate(Date transationDate) {
        this.transationDate = transationDate;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense expense = (Expense) o;
        return getId() == expense.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}

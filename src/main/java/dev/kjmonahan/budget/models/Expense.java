package dev.kjmonahan.budget.models;

import jakarta.persistence.Entity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Expense extends AbstractEntity {
    private double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date transactionDate;
    private String payee;
    private String category;
    private String note;
    private boolean isCleared;

    public Expense() {
    }

    public Expense(double amount, Date transactionDate, String payee, String category, String note, boolean isCleared) {
        this();
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.payee = payee;
        this.category = category;
        this.note = note;
        this.isCleared = isCleared;
    }

    public Expense(double amount, Date transactionDate, String payee, String category) {
        this(amount, transactionDate, payee, category, "", false);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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

    public boolean getIsCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        this.isCleared = cleared;
    }
}

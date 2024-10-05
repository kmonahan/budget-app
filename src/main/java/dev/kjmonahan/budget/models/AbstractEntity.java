package dev.kjmonahan.budget.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
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

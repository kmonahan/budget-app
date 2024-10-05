package dev.kjmonahan.budget.models;

import jakarta.persistence.Entity;

@Entity
public class Category extends AbstractEntity{
    private String name;
    private CategoryType type;

    public Category() {}

    public Category(String name, CategoryType type) {
        this();
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryType getType() {
        return type;
    }

    public void setType(CategoryType type) {
        this.type = type;
    }
}

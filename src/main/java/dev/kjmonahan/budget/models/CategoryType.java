package dev.kjmonahan.budget.models;

public enum CategoryType {
    SAVING_LONG("Saving (Long-term)"),
    SAVING_SHORT("Saving (Short/medium-term)"),
    GIVING("Giving"),
    SPENDING("Spending");

    private final String displayName;

    CategoryType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

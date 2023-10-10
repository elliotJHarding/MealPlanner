package com.harding.mealplanner.domain;

public class Recipe {
    private String name;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

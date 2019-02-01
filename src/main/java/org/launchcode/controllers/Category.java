package org.launchcode.controllers;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Category {
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    public Category() {
    }

    public Category(String name){

    }
}

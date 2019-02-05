package org.launchcode.models;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Menu {

    private String name;

    private int id;

    private List<Cheese> cheeses;
}

package com.example.grid;

public class Player {
    private String Name;
    private int Resource;

    public Player(String name, int resource) {
        Name = name;
        Resource = resource;
    }

    public String getName() {
        return Name;
    }

    public int getResource() {
        return Resource;
    }

}

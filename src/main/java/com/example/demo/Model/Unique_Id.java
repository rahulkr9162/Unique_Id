package com.example.demo.Model;

public class Unique_Id {
    private int id;
    private String name;

    public Unique_Id() {
    }

    public Unique_Id(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

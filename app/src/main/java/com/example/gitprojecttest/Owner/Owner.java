package com.example.gitprojecttest.Owner;

public class Owner {
    private String name;
    private String address;
    private double budget;

    public Owner() {
    }

    public Owner(String name, String address, double budget) {
        this.name = name;
        this.address = address;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

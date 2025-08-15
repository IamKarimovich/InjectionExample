package com.ruslandev.injectionexample.setter.injection.example;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("car details " + specification.toString());
    }

}

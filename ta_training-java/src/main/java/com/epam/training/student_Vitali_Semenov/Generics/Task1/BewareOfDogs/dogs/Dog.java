package com.epam.training.student_Vitali_Semenov.Generics.Task1.BewareOfDogs.dogs;

public class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}

package com.epam.training.student_Vitali_Semenov.Generics.Task1.BewareOfDogs.cats;

public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}

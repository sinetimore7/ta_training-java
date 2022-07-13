package com.epam.training.student_Vitali_Semenov.Generics.Task1.BewareOfDogs.cats;

public class Kitten extends Cat{
    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}

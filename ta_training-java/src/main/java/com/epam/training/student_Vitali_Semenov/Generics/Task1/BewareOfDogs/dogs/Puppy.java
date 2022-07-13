package com.epam.training.student_Vitali_Semenov.Generics.Task1.BewareOfDogs.dogs;

public class Puppy extends Dog{
    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}

package com.epam.training.student_Vitali_Semenov.OOPBasics.Task3.DecrementingCarouselWithLimit;

import java.util.ArrayList;
import java.util.List;

public class DecrementingCarousel {
    public final int capacity;
    public List<Integer> listAdd = new ArrayList<>();
    public boolean condition = true;
    public boolean statusOfRun = true;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addElement(int element){
        if (element > 0 && listAdd.size() < capacity && condition){
            listAdd.add(element);
            return true;
        } else {
            return false;
        }
    }

    public CarouselRun run(){
        if (statusOfRun) {
            CarouselRun run = new CarouselRun();
            run.listRun = listAdd;
            condition = false;
            statusOfRun = false;
            run.typeOfCarousel = 1;
            return run;
        } else {
            return null;
        }
    }
}

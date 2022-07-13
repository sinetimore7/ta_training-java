package com.epam.training.student_Vitali_Semenov.Classes.Task4.DecrementingCarousel;

import java.util.ArrayList;
import java.util.List;

public class DecrementingCarousel {
    private final int capacity;
    public List<Integer> listAdd = new ArrayList<>();
    private boolean condition = true;
    private boolean statusOfRun = true;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
    }
    public boolean addElement(int element){
        if (element > 0 && listAdd.size() < capacity && condition == true){
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
            return run;
        } else {
            return null;
        }
    }
}

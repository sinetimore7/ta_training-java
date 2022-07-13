package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task1.TaskCarousel;

public class CountDownTask implements Task{
    public int value;
    public boolean statusOfTask = true;
    public CountDownTask(int value) {
        if (value > 0) {
            this.value = value;
        } else {
            this.value = 0;
            statusOfTask = false;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute() {
        if (statusOfTask){
            value--;
        }
        if (value == 0){
            statusOfTask = false;
        }
    }

    @Override
    public boolean isFinished() {
        if (statusOfTask){
            return false;
        } else return true;
    }
}

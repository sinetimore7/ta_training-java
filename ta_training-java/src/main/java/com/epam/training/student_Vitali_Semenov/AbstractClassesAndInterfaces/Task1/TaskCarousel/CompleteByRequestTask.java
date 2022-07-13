package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task1.TaskCarousel;

public class CompleteByRequestTask implements Task{
    public boolean statusOfTask = true;
    public boolean completeStatus = true;
    @Override
    public void execute() {
        if (!completeStatus) {
            statusOfTask = false;
        }
    }

    @Override
    public boolean isFinished() {
        if (statusOfTask){
            return false;
        } else return true;
    }

    public void complete() {
        completeStatus = false;
    }
}

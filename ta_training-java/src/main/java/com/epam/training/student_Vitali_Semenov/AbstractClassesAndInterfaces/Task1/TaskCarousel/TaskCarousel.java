package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task1.TaskCarousel;

import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {
    List<Task> list = new ArrayList<>();
    int positionOfTask = 0;
    int capasity;
    public TaskCarousel(int capacity) {
        this.capasity = capacity;
    }

    public boolean addTask(Task task) {
        if (task.isFinished() || list.size() == capasity){
            return false;
        } else {
            list.add(task);
            return true;
        }
    }

    public boolean execute() {
        if (positionOfTask >= list.size()){
            positionOfTask = 0;
        }
        if (!list.isEmpty()){
            list.get(positionOfTask).execute();
            if (list.get(positionOfTask).isFinished()){
                list.remove(positionOfTask);
                positionOfTask--;
            }
            positionOfTask++;
            return true;
        } else return false;
    }

    public boolean isFull() {
        if (list.size() == capasity){
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

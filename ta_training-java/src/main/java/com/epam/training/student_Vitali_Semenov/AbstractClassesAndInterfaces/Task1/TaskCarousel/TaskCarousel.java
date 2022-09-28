package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task1.TaskCarousel;

import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {
    List<Task> list = new ArrayList<>();
    int positionOfTask = 0;
    int capacity;
    public TaskCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addTask(Task task) {
        if (task.isFinished() || list.size() == capacity){
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
        return list.size() == capacity;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

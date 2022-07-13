package com.epam.training.student_Vitali_Semenov.Classes.Task4.DecrementingCarousel;

import java.util.ArrayList;
import java.util.List;

public class CarouselRun {
    List<Integer> listRun = new ArrayList<>();
    int positionOfElement = 0;
    int returnElement;

    public int next() {
        if (listRun.size() > 0){
            int resultLoop = 0;
            for (int i : listRun){
                if (i >= 1){
                    resultLoop++;
                    break;
                }
            }
            if (resultLoop == 0){
                returnElement = -1;
            } else {
                for (int i = 0; i < listRun.size(); i++) {
                    if (positionOfElement == listRun.size()) {
                        positionOfElement = 0;
                    }
                    if (listRun.get(positionOfElement) >= 1) {
                        returnElement = listRun.get(positionOfElement);
                        listRun.set(positionOfElement, listRun.get(positionOfElement) - 1);
                        positionOfElement++;
                        break;
                    } else {
                        positionOfElement++;
                    }
                }
            }
        } else {
            returnElement = -1;
        }
        return returnElement;
    }

    public boolean isFinished() {
        boolean result = true;
        for (int i : listRun){
            if (i >= 1){
                result = false;
                break;
            }
        }
        return result;
    }
}

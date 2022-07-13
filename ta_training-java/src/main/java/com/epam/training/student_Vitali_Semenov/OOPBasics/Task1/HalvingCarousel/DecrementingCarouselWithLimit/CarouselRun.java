package com.epam.training.student_Vitali_Semenov.OOPBasics.Task1.HalvingCarousel.DecrementingCarouselWithLimit;

import java.util.ArrayList;
import java.util.List;

public class CarouselRun {
    List<Integer> listRun = new ArrayList<>();
    int positionOfElement = 0;
    int returnElement;
    int typeOfCarousel;
    int numberOfCircles = 1;
    int runLimit;
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
                        numberOfCircles++;
                    }
                    if (listRun.get(positionOfElement) >= 1) {
                        if (typeOfCarousel == 1) {
                            returnElement = listRun.get(positionOfElement);
                            listRun.set(positionOfElement, listRun.get(positionOfElement) - 1);
                            positionOfElement++;
                            break;
                        } else if (typeOfCarousel == 2){
                            if (runLimit > 0) {
                                returnElement = listRun.get(positionOfElement);
                                listRun.set(positionOfElement, listRun.get(positionOfElement) - 1);
                                positionOfElement++;
                                runLimit--;
                                break;
                            } else {
                                returnElement = -1;
                            }
                        }
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
        if (typeOfCarousel == 1){
            for (int i : listRun) {
                if (i >= 1) {
                    result = false;
                    break;
                }
            }
        } else {
            if (runLimit > 0) {
                for (int i : listRun) {
                    if (i >= 1) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}

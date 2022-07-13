package com.epam.training.student_Vitali_Semenov.OOPBasics.Task1.HalvingCarousel;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run() {
        if (super.statusOfRun) {
            CarouselRun run = new CarouselRun();
            run.listRun = listAdd;
            condition = false;
            statusOfRun = false;
            run.typeOfCarousel = 2;
            return run;
        } else {
            return null;
        }
    }
}

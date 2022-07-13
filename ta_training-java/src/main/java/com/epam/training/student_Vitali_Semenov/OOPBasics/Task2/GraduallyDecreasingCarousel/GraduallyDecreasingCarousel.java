package com.epam.training.student_Vitali_Semenov.OOPBasics.Task2.GraduallyDecreasingCarousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
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

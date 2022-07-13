package com.epam.training.student_Vitali_Semenov.OOPBasics.Task1.HalvingCarousel.DecrementingCarouselWithLimit;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    public final int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }

    @Override
    public CarouselRun run() {
        if (super.statusOfRun) {
            CarouselRun run = new CarouselRun();
            run.listRun = listAdd;
            condition = false;
            statusOfRun = false;
            run.typeOfCarousel = 2;
            run.runLimit = actionLimit;
            return run;
        } else {
            return null;
        }
    }
}

package com.epam.training.student_Vitali_Semenov.Optional.Task1.OptionalMax;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        if (values != null && values.length > 0){
            int max = values[0];
            for (int i: values){
                if (i > max){
                    max = i;
                }
            }
            result = OptionalInt.of(max);
        } else result = OptionalInt.empty();
        return result;
    }
}

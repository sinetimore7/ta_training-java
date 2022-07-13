package com.epam.training.student_Vitali_Semenov.String.Task2.ColorCodeValidation;

import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color != null){
            if (color.length() == 7){
                String color1 = color.toUpperCase();
                Pattern pat = Pattern.compile("\\#([0-9]|[A-F]){6}");
                if (Pattern.matches(String.valueOf(pat), color1)) return true;
                else return false;
            } else if (color.length() == 4) {
                String color1 = color.toUpperCase();
                Pattern pat = Pattern.compile("\\#([0-9]|[A-F]){3}");
                if (Pattern.matches(String.valueOf(pat), color1)) return true;
                else return false;
            }
            else return false;
        } else return false;
    }
}

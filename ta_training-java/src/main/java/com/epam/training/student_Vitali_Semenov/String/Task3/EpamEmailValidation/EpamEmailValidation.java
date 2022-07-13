package com.epam.training.student_Vitali_Semenov.String.Task3.EpamEmailValidation;

import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        if (email != null){
            Pattern pat = Pattern.compile("[a-z]+\\_[a-z]+[1-9]?\\@epam\\.com");
            if (Pattern.matches(String.valueOf(pat), email)){
                return true;
            } else return false;
        } else return false;
    }
}

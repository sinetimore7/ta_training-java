package com.epam.training.student_Vitali_Semenov.String.Task1.Words;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        int result = 0;
        if (sample != null && !sample.equals("") && words != null && words.length != 0) {
            Pattern pat = Pattern.compile(sample.trim().toLowerCase());
            for (String word : words) {
                word = word.trim();
                if (Pattern.matches(String.valueOf(pat), word.toLowerCase())) {
                    result++;
                }
            }
        }
        return result;
    }

    public static String[] splitWords(String text) {
        if (text == null || text.equals("")){
            return null;
        } else {
            Pattern pat = Pattern.compile("[ ,.;:?!]+");
            Matcher mat = pat.matcher(text);
            String onlyWordsWithSpace = mat.replaceAll(" ");
            if (!Pattern.matches(String.valueOf(pat), text)){
                return pat.split(onlyWordsWithSpace.trim());
            } else return null;
        }
    }

    public static String convertPath(String path, boolean toWin) {
        if (path != null && path.length() > 0){
            Pattern pat1 = Pattern.compile("~");
            Matcher mat1 = pat1.matcher(path);
            Pattern pat2 = Pattern.compile("C:");
            Matcher mat2 = pat2.matcher(path);
            Pattern pat3 = Pattern.compile("/");
            Matcher mat3 = pat3.matcher(path);
            Pattern pat4 = Pattern.compile("\\\\");
            Matcher mat4 = pat4.matcher(path);

            if (path.equals(".") || path.equals("..")) return path;
            else if (path.equals("/") && toWin) return  "C:\\";
            else if (path.equals("/") && !toWin) return path;
            else if (path.equals("~") && toWin) return  "C:\\User";
            else if (path.equals("~") && !toWin) return path;
            else if (path.equals("~/") && toWin) return "C:\\User\\";
            else if (path.equals("~/") && !toWin) return path;
            else if (path.equals("C:\\User") && toWin) return path;
            else if (path.equals("C:\\User") && !toWin) return "~";
            else if (path.equals("C:\\") && toWin) return path;
            else if (path.equals("C:\\") && !toWin) return "/";
            else if (path.equals("C:\\User\\") && toWin) return path;
            else if (path.equals("C:\\User\\") && !toWin) return "~/";
            else if (mat1.find(1) || mat2.find(2)) return null;
            else if (mat1.find(0) && mat2.find(0)) return null;
            else if (mat3.find(0) && mat4.find(0)) return null;
            else if (mat1.find(0) && mat4.find(0)) return null;
            else if (mat2.find(0) && mat3.find(0)) return null;
            else if (mat3.find(0)){
                if (!toWin) return path;
                else {
                    String[] array = pat3.split(path);
                    StringBuilder result = new StringBuilder();
                    if (array[0].equals("~")) array[0] = "C:\\User";
                    if (array[0].equals("")) array[0] = "C:";
                    for (int i = 0; i < array.length -1; i++) {
                        result.append(array[i]).append("\\");
                    }
                    result.append(array[array.length - 1]);
                    if (path.charAt(path.length() - 1) == '/') result.append("\\");
                    return result.toString();
                }
            }
            else if (mat4.find(0)) {
                if (toWin) return path;
                else {
                    String[] array = pat4.split(path);
                    StringBuilder result = new StringBuilder();
                    if (array[0].equals("C:") && array[1].equals("User")){
                        array[0] = null;
                        array[1] = "~";
                    } else if (array[0].equals("C:")) array[0] = "";
                    for (int i = 0; i < array.length -1; i++) {
                        if (array[i] != null) result.append(array[i]).append("/");
                    }
                    result.append(array[array.length - 1]);
                    if (path.charAt(path.length() - 1) == '\\') result.append("/");
                    return result.toString();
                }
            } else return path;
        } else return null;
    }

    public static String joinWords(String[] words) {
        if (words != null){
            if (words.length == 0) return null;
            StringJoiner joiner = new StringJoiner(", ", "[", "]");
            for (String s: words){
                if (!s.equals("")){
                    joiner.add(s);
                }
            }
            if (joiner.length() > 2) return joiner.toString();
            else return null;
        } else return null;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}

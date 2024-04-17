package ru.spb.string;

public class TaskFour {

    public void countChars(String str) {
        int[] charCounts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }

}

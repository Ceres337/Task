package ru.spb.string;

public class TaskTwo {

    public int countingWords(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }
}

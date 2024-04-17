package ru.spb.string;

public class TaskThree {

    public long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

}

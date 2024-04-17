package ru.spb.string;

public class TaskFive {
    public int countMatches(String text, String str)
    {
        return text.split(str, -1).length - 1;
    }
}

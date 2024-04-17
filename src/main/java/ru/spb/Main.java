package ru.spb;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import ru.spb.string.*;

public class Main {
    public static void main(String[] args) {

//        JUnitCore junit = new JUnitCore();
//        junit.addListener(new TextListener(System.out));
//        junit.run(RandomStringTest.class);

        RandomString taskOne = new RandomString();
        System.out.println(taskOne.generateRandomString(-5));

        TaskTwo taskTwo = new TaskTwo();
        System.out.println(taskTwo.countingWords("Hello world gfg rgrg"));

        TaskThree taskThree = new TaskThree();
        System.out.println(taskThree.countOccurrences("HelloHelloHelloHello", 'H'));

        TaskFour taskFour = new TaskFour();
        taskFour.countChars("Hello hello");

        TaskFive taskFive = new TaskFive();
        System.out.println(taskFive.countMatches("Hello ikhnbh bnjkllobnl", "llo"));

    }
}
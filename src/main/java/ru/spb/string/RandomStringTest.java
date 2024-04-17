package ru.spb.string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RandomStringTest {

    @Test
    public void testOne() {
        int programsOne = -5;
        RandomString taskOne = new RandomString();
        assertEquals("Значение отрицательно, введите положительно число больше 0", taskOne.generateRandomString(programsOne));
    }
    @Test
    public void testTwo() {
        int programsTwo = 0;
        RandomString taskOne = new RandomString();
        assertEquals("Значение пустон, введите положительно число больше 0", taskOne.generateRandomString(programsTwo));
    }

    @Test
    public void testThree() {
        int programsThree = 15;
        RandomString taskOne = new RandomString();
        assertEquals(true, taskOne.generateRandomString(programsThree));
    }

}

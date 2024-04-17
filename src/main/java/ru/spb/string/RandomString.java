package ru.spb.string;

import java.util.Random;

public class RandomString {

    public String generateRandomString(int targetStringLength) {
        int leftLimit = 48; // numeral '0' Unicode Decimal Code &#48;
        int rightLimit = 122; // letter 'z' Unicode Decimal Code &#122;
        Random random = new Random();

        if (targetStringLength > 0){
            return random.ints(leftLimit, rightLimit + 1)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    //Аргумент 1: Создает начальный результат (в данном случае новый StringBuilder).
                    //Аргумент 2: Добавляет элемент (String) к результату (StringBuilder).
                    //Аргумент 3: Если запустить поток параллельно, будет создано несколько StringBuilders. Это для объединения их вместе.
                    .toString();
        } else if (targetStringLength == 0) {
            return "Значение пустон, введите положительно число больше 0";
        }else {
           return "Значение отрицательно, введите положительно число больше 0";
        }
    }

}

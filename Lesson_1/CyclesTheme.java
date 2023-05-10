public class CyclesTheme {

    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int finishNum = 21;
        int counter = startNum;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter >= startNum && counter <= finishNum);
        System.out.println("В промежутке [" + startNum + "," + finishNum + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd + ";");

        //2.Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
                max = num3;
            } else {
                min = num3;
                max = num2;
            }
        } else {
            if (num2 < num3) {
                min = num2;
                max = num3;
            } else {
                min = num3;
                max = num1;
            }
        }
        System.out.print("Числа в интервале (" + min + ", " + max + "), в порядке убывания: ");
        for (int i = (max - 1); i > min && i < max; i--) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int givenNum = 1234;
        int copyGivenNum = givenNum;
        int digit = 0;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке = ");
        while (copyGivenNum > 0) {
            digit = copyGivenNum % 10;
            System.out.print(digit);
            sumDigits += digit;
            copyGivenNum /= 10;
        }
        System.out.println("\nСумма цифр числа " + givenNum + " = " + sumDigits);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int leftIncludig = 1;
        int rightExcluding = 24;
        int step = 2;
        int stringLegth = 5;
        for (int i = leftIncludig; i < rightExcluding; i += step) {
            for (int j = 0; j < stringLegth; j++) {
                if (i < rightExcluding) {
                    System.out.printf("%2d ", i);
                } else {
                    System.out.printf("%2d ", 0);
                }
                i += 2;
            }
            System.out.println();
            i -= 2;
        }

        //5.Проверка количества двоек на четность/нечетность
        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        int setNum = 3242592;
        int copySetNum = setNum;
        int countTwos = 0; 
        while (copySetNum > 0) {
            if (copySetNum % 10 == 2) {
                countTwos++;
            }
            copySetNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + setNum + 
                    " содержит чётное количество двоек, " + countTwos + ";");
        } else {
            System.out.println("Число " + setNum + 
                    " содержит нечётное количество двоек, " + countTwos + ";");
        }

        //6.Отображение фигур в консоли
        System.out.println("\n6.Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int stringLengthLimit = 5;
        int fillingStep = 1;
        while (stringLengthLimit > 0) {
            while (fillingStep <= stringLengthLimit) {
                System.out.print("#");
                fillingStep++;
            }
            System.out.println();
            fillingStep = 1;
            stringLengthLimit--;
        }

        int limitStringLength = 1;
        int printingStep = 1;
        do {
            do {
                System.out.print("$");
                printingStep++;
            } while (printingStep <= limitStringLength);
            System.out.println();
            printingStep = 1;
            limitStringLength++;
        } while (limitStringLength > 0 && limitStringLength < 3);
        do {
            do {
                System.out.print("$");
                printingStep++;
            } while (printingStep <= limitStringLength);
            System.out.println();
            printingStep = 1;
            limitStringLength--;
        } while (limitStringLength > 0);

        //7.Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%4s %4s %n", "Dec", "Char");
        for (int i = 0; i <= 122; i++) {
            if (i >= 0 && i <= 47 && i % 2 != 0) {
                System.out.printf("%4d", i);
                System.out.printf("%4c%n", i);
            } else if (i >= 97 && i % 2 == 0) {
                System.out.printf("%4d", i);
                System.out.printf("%4c%n", i, i);
            }
        }

        //8.Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом");
        long palindrome = 12345654321L;
        long copyPalindrome = palindrome;
        long unknown = 0;
        while (copyPalindrome > 0) {
            unknown += copyPalindrome % 10;
            copyPalindrome /= 10;
            if (copyPalindrome > 0) {
                unknown *= 10;
            }
        }
        if (palindrome == unknown) {
            System.out.println("Вау, число " + palindrome + " настоящий ПАЛИНДРОМ!");
        } else {
            System.out.println("Эксперты утверждают, что число " + palindrome + " не ПАЛИНДРОМ!");
        }

        //9.Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым");
        int luckyNum = 999999;
        int partFirst = luckyNum / 1000;
        int sumFirstDigits = 0;
        while (partFirst > 0) {
            sumFirstDigits += partFirst % 10;
            partFirst /= 10;
        }
        int partLast = luckyNum % 1000;
        int sumLastDigits = 0;
        while (partLast > 0) {
            sumLastDigits += partLast % 10;
            partLast /= 10;
        }
        boolean isLucky = sumFirstDigits == sumLastDigits;
        System.out.println("Сумма цифр " + (luckyNum / 1000) + " = " + sumFirstDigits + "; " + 
                "Сумма цифр " + (luckyNum % 1000) + " = " + sumLastDigits + ";\n" + 
                (isLucky ? luckyNum + " - Счастливое число!" : luckyNum + " - Обычное число."));

        //10.Вывод таблицы умножения Пифагора
        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println("\n---|------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
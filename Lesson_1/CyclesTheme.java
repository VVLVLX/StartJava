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
        int max = num1;
        int min = num3;
        if (num1 < num2 && num1 < num3) {
            min = num1;
            max = num3;
        } else if (num1 < num2 && num1 > num3) {
            max = num2;
        } else if (num2 < num3) {
            min = num2;
            max = num3;
        }
        System.out.print("Числа в интервале (" + min + ", " + max + "), в порядке убывания: ");
        for (int i = (max - 1); i > min && i < max; i--) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int givenNum = 1234;
        int copyGivenNum = givenNum;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке = ");
        while (copyGivenNum > 0) {
            int digit = copyGivenNum % 10;
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
        givenNum = 3242592;
        copyGivenNum = givenNum;
        int countTwos = 0; 
        while (copyGivenNum > 0) {
            if (copyGivenNum % 10 == 2) {
                countTwos++;
            }
            copyGivenNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + givenNum + 
                    " содержит чётное количество двоек, " + countTwos + ";");
        } else {
            System.out.println("Число " + givenNum + 
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

        int countLines = 5;
        int countSymbols = 1;
        while (countLines > 0) {
            while (countSymbols <= countLines) {
                System.out.print("#");
                countSymbols++;
            }
            System.out.println();
            countSymbols = 1;
            countLines--;
        }

        countLines = 1;
        countSymbols = 1;
        int maxSymbols = 3;
        int currentLineLimit = 1;
        do {
            do {
                System.out.print("$");
                countSymbols++;
            } while (countSymbols <= currentLineLimit);
            System.out.println();
            countSymbols = 1;
            countLines++;
            if (countLines <= maxSymbols) {
                currentLineLimit++;
            } else {
                currentLineLimit = 2 * maxSymbols - countLines;
            }
        } while (countLines <= 5);

        //7.Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%4s %4s %n", "Dec", "Char");
        for (int i = 0; i <= 122; i++) {
            if (i >= 0 && i <= 47 && i % 2 != 0) {
                System.out.printf("%4d%4c%n", i, i);
            } else if (i >= 97 && i % 2 == 0) {
                System.out.printf("%4d%4c%n", i, i);
            }
        }

        //8.Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом");
        long palindrome = 696696L;
        long copyPalindrome = palindrome;
        long testPalindrome  = 0;
        while (copyPalindrome > 0) {
            testPalindrome = testPalindrome * 10 + copyPalindrome % 10;
            copyPalindrome /= 10;
        }
        if (palindrome == testPalindrome) {
            System.out.println("Вау, число " + palindrome + " настоящий ПАЛИНДРОМ!");
        } else {
            System.out.println("Эксперты утверждают, что число " + palindrome + " не ПАЛИНДРОМ!");
        }

        //9.Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым");
        int luckyNum = 999999;
        int leftHalf = luckyNum / 1000;
        int sumLeftDigits = 0;
        int rightHalf = luckyNum % 1000;
        int sumRightDigits = 0;
        while (rightHalf > 0) {
            sumLeftDigits += leftHalf % 10;
            leftHalf /= 10;
            sumRightDigits += rightHalf % 10;
            rightHalf /= 10;
        }
        boolean isLucky = sumLeftDigits == sumRightDigits;
        System.out.println("Сумма цифр " + (luckyNum / 1000) + " = " + sumLeftDigits + "; " + 
                "Сумма цифр " + (luckyNum % 1000) + " = " + sumRightDigits + ";\n" + 
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
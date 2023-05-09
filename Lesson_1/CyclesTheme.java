public class CyclesTheme {

    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int finishNum = 21;
        int i = startNum;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i > startNum && i < (finishNum + 1));
        System.out.println("В промежутке [" + startNum + "," + finishNum + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd + ";");

        //2.Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;

        if (num1 > num3) {
            if (num1 > num2) {
                max = num1;
                System.out.println("Наибольшее число = " + num1);
            } else {
                max = num2;
                System.out.println("Наибольшее число = " + num2);
            }
            if (num3 < num2) {
                min = num3;
                System.out.println("Наименьшее число = " + num3);
            } else {
                min = num2;
                System.out.println("Наименьшее число = " + num2);
            }
        } else {
            if (num3 > num2) {
                max = num3;
                System.out.println("Наибольшее число = " + num3);
            } else {
                max = num2;
                System.out.println("Наибольшее число = " + num2);
            }
            if (num1 < num2) {
                min = num1;
                System.out.println("Наименьшее число = " + num1);
            } else {
                min = num2;
                System.out.println("Наименьшее число = " + num2);
            }
        }
        for (int j = (max - 1); j > min && j < max; j--) {
            System.out.print(j + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int givenNum = 1234;
        int reverseNum = 0;
        int sumDigs = 0;
        while (givenNum != 0) {
            reverseNum += givenNum % 10;
            sumDigs += givenNum % 10;
            givenNum /= 10;
            if(givenNum != 0) {
                reverseNum *= 10;
            }
        }
        System.out.println("Исходное число в обратном порядке = " + reverseNum + 
                "\nСумма цифр числа " + givenNum + " = " + sumDigs);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int leftIncludig = 1;
        int rightExcluding = 24;
        int step = 2;
        int stringLegth = 5;
        for (int v = leftIncludig; v < rightExcluding; v += step) {
            for (int w = 0; w < stringLegth; w++) {
                if (v < rightExcluding) {
                    System.out.printf("%2d ", v);
                } else {
                    System.out.printf("%2d ", 0);
                }
                v += 2;
            }
            System.out.println("");
            v -= 2;
        }

        //5.Проверка количества двоек на четность/нечетность
        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        int hardNum = 3242592;
        int k = hardNum;
        int twoCounter = 0; 
        while (k != 0) {
            if (k % 10 == 2) {
                twoCounter++;
            }
            k /= 10;
        }
        if (twoCounter % 2 == 0) {
            System.out.println("Число " + hardNum + 
                    " содержит чётное количество двоек, " + twoCounter + ";");
        } else {
            System.out.println("Число " + hardNum + 
                    " содержит нечётное количество двоек, " + twoCounter + ";");
        }

        //6.Отображение фигур в консоли
        System.out.println("\n6. Проверка количества двоек на четность/нечетность");
        for(int o = 0; o < 5; o++) {
            for (int p = 0; p < 11; p++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int q = 5;
        int r = 1;
        while (q > 0) {
            while (r <= q) {
                System.out.print("#");
                r++;
            }
            System.out.println("");
            r = 1;
            q--;
        }

        int s = 1;
        int t = 1;
        do {
            do {
                System.out.print("$");
                t++;
            } while (t <= s);
            System.out.println("");
            t = 1;
            s++;
        } while (s > 0 && s < 3);
        do {
            do {
                System.out.print("$");
                t++;
            } while (t <= s);
            System.out.println("");
            t = 1;
            s--;
        } while (s > 0);

        //7.Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%4s %4s %n", "Dec", "Char");
        for (int u = 0; u <= 122; u++) {
            if (u >= 0 && u <= 47 && u % 2 != 0) {
                System.out.printf("%4d", u);
                System.out.printf("%4c%n", u);
            } else if (u >= 97 && u % 2 == 0) {
                System.out.printf("%4d", u);
                System.out.printf("%4c%n", u, u);
            }
        }
        //8.Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом");
        long palindrome = 12345654321L;
        long palindromeCheck = palindrome;
        long unknown = 0;
        while (palindromeCheck != 0) {
            unknown += palindromeCheck % 10;
            palindromeCheck /= 10;
            if (palindromeCheck != 0) {
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
        int sumFirstDigs = 0;
        while (partFirst != 0) {
            sumFirstDigs += partFirst % 10;
            partFirst /= 10;
        }
        int partLast = luckyNum % 1000;
        int sumLastDigs = 0;
        while (partLast != 0) {
            sumLastDigs += partLast % 10;
            partLast /= 10;
        }
        boolean isLucky = sumFirstDigs == sumLastDigs;
        System.out.println("Сумма цифр " + (luckyNum / 1000) + " = " + sumFirstDigs + "; " + 
                "Сумма цифр " + (luckyNum % 1000) + " = " + sumLastDigs + ";\n" + 
                (isLucky ? luckyNum + " - Счастливое число!" : luckyNum + " - Обычное число."));

        //10.Вывод таблицы умножения Пифагора
        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.print("   |");
        for (int x = 2; x < 10; x++) {
            System.out.printf("%2d ", x);
        }
        System.out.println("\n---|------------------------");
        for (int x = 2; x < 10; x++) {
            System.out.printf("%2d |", x);
            for (int y = 2; y < 10; y++) {
                System.out.printf("%2d ", x * y);
            }
            System.out.println("");
        }
    }
}
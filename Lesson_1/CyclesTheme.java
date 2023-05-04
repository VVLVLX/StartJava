public class CyclesTheme {

    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int finishNum = 21;
        int i = startNum;
        int total = 0;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            total += i;
            if (total % 2 == 0) {
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

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
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
                "\nСумма цифр числа 1234 = " + sumDigs);
/*
        //4. Вывод чисел на консоль в несколько строк
        //https://ru.stackoverflow.com/questions/37944/%D0%92%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5-%D1%86%D0%B8%D0%BA%D0%BB%D1%8B-while
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int beginNum = 1;
        int endNum = 24;
        int step = 2;

        for (int m = (beginNum); m > (beginNum - 1) && m < (endNum + 1) && (m-1) - step * 4 <= 0; m += step) {
            System.out.print(m + " ");
        }
        for (int m = (beginNum); m > (beginNum - 1) && m < (endNum + 1) && (m-1) - step * 9 <= 0; m += step) {
            System.out.print(m + " ");
        }
*/
        //5. Проверка количества двоек на четность/нечетность
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int hardNum = 3242592;
        int cycleNum = hardNum;
        int deucesCounter = 0; 
        while (cycleNum != 0) {
            if (cycleNum % 10 == 2) {
                deucesCounter++;
            }
            cycleNum /= 10;
        }
        if (deucesCounter % 2 == 0) {
            System.out.println("Число " + hardNum + 
                    " содержит чётное количество двоек, " + deucesCounter);
        } else {
            System.out.println("Число " + hardNum + 
                    " содержит нечётное количество двоек, " + deucesCounter);
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Проверка количества двоек на четность/нечетность");
        for(int o = 0; o < 5; o++) {
            System.out.println("**********");
        }
        int p = 5;
        int q = 1;
        while (p > 0) {
            while (q <= p) {
                System.out.print("#");
                q++;
            }
            System.out.println("");
            q = 1;
            p--;
        }
    }
}
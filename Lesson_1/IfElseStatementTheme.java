    public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1.Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 70;
        if (age > 20) {
            System.out.println("age limit not applicable");
        } else {
            System.out.println("age limit applicable");
        }
        char sex = 'm';
        if (sex != 'm') {
            System.out.println("see section of the catalog for women");
        } else {
            System.out.println("see section of the catalog for men");
        }
        float height = 2.0f;
        if (height < 1.80) {
            System.out.println("you can't be a model");
        } else {
            System.out.println("you have the right height for the model");
        }
        char firstLetter = "James".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("incredible!");
        } else if (firstLetter == 'I') {
            System.out.println("fantastic!");
        } else {
            System.out.println("it is sad...");
        }

        //2.Поиск max и min числа
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 6;
        int num2 = 34;
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2) {
            System.out.println("max число = " + num1 + ", min число = " + num2);
        } else {
            System.out.println("max число = " + num2 + ", min число = " + num1);
        }

        //3.Проверка числа
        System.out.println("\n3. Проверка числа");
        int anyNum = 64;
        System.out.println(anyNum);
        if (anyNum == 0) {
            System.out.println("Число является нулём");
        } else {
            if (anyNum % 2 == 0) {
                System.out.println("Чётное");
            } else {
                System.out.println("Нечётное");
            }
            if (anyNum > 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }

        //4.Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 456;
        int hundredsNum1 = num1 / 100;
        int tensNum1 = (num1 / 10) % 10;
        int onesNum1 = num1 % 10;
        int hundredsNum2 = num2 / 100;
        int tensNum2 = (num2 / 10) % 10;
        int onesNum2 = num2 % 10;
        System.out.println("Число 1 = " + num1 + "; Число 2 = " + num2 + ";");
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("В одинаковых разрядах нет равных цифр!");
        } else {
            if (hundredsNum1 == hundredsNum2) {
                System.out.println("Разряды сотен совпадают, числа равны " + hundredsNum1);
            }
            if (tensNum1 == tensNum2) {
                System.out.println("Разряды десятков совпадают, числа равны " + tensNum1);
            }
            if (onesNum1 == onesNum2) {
                System.out.println("Разряды единиц совпадают, числа равны " + onesNum1);
            }
        }

        //5.Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char unknownChar = '\u0057';
        System.out.println("Заданный символ: " + unknownChar);
        if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println("маленькая буква");
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println("большая буква");
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("цифра");
        } else {
            System.out.println("не буква и не число");
        }

        //6.Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 1000000;
        System.out.println("Сумма вклада = " + deposit + " руб.");
        float rate = 0.07f;
        if (deposit < 100000) {
            rate = 0.05f;
        } else if (deposit >= 300000) {
            rate = 0.1f;
        }
        float charges = deposit * rate;
        float total = deposit + charges;
        System.out.println("Сумма начисленных %: " + charges + " руб.\n" + 
                "Итого на счёте: " + total + " руб.");


        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        double historyRate = 0.59;
        double historyGrade = 2;
        if (historyRate > 0.91) {
            historyGrade = 5;
        } else if (historyRate > 0.73) {
            historyGrade = 4;
        } else if (historyRate > 0.60) {
            historyGrade = 3;
        }
        double csRate = 0.91;
        double csGrade = 2;
        if (csRate > 0.91) {
            csGrade = 5;
        } else if (csRate > 0.73) {
            csGrade = 4;
        } else if (csRate > 0.60) {
            csGrade = 3;
        }
        double avgGrade = (historyGrade + csGrade) / 2;
        double avgRate = (historyRate + csRate) / 2 * 100;
        System.out.println("Оценка по истории = " + historyGrade +
                "\nОценка по программированию = " + csGrade + 
                "\nСредний балл оценок по предметам = " + avgGrade + 
                "\nСредний % по предметам = " + avgRate);

        //8.Расчет прибыли за год
        System.out.println("\n8.Расчет прибыли за год");
        int sales = 13000;
        int costPrice = 9000;
        int rent = 5000;
        int annualProfit = (sales - costPrice - rent) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        //9.Подсчет количества банкнот
        System.out.println("\n9.Подсчет количества банкнот");
        int requiredCash = 567;
        int required100 = requiredCash / 100;
        int required10 = (requiredCash / 10) % 10;
        int required1 = requiredCash % 10;
        int available100 = 10;
        int available10 = 5;
        int available1 = 50;
        int change101 = (required10 - available10) * 10 + required1;
        int change1001 = (((required100 - available100) * 10) - available10) * 10 + required1;
        int change10010 = (required100 - available100) * 10 + required10;
        if ((available100 >= required100 &&
                ((available10 >= required10 && available1 < required1)
                || (available1 < change101))) ||
                (available100 < required100 &&
                ((available10 >= change10010 && available1 < required1)
                || (available10 < change10010 && available1 < change1001)))) {
            System.out.println ("Недостаточно банкнот для выдачи требуемой суммы!");
        } else {
            int giveOut100 = 0;
            int giveOut10 = 0;
            int giveOut1 = 0;
            if (available100 < required100) {
                giveOut100 = available100;
                if (available10 < change10010 && available1 >= change1001) {
                    giveOut10 = available10;
                    giveOut1 = change1001;
                }
                if (available10 > change10010 && available1 >= required1) {
                    giveOut10 = change10010;
                    giveOut1 = required1;
                }
            } else if (available100 >= required100) {
                giveOut100 = required100;
                if (available10 < required10 && available1 >= change101) {
                    giveOut10 = available10;
                    giveOut1 = change101;
                }
                if (available10 >= required10 && available1 >= required1) {
                    giveOut10 = required10;
                    giveOut1 = required1;
                }
            }
            System.out.println("Требуемое количество банкнот: 100$: " + giveOut100 + "; 10$: " +
                    giveOut10 + "; 1$: " + giveOut1 + "; " + "\nСумма к выдаче: " + requiredCash);
        }
    }
}
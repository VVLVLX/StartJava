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
        int number1 = 6;
        int number2 = 34;
        if (number1 == number2) {
            System.out.println("Числа равны");
        } else if (number1 > number2) {
            System.out.println("max число = " + number1 + ", min число = " + number2);
        } else {
            System.out.println("max число = " + number2 + ", min число = " + number1);
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
        int num1 = 123;
        int num2 = 223;
        int hundredsNum1 = num1 / 100;
        int tensNum1 = (num1 / 10) % 10;
        int onesNum1 = num1 % 10;
        int hundredsNum2 = num2 / 100;
        int tensNum2 = (num2 / 10) % 10;
        int onesNum2 = num2 % 10;
        System.out.println("Число 1 = " + num1 + "; Число 2 = " + num2 + ";");
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.println("В одинаковых разрядах нет равных цифр!");
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("Разряды сотен совпадают, числа равны " + hundredsNum1);
        }
        if (tensNum1 == tensNum2) {
            System.out.println("Разряды десятков совпадают, числа равны " + tensNum1);
        }
        if (onesNum1 == onesNum2) {
            System.out.println("Разряды единиц совпадают, числа равны " + onesNum1);
        }

        //5.Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char charHex = '\u0024';
        System.out.println("Заданный символ: " + (char) charHex);
        if (charHex >= 97 && charHex <= 122) {
            System.out.println("маленькая буква");
        } else if (charHex >= 65 && charHex <= 90) {
            System.out.println("большая буква");
        } else if (charHex >= 48 && charHex <= 57) {
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
        double historyRate = 0.59d;
        double codingRate = 0.91d;
        double historyGrade = 2d;
        double codingGrade = 2d;
        if (historyRate > 0.91) {
            historyGrade = 5;
        } else if (historyRate > 0.73) {
            historyGrade = 4;
        } else if (historyRate > 0.60) {
            historyGrade = 3;
        } 
        if (codingRate > 0.91) {
            codingGrade = 5;
        } else if (codingRate > 0.73) {
            codingGrade = 4;
        } else if (codingRate > 0.60) {
            codingGrade = 3;
        }
        double avgGrade = (historyGrade + codingGrade) / 2;
        double avgRate = (historyRate + codingRate) / 2 * 100;
        System.out.println("Оценка по истории = " + historyGrade +
                "\nОценка по программированию = " + codingGrade + 
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
        int availableHundreds = 10;
        int availableTens = 5;
        int availableOnes = 50;
        int requiredCash = 567;
        int requiredHundreds = requiredCash / 100;
        int requiredTens = (requiredCash / 10) % 10;
        int requiredOnes = requiredCash % 10;
        int changeTensOnes = (requiredTens - availableTens) * 10 + requiredOnes;
        int changeHundredsTens = (requiredHundreds - availableHundreds) * 10 + requiredTens;
        int changeHundredsOnes = (changeHundredsTens - availableTens) * 10 + requiredOnes;
        int giveOutHundreds = 0;
        int giveOutTens = 0;
        int giveOutOnes = 0;
        if (availableHundreds >= requiredHundreds) {
            giveOutHundreds = requiredHundreds;
            if (availableTens >= requiredTens) {
                giveOutTens = requiredTens;
                if (availableOnes >= requiredOnes) {
                    giveOutOnes = requiredOnes;
                } else {
                    System.out.println ("Недостаточно банкнот для выдачи требуемой суммы! 1");
                }
            } else if (availableOnes >= changeTensOnes) {
                giveOutTens = availableTens;
                giveOutOnes = changeTensOnes;
            } else {
                System.out.println ("Недостаточно банкнот для выдачи требуемой суммы! 2");
            }
        } else if (availableTens >= changeHundredsTens) {
            giveOutHundreds = availableHundreds;
            if (availableOnes >= requiredOnes) {
                giveOutTens = changeHundredsTens;
                giveOutOnes = requiredOnes;
            } else {
                System.out.println ("Недостаточно банкнот для выдачи требуемой суммы! 3");
            }
        } else if (availableOnes >= changeHundredsOnes) {
            giveOutHundreds = availableHundreds;
            giveOutTens = availableTens;
            giveOutOnes = changeHundredsOnes;
        } else {
            System.out.println ("Недостаточно банкнот для выдачи требуемой суммы! 4");
        }
        System.out.println("Требуемое количество банкнот: 100$: " + giveOutHundreds + "; 10$: " +
                giveOutTens + "; 1$: " + giveOutOnes + "; " + "\nСумма к выдаче: " + requiredCash);
    }
}
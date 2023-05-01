public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
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
        float length = 2.0f;
        if (length < 1.80) {
            System.out.println("shorter than standard bed length");
        } else {
            System.out.println("over standard bed length");
        }
        char firstLetterOfName = "James".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("incredible!");
        } else if (firstLetterOfName == 'I') {
            System.out.println("fantastic!");
        } else {
            System.out.println("it is sad...");
        }

        //2. Поиск max и min числа
        System.out.println("\n2. Поиск max и min числа");
        int number1 = 0;
        int number2 = 0;
        if (number1 == number2) {
            System.out.println("Числа равны");
        } else if (number1 != number2) {
            if (number1 > number2) {
                System.out.println("max число = " + number1 + ", min число = " + number2);
            } else {
                System.out.println("max число = " + number2 + ", min число = " + number1);
            }
        }

        //3. Проверка числа
        int anyNum = 0;
        System.out.println("\n3. Проверка числа");
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

        //4. Поиск одинаковых цифр в числах
        int num1 = 456;
        int num2 = 789;
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        System.out.println("Первое число = " + num1 + "; Второе число = " + num2 + ";");

        int firstDigNum1 = num1 / 100;
        int secondDigNum1 = (num1 / 10) % 10;
        int thirdDigNum1 = num1 % 10;
        int firstDigNum2 = num2 / 100;
        int secondDigNum2 = (num2 / 10) % 10;
        int thirdDigNum2 = num2 % 10;

        if (firstDigNum1 == firstDigNum2) {
            if (secondDigNum1 == secondDigNum2) {
                if (thirdDigNum1 == thirdDigNum2) {
                    System.out.println("Одинаковые цифр: " + firstDigNum1 + "; " + secondDigNum1 +
                            "; " + thirdDigNum1 + ";");
                    System.out.println("Номера разрядов: 1; 2; 3;");
                } else {
                    System.out.println("Одинаковые цифр: " + firstDigNum1 + "; " + secondDigNum1 +
                            ";");
                    System.out.println("Номера разрядов: 1; 2;");
                }
            } else if (thirdDigNum1 == thirdDigNum2) {
                System.out.println("Одинаковые цифр: " + firstDigNum1 + "; " + thirdDigNum1 + ";");
                System.out.println("Номера разрядов: 1; 3;");
            } else {
                System.out.println("Одинаковые цифр: " + firstDigNum1 + ";");
                System.out.println("Номера разрядов: 1;");
            }
        } else if (secondDigNum1 == secondDigNum2) {
            if (thirdDigNum1 == thirdDigNum2) {
                System.out.println("Одинаковые цифр: " + secondDigNum1 + "; " + thirdDigNum1 + ";");
                    System.out.println("Номера разрядов: 2; 3;");
            } else {
                System.out.println("Одинаковые цифр: " + secondDigNum1 + ";");
                System.out.println("Номера разрядов: 2;");
            }
        } else if (thirdDigNum1 == thirdDigNum2) {
                System.out.println("Одинаковые цифр: " + thirdDigNum1 + ";");
                System.out.println("Номера разрядов: 3;");
        } else {
            System.out.println("Одинаковых цифр нет;");
        }
/*
        //5. Определение символа по его коду
        System.out.println("\n5.Определение символа по его коду");
        char givenChar = '\u0057';
        char convertgivenCharToChar = (char) givenChar;
        System.out.println("Заданный символ: " + givenChar);
*/
        //6. Подсчет суммы вклада и начисленных банком %
        int deposit = 300000;
        int limit1 = 100000;
        int limit2 = 300000;

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        System.out.println("Сумма вклада = " + deposit + " руб.");

        if (deposit < limit1) {
            float interestRate = 0.05f;
            float interestCharges = deposit * interestRate;
            float total = deposit + interestCharges;
            System.out.println("Сумма начисленных %: " + interestCharges + " руб.");
            System.out.println("Итого на счёте: " + total + " руб.");
        } else if (deposit >= limit2) {
            float interestRate = 0.1f;
            float interestCharges = deposit * interestRate;
            float total = deposit + interestCharges;
            System.out.println("Сумма начисленных %: " + interestCharges + " руб.");
            System.out.println("Итого на счёте: " + total + " руб.");
        } else {
            float interestRate = 0.07f;
            float interestCharges = deposit * interestRate;
            float total = deposit + interestCharges;
            System.out.println("Сумма начисленных %: " + interestCharges + " руб.");
            System.out.println("Итого на счёте: " + total + " руб.");
        }

        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        float histPct = 0.59f;
        float progPct = 0.91f;

        if (histPct > 0.91) {
            if (progPct > 0.91) {
                float histGrade = 5f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 5f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 5f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 5f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            }
        } else if (histPct > 0.73) {
            if (progPct > 0.91) {
                float histGrade = 4f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 4f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 4f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 4f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            }
        } else if (histPct > 0.60) {
            if (progPct > 0.91) {
                float histGrade = 3f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 3f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 3f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 3f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            }
        } else {
            if (progPct > 0.91) {
                float histGrade = 2f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 2f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 2f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 2f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade);
                System.out.println("Оценка по программированию = " + progGrade);
                System.out.println("Средний балл оценок по предметам = " + avgGrade);
            }
        }
        float avgPct = (histPct + progPct) / 2 * 100;
        System.out.println("Средний % по предметам = " + avgPct);

        //8.Расчет прибыли за год
        //9.Подсчет количества банкнот
    }
}
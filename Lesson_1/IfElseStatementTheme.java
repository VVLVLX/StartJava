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
        char firstLetter = "James".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("incredible!");
        } else if (firstLetter == 'I') {
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
        } else {
            if (number1 > number2) {
                System.out.println("max число = " + number1 + ", min число = " + number2);
            } else {
                System.out.println("max число = " + number2 + ", min число = " + number1);
            }
        }

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int anyNum = 0;
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
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 456;
        int num2 = 789;
        System.out.println("Первое число = " + num1 + "; Второе число = " + num2 + ";");
        int firstNum1 = num1 / 100;
        int secondNum1 = (num1 / 10) % 10;
        int thirdNum1 = num1 % 10;
        int firstNum2 = num2 / 100;
        int secondNum2 = (num2 / 10) % 10;
        int thirdNum2 = num2 % 10;

        if (firstNum1 == firstNum2) {
            if (secondNum1 == secondNum2) {
                if (thirdNum1 == thirdNum2) {
                    System.out.println("Одинаковые цифр: " + firstNum1 + "; " + 
                            secondNum1 + "; " + thirdNum1 + ";\n" + "Номера разрядов: 1; 2; 3;");
                } else {
                    System.out.println("Одинаковые цифр: " + firstNum1 + 
                            "; " + secondNum1 + ";\n" + "Номера разрядов: 1; 2;");
                }
            } else if (thirdNum1 == thirdNum2) {
                System.out.println("Одинаковые цифр: " + firstNum1 + 
                        "; " + thirdNum1 + ";\n" + "Номера разрядов: 1; 3;");
            } else {
                System.out.println("Одинаковые цифр: " + 
                        firstNum1 + ";\n" + "Номера разрядов: 1;");
            }
        } else if (secondNum1 == secondNum2) {
            if (thirdNum1 == thirdNum2) {
                System.out.println("Одинаковые цифр: " + secondNum1 + 
                        "; " + thirdNum1 + ";\n" + "Номера разрядов: 2; 3;");
            } else {
                System.out.println("Одинаковые цифр: " + 
                        secondNum1 + ";\n" + "Номера разрядов: 2;");
            }
        } else if (thirdNum1 == thirdNum2) {
                System.out.println("Одинаковые цифр: " + 
                        thirdNum1 + ";\n" + "Номера разрядов: 3;");
        } else {
            System.out.println("Одинаковых цифр нет;");
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char charHex = '\u0057';
        System.out.println("Заданный символ: " + (char) charHex);
        if ((int) charHex >= 123) {
            System.out.println("не буква и не число");
        } else if ((int) charHex >= 97) {
            System.out.println("маленькая буква");
        } else if ((int) charHex >= 91) {
            System.out.println("не буква и не число");
        } else if ((int) charHex >= 65) {
            System.out.println("большая буква");
        } else if ((int) charHex >= 58) {
            System.out.println("не буква и не число");
        } else if ((int) charHex >= 48) {
            System.out.println("цифра");
        } else {
            System.out.println("не буква и не число");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;

        System.out.println("Сумма вклада = " + deposit + " руб.");
        if (deposit < 100000) {
            double charges = deposit * 0.05;
            double total = deposit + charges;
            System.out.println("Сумма начисленных %: " + charges + 
                    " руб.\n" + "Итого на счёте: " + total + " руб.");
        } else if (deposit >= 300000) {
            double charges = deposit * 0.1;
            double total = deposit + charges;
            System.out.println("Сумма начисленных %: " + charges + 
                    " руб.\n" + "Итого на счёте: " + total + " руб.");
        } else {
            double charges = deposit * 0.07;
            double total = deposit + charges;
            System.out.println("Сумма начисленных %: " + charges + 
                    " руб.\n" + "Итого на счёте: " + total + " руб.");
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
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 5f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 5f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 5f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            }
        } else if (histPct > 0.73) {
            if (progPct > 0.91) {
                float histGrade = 4f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 4f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 4f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 4f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            }
        } else if (histPct > 0.60) {
            if (progPct > 0.91) {
                float histGrade = 3f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 3f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 3f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 3f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            }
        } else {
            if (progPct > 0.91) {
                float histGrade = 2f;
                float progGrade = 5f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.73) {
                float histGrade = 2f;
                float progGrade = 4f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else if (progPct > 0.60) {
                float histGrade = 2f;
                float progGrade = 3f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            } else {
                float histGrade = 2f;
                float progGrade = 2f;
                float avgGrade = (histGrade + progGrade) / 2;
                System.out.println("Оценка по истории = " + histGrade +
                        "\nОценка по программированию = " + progGrade + 
                        "\nСредний балл оценок по предметам = " + avgGrade);
            }
        }
        float avgPct = (histPct + progPct) / 2 * 100;
        System.out.println("Средний % по предметам = " + avgPct);

        //8.Расчет прибыли за год
        System.out.println("\n8.Расчет прибыли за год");
        int sales = 13000;
        int costPrice = 9000;
        int grossProfit = sales - costPrice;
        int rent = 5000;
        int profitBeforTax = grossProfit - rent;
        int annualProfit = 12 * profitBeforTax;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + profitBeforTax);
        } else {
            System.out.println("Прибыль за год: " + profitBeforTax);
        }

        //9.Подсчет количества банкнот
        System.out.println("\n9.Подсчет количества банкнот");
        int reqAmount = 567;
        int reqHundreds = reqAmount / 100;
        int reqTens = (reqAmount / 10) % 10;
        int reqOnes = reqAmount % 10;
        int avlHundreds = 10;
        int avlTens = 5;
        int avlOnes = 50; 
        int denHundreds = 100;
        int denTens = 10;
        int denOnes = 1;
        int factReqOnesTens = (reqTens - avlTens) * denTens + reqOnes;
        int factReqTens = (reqHundreds - avlHundreds) * denTens + reqTens;
        int factReqOnesHundreds = (factReqTens - avlTens) * denTens + reqOnes;
        
        if (avlHundreds >= reqHundreds) {
            if (avlTens >= reqTens) {
                if (avlOnes >= reqOnes) {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denTens + 
                        "; " + denOnes + ";" + "\nТребуемое количество банкнот: " + 
                        reqHundreds + "; " + reqTens + "; " + reqOnes + ";" + 
                        "\nСумма к выдаче: " + reqAmount + ";");
                } else {
                    System.out.println ("Недостаточно банкнот для выдачи требуемой суммы!");
                }
            } else if (avlOnes >= factReqOnesTens) {
                if (avlTens > 0) {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denTens + 
                            "; " + denOnes + ";" + "\nТребуемое количество банкнот: " + 
                            reqHundreds + "; " + avlTens + "; " + factReqOnesTens + ";" + 
                            "\nСумма к выдаче: " + reqAmount + ";");
                } else {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denOnes + 
                            ";" + "\nТребуемое количество банкнот: " + reqHundreds + "; " + 
                            factReqOnesTens + ";" + "\nСумма к выдаче: " + reqAmount + ";");
                }
            } else {
                System.out.println ("Недостаточно банкнот для выдачи требуемой суммы!");
            }
        } else if (avlTens >= factReqTens) {
            if (avlOnes >= reqOnes) {
                if (avlHundreds > 0) {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denTens + 
                            "; " + denOnes + ";" + "\nТребуемое количество банкнот: " + 
                            avlHundreds + "; " + factReqTens + "; " + reqOnes + ";" + 
                            "\nСумма к выдаче: " + reqAmount + ";");
                } else {
                    System.out.println ("Номиналы банкнот: " + "; " + denTens + "; " + 
                            denOnes + ";" + "\nТребуемое количество банкнот: " + factReqTens + 
                            "; " + reqOnes + ";" + "\nСумма к выдаче: " + reqAmount + ";");
                }
            } else {
                System.out.println ("Недостаточно банкнот для выдачи требуемой суммы!");
            }
        } else if (avlOnes >= factReqOnesHundreds) {
            if (avlHundreds > 0) {
                if (avlTens > 0) {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denTens + 
                            "; " + denOnes + ";" + "\nТребуемое количество банкнот: " + 
                            avlHundreds + "; " + avlTens + "; " + factReqOnesHundreds + ";" + 
                            "\nСумма к выдаче: " + reqAmount + ";");
                } else {
                    System.out.println ("Номиналы банкнот: " + denHundreds + "; " + denOnes + 
                            ";" + "\nТребуемое количество банкнот: " + avlHundreds + "; " + 
                            factReqOnesHundreds + ";" + "\nСумма к выдаче: " + reqAmount + ";");
                }
            } else if (avlTens > 0) {
                System.out.println ("Номиналы банкнот: " + denTens + "; " + denOnes + ";" + 
                        "\nТребуемое количество банкнот: " + avlTens + "; " + 
                        factReqOnesHundreds + ";" + "\nСумма к выдаче: " + reqAmount + ";");
            } else {
                System.out.println ("Номиналы банкнот: " + denOnes + ";" + 
                        "\nТребуемое количество банкнот: " + factReqOnesHundreds + ";" + 
                        "\nСумма к выдаче: " + reqAmount + ";");
            }
        } else {
            System.out.println ("Недостаточно банкнот для выдачи требуемой суммы!");
        }
    }
}
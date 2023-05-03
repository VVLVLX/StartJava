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

        //2. Поиск max и min числа
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

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int anyNum = 64;
        int checkNum = 0;
        System.out.println(anyNum);
        if (anyNum == checkNum) {
            System.out.println("Число является нулём");
        } else {
            if (anyNum % 2 == checkNum) {
                System.out.println("Чётное");
            } else {
                System.out.println("Нечётное");
            }
            if (anyNum > checkNum) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }
/*
        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 458;
        int num2 = 458;
        int hundredsDig;
        int tensDig;
        int onesDig;
        char hundreds;
        char tens;
        char ones;

        if (num1 / 100 == num2 / 100) {
            hundredsDig = num1 / 100;
            hundreds = '1';
        } else {
            hundredsDig = ;
            hundreds = 'x';
        }
        if ((num1 / 10) % 10 == (num2 / 10) % 10) {
            tensDig = (num1 / 10) % 10;
            tens = '2';
        } else {
            tensDig = ;
            tens = 'x';
        }
        if (num1 % 10 == num2 % 10) {
            onesDig = num1 % 10;
            ones = '3';
        } else {
            onesDig = ;
            ones = 'x';
        }
        System.out.println("Первое число = " + num1 + "; Второе число = " + num2 + ";" + 
                "\nОдинаковые цифры: " + hundredsDig + "; " + tensDig + "; " + onesDig + "; " + 
                "\nНомера разрядов: " + hundreds + "; " + tens + "; " + ones + "; ");
*/
        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char charHex = '\u0024';
        System.out.println("Заданный символ: " + (char) charHex);

        if ((int) charHex >= 97 && (int) charHex <= 122) {
            System.out.println("маленькая буква");
        } else if ((int) charHex >= 65 && (int) charHex <= 90) {
            System.out.println("большая буква");
        } else if ((int) charHex >= 48 && (int) charHex <= 57) {
            System.out.println("цифра");
        } else {
            System.out.println("не буква и не число");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        System.out.println("Сумма вклада = " + deposit + " руб.");
        float rate;
        if (deposit < 100000) {
            rate = 0.05f;
        } else if (deposit >= 300000) {
            rate = 0.1f;
        } else {
            rate = 0.07f;
        }
        float charges = deposit * rate;
        float total = deposit + charges;
        System.out.println("Сумма начисленных %: " + charges + " руб.\n" + 
            "Итого на счёте: " + total + " руб.");

        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        double histPct = 0.59d;
        double progPct = 0.91d;
        double avgPct = (histPct + progPct) / 2 * 100;
        double histGrade;
        double progGrade;

        if (histPct > 0.91) {
            histGrade = 5;
        } else if (histPct > 0.73) {
            histGrade = 4;
        } else if (histPct > 0.60) {
            histGrade = 3;
        } else {
            histGrade = 2;
        }
        if (progPct > 0.91) {
            progGrade = 5;
        } else if (progPct > 0.73) {
            progGrade = 4;
        } else if (progPct > 0.60) {
            progGrade = 3;
        } else {
            progGrade = 2;
        }
        double avgGrade = (histGrade + progGrade) / 2;
        System.out.println("Оценка по истории = " + histGrade +
                "\nОценка по программированию = " + progGrade + 
                "\nСредний балл оценок по предметам = " + avgGrade + 
                "\nСредний % по предметам = " + avgPct);

        //8.Расчет прибыли за год
        System.out.println("\n8.Расчет прибыли за год");
        int sales = 13000;
        int costPrice = 9000;
        int grossProfit = sales - costPrice;
        int rent = 5000;
        int profitBeforTax = grossProfit - rent;
        int annualProfit = profitBeforTax * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
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
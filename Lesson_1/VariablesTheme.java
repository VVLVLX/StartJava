public class VariablesTheme {

    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        byte coresNumber = 6;
        float cpu = 2.38f;
        double maxCoreSupplyVoltage = 1.219d;
        boolean integratedGpu = true;
        short ram = 16;
        int frequency = 3200;
        long rom = 244242608126L;
        char operationSystem = 'W';

        System.out.println("\n1. Вывод характеристик компьютера");
        System.out.println("Number of processor cores: " + coresNumber + " pcs");
        System.out.println("CPU frequency: " + cpu + " GHz");
        System.out.println("Max. core supply voltage: " + maxCoreSupplyVoltage + " V");
        System.out.println("Integrated GPU: " + integratedGpu);
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("RAM frequency: " + frequency + " MHz");
        System.out.println("ROM: " + rom + " bytes");
        System.out.println("Operating system: " + operationSystem + " - Windows");

        //2. Расчет стоимости товара со скидкой
        short penPrice = 100;
        short bookPrice = 200;
        int purchaseAmount = (penPrice + bookPrice);
        float discountPercentage = 0.11f;
        float discountValue = purchaseAmount * discountPercentage;
        float totalAmount = purchaseAmount - discountValue;

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        System.out.println("Общая стоимость товаров без скидки: " + purchaseAmount + " руб.");
        System.out.println("Cумма скидки: " + discountValue + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + totalAmount + " руб.");

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  v v  aaaaa  ");
        System.out.println(" JJ  a     a  v  a     a ");

        //4. Вывод min и max значений целых числовых типов
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        System.out.println("Первоначальное значение для byte: " + byteNum);
        System.out.println("Значение для byte после инкремента на единицу: " + byteNum++);
        System.out.println("Значение для byte после дескремента на единицу: " + byteNum--);
        System.out.println("Первоначальное значение для short: " + shortNum);
        System.out.println("Значение для short после инкремента на единицу: " + shortNum++);
        System.out.println("Значение для short после дескремента на единицу: " + shortNum--);
        System.out.println("Первоначальное значение для int: " + intNum);
        System.out.println("Значение для int после инкремента на единицу: " + intNum++);
        System.out.println("Значение для int после дескремента на единицу: " + intNum--);
        System.out.println("Первоначальное значение для long: " + longNum);
        System.out.println("Значение для long после инкремента на единицу: " + longNum++);
        System.out.println("Значение для long после дескремента на единицу: " + longNum--);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("Перестановка с помощью третьей переменной");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2 + ";");
        int numTemp = num1;
        num1 = num2;
        num2 = numTemp;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2 + ";");

        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2 + ";");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2 + ";");

        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2 + ";");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2 + ";");

        //6. Вывод символов и их кодов
        char sym1 = '#' ;
        char sym2 = '&' ;
        char sym3 = '@' ;
        char sym4 = '^' ;
        char sym5 = '_' ;

        int symCode1 = (int) sym1;
        int symCode2 = (int) sym2;
        int symCode3 = (int) sym3;
        int symCode4 = (int) sym4;
        int symCode5 = (int) sym5;

        System.out.println("\n6. Вывод символов и их кодов");
        System.out.println(symCode1 + " " + sym1);
        System.out.println(symCode2  + " " + sym2);
        System.out.println(symCode3 + " " + sym3);
        System.out.println(symCode4 + " " + sym4);
        System.out.println(symCode5 + " " + sym5);

        //7. Вывод в консоль ASCII-арт Дюка
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        System.out.println("    " + slash + "" + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + "" + underScore + openBracket + " " + closeBracket + "" +
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println(slash + "" + underScore + "" + underScore + "" + underScore + "" +
                underScore + slash + "" + backSlash + "" + underScore + "" + underScore + "" +
                backSlash);

        //8. Вывод количества сотен, десятков и единиц числа
        int givenNum = 123;
        int hundredsDig = givenNum / 100;
        int dozenDig = (givenNum % 100) / 10;
        int unitsDig = givenNum % 10;
        int productOfDigs = hundredsDig * dozenDig * unitsDig;
        int summOfDigs = hundredsDig + dozenDig + unitsDig;

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        System.out.println("Число " + givenNum + " содержит: " + hundredsDig + " сотен, " +
                dozenDig + " десятков, " + unitsDig + " единиц;");
        System.out.println("Сумма его цифр = " + summOfDigs + ", произведение его цифр = " +
                productOfDigs + ";");

        //9. Вывод времени
        int givenSeconds = 86399;
        int hours = (givenSeconds / 60) / 60;
        int minutes = (givenSeconds / 60) % 60;
        int seconds = givenSeconds % 60;

        System.out.println("\n9. Вывод времени");
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
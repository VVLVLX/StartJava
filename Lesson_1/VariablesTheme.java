public class VariablesTheme {

    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера");
        byte coresNumber = 6;
        float cpu = 2.38f;
        double maxCoreSupplyVoltage = 1.219d;
        char gpuType = 'i';
        short ram = 16;
        int frequency = 3200;
        long rom = 244242608126L;
        boolean isFast = "ssd" == "ssd";
        System.out.println("Number of processor cores: " + coresNumber + " pcs.\n" + 
                "CPU frequency: " + cpu + " GHz\n" + 
                "Max. core supply voltage: " + maxCoreSupplyVoltage + " V\n" + 
                "GPU type: " + gpuType + " - integrated\n" + 
                "RAM: " + ram + " Gb\n" + 
                "RAM frequency: " + frequency + " MHz\n" + 
                "ROM: " + rom + " bytes\n" + 
                "ROM fast type: " + isFast);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        short penPrice = 100;
        short bookPrice = 200;
        int sumGoods = (penPrice + bookPrice);
        float discount = 0.11f;
        float discountSum = sumGoods * discount;
        float discountPrice = sumGoods - discountSum;
        System.out.println("Общая стоимость товаров без скидки: " + sumGoods + " руб.\n" + 
                "Cумма скидки: " + discountSum + " руб.\n" + 
                "Общая стоимость товаров со скидкой: " + discountPrice + " руб.");

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    \n" + "   J   a a  v   v  a a   \n" + 
                "J  J  aaaaa  v v  aaaaa  \n" + " JJ  a     a  v  a     a ");

        //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        byte byteNumInc = byteNum;
        byteNumInc++;
        byte byteNumDec = byteNum;
        byteNumDec--;
        System.out.println("Первоначальное значение для byte: " + byteNum + "\n" + 
                "Значение для byte после инкремента на единицу: " + byteNumInc + "\n" + 
                "Значение для byte после декремента на единицу: " + byteNumDec);

        short shortNum = 32767;
        short shortNumInc = shortNum;
        shortNumInc++;
        short shortNumDec = shortNum;
        shortNumDec--;
        System.out.println("Первоначальное значение для short: " + shortNum + "\n" + 
                "Значение для short после инкремента на единицу: " + shortNumInc + "\n" + 
                "Значение для short после декремента на единицу: " + shortNumDec);

        int intNum = 2147483647;
        int intNumInc = intNum;
        intNumInc++;
        int intNumDec = intNum;
        intNumDec--;
        System.out.println("Первоначальное значение для int: " + intNum + "\n" + 
                "Значение для int после инкремента на единицу: " + intNumInc + "\n" + 
                "Значение для int после декремента на единицу: " + intNumDec);

        long longNum = 9223372036854775807L;
        long longNumInc = longNum;
        longNumInc++;
        long longNumDec = longNum;
        longNumDec--;
        System.out.println("Первоначальное значение для long: " + longNum + "\n" + 
                "Значение для long после инкремента на единицу: " + longNumInc + "\n" + 
                "Значение для long после декремента на единицу: " + longNumDec);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        
        System.out.println("Перестановка с помощью третьей переменной\n" + 
                "Исходные значения: переменная_1 = " + num1 + "; переменная_2 = " + num2 + ";");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Новые значения: переменная_1 = " + 
                num1 + "; переменная_2 = " + num2 + ";");

        System.out.println("Перестановка с помощью арифметических операций\n" + 
                "Исходные значения: переменная_1 = " + num1 + "; переменная_2 = " + num2 + ";");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: переменная_1 = " + 
                num1 + "; переменная_2 = " + num2 + ";");

        System.out.println("Перестановка с помощью побитовой операции\n" + 
                "Исходные значения: переменная_1 = " + num1 + "; переменная_2 = " + num2 + ";");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: переменная_1 = " + 
                num1 + "; переменная_2 = " + num2 + ";");

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#' ;
        char ampersand = '&' ;
        char atsign = '@' ;
        char caret = '^' ;
        char underscore = '_' ;
        System.out.println((int) hash + " " + hash + "\n" +
                (int) ampersand +  " " + ampersand + "\n" + 
                (int) atsign +  " " + atsign + "\n" + 
                (int) caret +  " " + caret + "\n" + 
                (int) underscore +  " " + underscore);

        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + "" + backSlash + "\n" + "   " + slash + "  " + 
                backSlash + "\n" + "  " + slash + "" + underScore + openBracket + " " + 
                closeBracket + "" + backSlash + "\n" + " " + slash + "      " + backSlash + "\n" + 
                slash + "" + underScore + "" + underScore + "" + underScore + "" + underScore + 
                slash + "" + backSlash + "" + underScore + "" + underScore + "" + backSlash);

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int givenNum = 123;
        int hundreds = givenNum / 100;
        int tens = (givenNum % 100) / 10;
        int ones = givenNum % 10;
        int product = hundreds * tens * ones;
        int summ = hundreds + tens + ones;
        System.out.println("Число " + givenNum + " содержит: " + 
                hundreds + " сотен, " + tens + " десятков, " + ones + " единиц;\n" + 
                "Сумма его цифр = " + summ + ", произведение его цифр = " + product + ";");

        //9. Вывод времени
        System.out.println("\n9. Вывод времени");
        int givenSeconds = 86399;
        int hours = (givenSeconds / 60) / 60;
        int minutes = (givenSeconds / 60) % 60;
        int seconds = givenSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
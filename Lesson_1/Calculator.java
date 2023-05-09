public class Calculator {

    public static void main(String[] args) {
    //Калькулятор
        System.out.println("Калькулятор");
        int a = 10; // Введи число;
        int b = 3; // Введи число;
        char sign = '?'; // Введи знак арифметической операции в '': +, -, *, /, ^, %;
        int result = a;
        if (a % 1 == 0 && a > 0 && b % 1 == 0 && b > 0) {
            if (sign == '+') {
                result = a + b;
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else if (sign == '-') {
                result = a - b;
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else if (sign == '*') {
                result = a * b;
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else if (sign == '/') {
                result = a / b;
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else if (sign == '^') {
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else if (sign == '%') {
                result = a % b;
                System.out.println(a + "" + sign + "" + b + "=" + "" + result);
            } else {
                System.out.println("Ошибка! Можно вводить только знаки" + 
                        " арифметических операций: +, -, *, /, ^, %");
            }
        } else {
            System.out.println("Ошибка! Можно вводить только целые, положительные числа!");
        }
    }
}
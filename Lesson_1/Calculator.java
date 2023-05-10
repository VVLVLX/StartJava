public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int a = 10;
        int b = 3;
        char sign = '^';
        int result = 0;
        if (a % 1 == 0 && a > 0 && b % 1 == 0 && b > 0) {
            if (sign == '+' || sign == '-' || sign == '*' ||
                    sign == '/' || sign == '^' || sign == '%') {
                if (sign == '+') {
                    result = a + b;
                } else if (sign == '-') {
                    result = a - b;
                } else if (sign == '*') {
                    result = a * b;
                } else if (sign == '/') {
                    result = a / b;
                } else if (sign == '^') {
                    for (int i = 1; i < b; i++) {
                        result *= a;
                    }
                } else if (sign == '%') {
                    result = a % b;
                }
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


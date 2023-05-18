public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int a = 12;
        int b = 0;
        char sign = '/';
        if (a % 1 == 0 && a >= 0 && b % 1 == 0 && b >= 0) {
            int result = 1;
            switch(sign) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;    
                case '/':
                    if (b == 0) {
                        System.out.println("Ошибка! На ноль делить нельзя!");
                    } else {
                        result = a / b;
                    }
                    break;
                case '^':
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                    break;
                case '%':
                    result = a + b;
                    break;
                default:
                    System.out.println("Ошибка! Можно вводить только знаки" +
                            " арифметических операций: +, -, *, /, ^, %");
            }
            System.out.println(a + "" + sign + "" + b + "=" + "" + result);
        } else {
            System.out.println("Ошибка! Можно вводить только целые, положительные числа!");
        }
    }
}

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        int num1 = 0;
        boolean isNumRight = true;
        char operator = '+';
        char[] operators = {'+', '-', '*', '/', '^', '%'};
        boolean isOperatorRight = true;
        int num2 = 0;
        String userAnswer = "";
        int calculate = 0;
        do {
            do {
                System.out.print("Введите число: ");
                num1 = scanner.nextInt();
                isNumRight = (num1 >= 0 && num1 % 1 == 0);
                if (!isNumRight) {
                    System.out.println("Ошибка! Можно вводить только целые, "
                            + "положительные числа!");
                }
            } while (!isNumRight);
            calculator.setNum1(num1);
            do {
                System.out.print("Введите знак математической операции: ");
                operator = scanner.next().charAt(0);
                for (int i = 0; i < operators.length; i++) {
                    if (operator == operators[i]) {
                        isOperatorRight = true;
                        break;
                    } else {
                        isOperatorRight = false;
                    }
                }
                if (!isOperatorRight) {
                    System.out.println("Ошибка! Можно вводить только знаки" +
                            " арифметических операций: +, -, *, /, ^, %");
                }
            } while (!isOperatorRight);
            calculator.setOperator(operator);
            do {
                System.out.print("Введите число: ");
                num2 = scanner.nextInt();
                isNumRight = (num2 >= 0 && num1 % 1 == 0);
                if (!isNumRight) {
                    System.out.println("Ошибка! Можно вводить только целые, "
                            + "положительные числа!");
                }
            } while (!isNumRight);
            calculator.setNum2(num2);
            calculate = calculator.calculate(num1, operator, num2);
            System.out.println(calculator.getNum1() + " " + calculator.getOperator() + " "
                    + calculator.getNum2() + " = " + calculate);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
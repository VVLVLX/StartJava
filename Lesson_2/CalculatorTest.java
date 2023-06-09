//Модифицируйте программу “Калькулятор”:

import java.util.Scanner;

public class CalculatorTest {

    public static int inputNum() {
        Scanner scanner = new Scanner(System.in); 
        int num = 0;
        boolean isNumRight = true;
        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            isNumRight = (num >= 0 && num % 1 == 0);
            if (!isNumRight) {
                System.out.println("Ошибка! Можно вводить только целые, "
                        + "положительные числа!");
            }
        } while (!isNumRight);
        return num;
    }

    public static char inputOperator() {
        Scanner scanner = new Scanner(System.in); 
        char operator = '+';
        char[] operators = {'+', '-', '*', '/', '^', '%'};
        boolean isOperatorRight = true;   
        do {
            System.out.print("Введите знак математической операции: ");
            operator = scanner.next().charAt(0);
            for (int i = 0; i < operators.length; i++) {
                if (operator == operators[i]) {
                    isOperatorRight = true;
                    break;
                }
                isOperatorRight = false;
            }
            if (!isOperatorRight) {
                System.out.println("Ошибка! Можно вводить только знаки" +
                        " арифметических операций: +, -, *, /, ^, %");
            }
        } while (!isOperatorRight);
        return operator;
    }

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        char operator = '+';
        int num2 = 0;        
        String userAnswer = "";
        int calculate = 0;        

        do {
            num1 = inputNum();
            calculator.setNum1(num1);
            operator = inputOperator();
            calculator.setOperator(operator);
            num2 = inputNum();
            calculator.setNum2(num2);
            calculate = calculator.calculate();
            System.out.println(calculator.getNum1() + " " + calculator.getOperator() + " "
                    + calculator.getNum2() + " = " + calculate);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
            
        } while (userAnswer.equals("yes"));
    }
}
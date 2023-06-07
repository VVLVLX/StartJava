import java.util.Scanner;

class Calculator {
    Scanner scanner = new Scanner(System.in);

    private int num1;
    private int num2;
    private char operator;

    public void setNum1(int num1) {
        boolean isNumRight = true;
        do {
            System.out.print("Введите число: ");
            num1 = scanner.nextInt();
            isNumRight = (num1 >= 0 && num1 % 1 == 0);
            if (!isNumRight) {
                System.out.println("Ошибка! Можно вводить только целые, "
                        + "положительные числа!");
            }
        } while (!isNumRight);
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        boolean isNumRight = true;
        do {
            System.out.print("Введите число: ");
            num2 = scanner.nextInt();
            isNumRight = (num2 >= 0 && num1 % 1 == 0);
            if (!isNumRight) {
                System.out.println("Ошибка! Можно вводить только целые, "
                        + "положительные числа!");
            }
        } while (!isNumRight);
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOperator(char operator) {
        char[] operators = {'+', '-', '*', '/', '^', '%'};
        operator = '+';
        boolean isOperatorRight = true;
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
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public int calculate(int num1, char operator, int num2) {
        num1 = getNum1();
        operator = getOperator();
        num2 = getNum2();
        int calculate = 1;
        switch(operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя!");
                    break;
                } else {
                    return num1 / num2;
                }
            case '^':
                for (int i = 1; i <= num2; i++) {
                    calculate *= num1;
                }
                break;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Ошибка! Можно вводить только знаки" +
                        " арифметических операций: +, -, *, /, ^, %");
            }
        return calculate;
    }
}
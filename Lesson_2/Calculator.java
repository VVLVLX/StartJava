class Calculator {
    Scanner scanner = new Scanner(System.in);
    
    public int setInt() {
        int num = 1;
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
    
    public char setOperator() {
        char[] operators = {'+', '-', '*', '/', '^', '%'};
        char operator = '+';
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
        return operator;
    }

    public int result(int num1, char sign, int num2) {
        int result = 1;
        switch(sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;    
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя!");
                    break;
                } else {
                    result = num1 / num2;
                }
                break;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Ошибка! Можно вводить только знаки" +
                        " арифметических операций: +, -, *, /, ^, %");
            }
        return result;
    }
}
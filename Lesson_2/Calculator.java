class Calculator {

    private int num1;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    private char operator;

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    private int num2;
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public int calculate() {
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
                }
                return num1 / num2;
            case '^':
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Ошибка! Можно вводить только знаки" +
                        " арифметических операций: +, -, *, /, ^, %");
        }
        return 0;
    }
}
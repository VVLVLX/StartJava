import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        String userAnswer;
        do {
            int num1 = 0;
            calculator.setNum1(num1);
            char operator = '+';
            calculator.setOperator(operator);
            int num2 = 0;
            calculator.setNum2(num2);
            int calculate = calculator.calculate(num1, operator, num2);
            System.out.println(calculator.getNum1() + " " + calculator.getOperator() + " "
                    + calculator.getNum2() + " = " + calculate);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
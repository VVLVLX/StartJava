import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Calculator calculator = new Calculator();
        String positiveAnswer = "yes";
        String negativeAnswer = "no";
        String userAnswer;     
        boolean checkPositiveAnswer;
        boolean checkNegativeAnswer;
        boolean checkWrongAnswer;
        Scanner scanner = new Scanner(System.in);
        do {
            int num1 = calculator.setInt();
            char sign = calculator.setOperator();
            int num2 = calculator.setInt();
            int result = calculator.result(num1, sign, num2);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userAnswer = scanner.nextLine();
                checkPositiveAnswer = userAnswer.equals(positiveAnswer);
                checkNegativeAnswer = userAnswer.equals(negativeAnswer);
                checkWrongAnswer = !checkPositiveAnswer && !checkNegativeAnswer;
            } while (checkWrongAnswer);
        } while (checkPositiveAnswer);
    }
}
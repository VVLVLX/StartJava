//Модифицируйте программу “Угадай число”:
import java.util.Scanner;

class GuessNumberTest {
    public static void main (String[] args) {
        System.out.println("Игра Угадай число");
        String positiveAnswer = "yes";
        String negativeAnswer = "no";
        String userAnswer;     
        boolean checkPositiveAnswer;
        boolean checkNegativeAnswer;
        boolean checkWrongAnswer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите имя игрока №1");
            String name1 = scanner.nextLine();
            Player player1 = new Player(name1);
            
            System.out.println("Введите имя игрока №2");
            String name2 = scanner.nextLine();
            Player player2 = new Player(name2);
            
            String result = GuessNumber.guessNumber(name1, name2);
            System.out.println("Победил игрок " + result);
            do {
                System.out.println("Хотите играть ещё? [yes/no]:");
                userAnswer = scanner.nextLine();
                checkPositiveAnswer = userAnswer.equals(positiveAnswer);
                checkNegativeAnswer = userAnswer.equals(negativeAnswer);
                checkWrongAnswer = !checkPositiveAnswer && !checkNegativeAnswer;
            } while (checkWrongAnswer);
        } while (checkPositiveAnswer);
    }
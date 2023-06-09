//Модифицируйте программу “Угадай число”:
import java.util.Scanner;

class GuessNumberTest {

    public static int inputNumber() {
        int playerNumber = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Какое число в полуинтервале [0, 100) загадал компьютер?");
            playerNumber = scanner.nextInt();
        } while (playerNumber < 0 || playerNumber >= 100);
        return playerNumber;
    }

    public static void main (String[] args) {
        System.out.println("Игра Угадай число");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя игрока №1");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        int player1Number = 0;
        player1.setNumber(player1Number);

        System.out.println("Введите имя игрока №2");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        int player2Number = 0;
        player2.setNumber(player2Number);        

        int playerNumber = 0;
        int hiddenNumber = 0;
        int turn = 1;
        String winner = name1;
        String userAnswer = "";

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            hiddenNumber = game.guessNumber();
            do {
                playerNumber = inputNumber();
                if (playerNumber == hiddenNumber) {
                    if (turn % 2 != 0) {
                        winner = name1;
                    } else if (turn % 2 == 0) {
                        winner = name2;
                    }
                } else if (playerNumber > hiddenNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер!");
                } else if (playerNumber < hiddenNumber) {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер!");
                }
                turn++;
            } while (playerNumber != hiddenNumber);
            System.out.println("Победил игрок " + winner);            
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                userAnswer = scanner.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
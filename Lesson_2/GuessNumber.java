import java.util.Scanner;

class GuessNumber {
    public static String guessNumber(String name1, String name2) {
        int hiddenNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int playerNumber = 0;
        int player1Number;
        int player2Number;
        int turn = 1;
        String winner = name1;
        do {
            do {
                System.out.println("Какое число в полуинтервале [0, 100) загадал компьютер?");
                if (turn % 2 != 0) {
                    player1Number = scanner.nextInt();
                    playerNumber = player1Number; 
                } else if (turn % 2 == 0) {
                    player2Number = scanner.nextInt();
                    playerNumber = player2Number;
                }        
            } while (playerNumber < 0 || playerNumber >= 100);
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
        return winner;
    }
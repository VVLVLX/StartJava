public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Игра Угадай число");
        int leftExcluding = 0;
        int rightIncludig = 100;
        int hiddenNum = 30;
        int playerNum = 20;
        if (playerNum > leftExcluding && playerNum <= rightIncludig) {
            if (playerNum > hiddenNum) {
                do {
                    System.out.println("Число " + playerNum + " больше того, что загадал компьютер!");
                    playerNum--;
                } while (playerNum > hiddenNum);
            } else if (playerNum < hiddenNum) {
                do {
                    System.out.println("Число " + playerNum + " меньше того, что загадал компьютер!");
                    playerNum++;
                } while (playerNum < hiddenNum);
            }
            System.out.println("Вы победили!");
        } else {
            System.out.println("Компьютер загадывает целые числа в полуинтервале (0, 100]!");
        }
    }
}
public class MyFirstGame {

    public static void main(String[] args) {
        //Игра Угадай число
        System.out.println("Игра Угадай число");
        int leftExcluding = 0;
        int rightIncludig = 100;
        int hiddenNum = 43; //Компьютер загадывает целое число в полуинтервале (0, 100];
        int playerNum = 37; //Число, которое предлагает игрок;
        if (playerNum > leftExcluding && playerNum <= rightIncludig){
            if (playerNum > hiddenNum) {
                do {
                    if (playerNum == hiddenNum) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Число " + playerNum + " больше того, что загадал компуктер!");
                    }
                    playerNum--;
                } while (playerNum >= hiddenNum);
            } else if (playerNum < hiddenNum) {
                do {
                    if (playerNum == hiddenNum) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Число " + playerNum + " меньше того, что загадал компуктер!");
                    }
                    playerNum++;
                } while (playerNum <= hiddenNum);
            } else {
                System.out.println("Вы победили!");
            }
        } else {
            System.out.println("Компуктер загадывает целые числа в полуинтервале (0, 100]!");
        }
    }
}
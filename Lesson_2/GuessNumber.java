class GuessNumber {

    Player player1;
    Player player2;

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int guessNumber() {
        int hiddenNumber = (int) (Math.random() * 100);
        return hiddenNumber;
    }
}
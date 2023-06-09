class Player {

    private int playerNumber;

    public void setNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getNumber() {
        return playerNumber;
    }

    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Player(String name) {
        this.name = name;
    }
}
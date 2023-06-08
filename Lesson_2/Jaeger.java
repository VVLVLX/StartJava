class Jaeger {
    private String name;
    private int strength;
    private int armor;
    private String weapon;
    public String powerMove(String move) {
        return move;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    } 
    
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Jaeger() {
        name = "";
        strength = 0;
        armor = 0;
        weapon = "";
    }
    
    public Jaeger(String name, int strength, int armor, String weapon) {
        this.name = name;
        this.strength = strength;
        this.armor = armor;
        this.weapon = weapon;
    }
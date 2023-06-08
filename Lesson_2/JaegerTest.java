// Модифицируйте класс Jaeger
public class JaegerTest {
    public static void main (String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Crimson Typhoon");
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setWeapon("IB22 Plasmacaster");
        String jaeger1Move = jaeger1.powerMove("Jet Kick");        
        Jaeger jaeger2 = new Jaeger("Tacit Ronin", 7, 3, "Fangblades");
        String jaeger2Move = jaeger2.powerMove("Cobra Strike");        
        System.out.printf("%-20s %-10s %-10s %-20s %-20s %n", "Name:",
                "Strength:", "Armor:", "Weapon:", "Power Move On:");
        System.out.println("-------------------------------------" +
                "-----------------------------------------");
        System.out.printf("%-20s %-10d %-10d %-20s %-20s %n",
                jaeger1.getName(), jaeger1.getStrength(),
                jaeger1.getArmor(), jaeger1.getWeapon(), jaeger1Move);
        System.out.printf("%-20s %-10d %-10d %-20s %-20s %n",
                jaeger2.getName(), jaeger2.getStrength(),
                jaeger2.getArmor(), jaeger2.getWeapon(), jaeger2Move);
    }
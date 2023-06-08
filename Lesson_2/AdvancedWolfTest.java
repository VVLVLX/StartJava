//Модифицируйте класс WolfTest
public class AdvancedWolfTest {

    public static void main(String[] args) {
        AdvancedWolf firstWolf = new AdvancedWolf();
        firstWolf.setName("Хакер");
        firstWolf.setSex("самец");
        firstWolf.setColor("белый");
        firstWolf.setAge(3);
        firstWolf.setWeight(50);
        System.out.println("Профиль волка: Имя - " + firstWolf.getName() +
                ", Пол - " + firstWolf.getSex() + ", Цвет - " + firstWolf.getColor() +
                ", Возраст - " + firstWolf.getAge() + ", Вес - " + firstWolf.getWeight() + ".");
        firstWolf.move();
        firstWolf.run();
        firstWolf.sit();
        firstWolf.howl();
        firstWolf.hunt();
    }
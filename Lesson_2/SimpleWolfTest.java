//Создайте класс WolfTest с методом main
public class SimpleWolfTest {

    public static void main(String[] args) {
        SimpleWolf firstWolf = new SimpleWolf("Хакер", "самец", "белый", 3, 50);
        System.out.println("Профиль волка: Имя - " + firstWolf.name +
                ", Пол - " + firstWolf.sex + ", Цвет - " + firstWolf.color +
                ", Возраст - " + firstWolf.age + ", Вес - " + firstWolf.weight + ".");
        firstWolf.move();
        firstWolf.run();
        firstWolf.sit();
        firstWolf.howl();
        firstWolf.hunt();
    }
//Создайте класс Wolf
class SimpleWolf {

    String name;
    String sex;
    String color;
    int age;
    int weight;

    public SimpleWolf(String name, String sex, String color, int age, int weight) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void move() {
        System.out.println("Идёт");
    }

    void run() {
        System.out.println("Бежит");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void howl() {
        System.out.println("Воет");
    }

    void hunt() {
        System.out.println("Охотится");
    }
}
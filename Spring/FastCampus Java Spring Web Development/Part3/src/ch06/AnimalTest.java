package ch06;

class Animal {

    public void move() {
        System.out.println("Animal is moving");
    }

}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("Human is moving");

    }

    public void read() {
        System.out.println("Human is reading");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("Tiger is moving");

    }

    public void hunt() {
        System.out.println("Human is hunting");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

    }
}

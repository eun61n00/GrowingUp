package ch08;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");

    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");

    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 움직입니다.");
    }

    public void fly() {
        System.out.println("독수리가 하늘을 납니다.");
    }

}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        test.testDownCasting(animalArrayList);

    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (Animal animal : list) {
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.read();
            }
            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
            else {
                System.out.println("unsupported type");
            }
        }
    }
}

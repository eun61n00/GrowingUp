package ch09;

public class Main {

    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer myNotebook = new MyNotebook();

        desktop.display();
        desktop.typing();
        desktop.turnOn();
        desktop.turnOff();

        myNotebook.display();
        myNotebook.typing();
        myNotebook.turnOn();
        myNotebook.turnOff();
    }

}

package ch16.gamelevel;

public class Main {

    public static void main(String[] args) {

        PlayerLevel BeginnerLevel = new BeginnerLevel();
        PlayerLevel AdvancedLevel = new AdvancedLevel();
        PlayerLevel SuperLevel = new SuperLevel();

        Player player0 = new Player();
        Player player1 = new Player(AdvancedLevel);
        Player player2 = new Player(SuperLevel);

        player0.play(2);
        player1.play(3);
        player2.play(1);

        player0.upgradeLevel(SuperLevel);
        player0.play(4);

    }

}

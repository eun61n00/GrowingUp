package ch16.gamelevel;

public class Player {

    public Player() {
        this.level = new BeginnerLevel();
    }

    public Player(PlayerLevel level) {
        this.level = level;
    }

    PlayerLevel level;

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        System.out.println("\tLevel upgraded");
        this.level = level;
    }

    public void play(int count) {
        level.go(count);
    }
}

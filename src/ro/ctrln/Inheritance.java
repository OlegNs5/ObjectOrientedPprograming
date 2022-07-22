package ro.ctrln;

public class Inheritance {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Trran Batleship");
        battleship.setBattleshipCapacity(20000);
        System.out.println(battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destryor");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(20);
        System.out.println(imperialStarDestroyer);
    }
}

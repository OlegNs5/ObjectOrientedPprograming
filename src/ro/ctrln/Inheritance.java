package ro.ctrln;

public class Inheritance {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Trran Batleship");
        battleship.setBattleshipCapacity(20000);
        System.out.println("batleship: "+battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destryor");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(20);
        System.out.println("ImperialStarDestroyer is: "+imperialStarDestroyer);

        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");
        System.out.println("Velosity XWingStarfitghter is; " + xWingStarfighter.computeWarpSpeed(3,1000));
        xWingStarfighter.warp();
        System.out.println("XWingStarfighter is: "+xWingStarfighter);

        TieFitghter tieFitghter = new TieFitghter();
        tieFitghter.setStarshipDestination("base");
        System.out.println("Velosity for TieFighter is; "+ tieFitghter.computeWarpSpeed(3,1000));
        tieFitghter.warp();
        System.out.println("tieFtghter is "+ tieFitghter);
    }
}

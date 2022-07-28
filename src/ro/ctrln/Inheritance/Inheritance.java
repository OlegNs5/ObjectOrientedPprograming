package ro.ctrln.Inheritance;

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

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        System.out.println("Velosity for TieFighter is; "+ tieFighter.computeWarpSpeed(3,1000));
        tieFighter.warp();
        System.out.println("tieFtghter is "+ tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10 );
        falconHeavy.setDestination("Moon");
        System.out.println("This is " + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        System.out.println("FlaconHeavy is: "+ falconHeavy);

        falconHeavy.lauchCoutdown();
    }
}

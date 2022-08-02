package ro.ctrln.Inheritance;

import ro.ctrln.util.ProjectUtils;

public class Inheritance {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Trran Batleship");
        battleship.setBattleshipCapacity(20000);
       ProjectUtils.printMessage("batleship: "+battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destryor");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(20);
       ProjectUtils.printMessage("ImperialStarDestroyer is: "+imperialStarDestroyer);

        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");
       ProjectUtils.printMessage("Velosity XWingStarfitghter is; " + xWingStarfighter.computeWarpSpeed(3,1000));
        xWingStarfighter.warp();
       ProjectUtils.printMessage("XWingStarfighter is: "+xWingStarfighter);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
       ProjectUtils.printMessage("Velosity for TieFighter is; "+ tieFighter.computeWarpSpeed(3,1000));
        tieFighter.warp();
       ProjectUtils.printMessage("tieFtghter is "+ tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10 );
        falconHeavy.setDestination("Moon");
       ProjectUtils.printMessage("This is " + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
       ProjectUtils.printMessage("FlaconHeavy is: "+ falconHeavy);

        falconHeavy.lauchCoutdown();
    }
}

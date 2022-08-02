package ro.ctrln.polymorphism;

import ro.ctrln.Inheritance.*;
import ro.ctrln.util.ProjectUtils;

public class StarPortUsege {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setDestination("FalconHeavy waiting to fly");
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");
        TieFighter tieFighter = new TieFighter();
       // tieFighter.computeWarpSpeed(5,5);
        tieFighter.setStarshipDestination("TieFighter waiting to fight");

        StarPort starPort = new StarPort();
        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        ProjectUtils.printMessage(starPort);


// -------------------------------------*************---------------------------
        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarfighter();
       starshipTwo.setStarshipDestination("base");
        Starship starshipThree = new TieFighter();

        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

       // FalconHeavy falconHeavyOne = new Battleship(); NU pot face cast de la obiect de tipul copil la un obiect de tipul parinte

        starPort.setStarship(starshipOne); //instatierea cu o clasa copil FlconHeavy spre starship prin starshipOne
        starPort.flyToSpace();
      //  ProjectUtils.printMessage(starPort);

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
       ProjectUtils.printMessage(starPort);

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();

    }

}

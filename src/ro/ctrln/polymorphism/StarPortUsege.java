package ro.ctrln.polymorphism;

import ro.ctrln.Inheritance.*;

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
        System.out.println(starPort);

        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        System.out.println(starPort);
// -------------------------------------*************---------------------------
        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarfighter();
       starshipTwo.setStarshipDestination("base");
        Starship starshipThree = new TieFighter();

        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

       // FalconHeavy falconHeavyOne = new Battleship(); NU pot face cast de la obiect de tipul copil la un obiect de tipul parinte

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();
      //  System.out.println(starPort);

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
       System.out.println(starPort);

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();

    }

}

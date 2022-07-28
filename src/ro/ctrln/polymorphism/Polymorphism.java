package ro.ctrln.polymorphism;

import ro.ctrln.Inheritance.*; // " * " Aduce si Imprteaza toate clasele din  "ro.ctrln.Inheritance."

public class Polymorphism {
    public static void main(String[] args) {
        Battleship            battleship = new Battleship();
        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        TieFighter            tieFighter = new TieFighter();
        XWingStarfighter      xWingStarfighter = new XWingStarfighter();
        FalconHeavy           falconHeavy = new FalconHeavy();

        System.out.println("battleship instanceof Objects: " + (battleship instanceof Object));
        System.out.println("battleship instanceof Battleship: " + (battleship instanceof Battleship));
        System.out.println("battleship instanceof ImperialStarDestroyer: "+ (battleship instanceof ImperialStarDestroyer));
        System.out.println("imperialStarDestroyer instanceof object: " + (imperialStarDestroyer instanceof Object));
        System.out.println("imperialStarDestroyer instanceof ImperialStarDestroyer: " + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        System.out.println("imperialStarDestroyer instanceof Battleship: " +(imperialStarDestroyer instanceof Battleship));
        //System.out.println("imperialStarDestroyer instanceof TieFitghter" + (imperialStarDestroyer instanceof TieFitghter)); Aceste doua Classe nu au nimic in comun
        System.out.println("tieFitghter instanceof Object: " + (tieFighter instanceof Object));
        System.out.println("tieFitghter instanceof TieFitghter: " + (tieFighter instanceof TieFighter));
        System.out.println("tieFighter instanceof Starship: " + (tieFighter instanceof Starship));
        //System.out.println("tieFighter instanceof ImperialStarDestroyer: " + (tieFighter instanceof ImperialStarDestroyer));

        System.out.println("battleship instanceof FalconHeavy:  "+ (battleship instanceof FalconHeavy));
        System.out.println("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        System.out.println("xWingStarfighter instanceof Object: " + (xWingStarfighter instanceof Object));
        System.out.println("xWingStarfighter instanceof XWingStarfighter: " + (xWingStarfighter instanceof XWingStarfighter));
        System.out.println("xWingStarfighter instanceof Starship: " + (xWingStarfighter instanceof Starship));
        System.out.println("xWingStarfighter instanceof Rocket: " + (xWingStarfighter instanceof Rocket));

        System.out.println("falconHeavy instanceof Object: " + (falconHeavy instanceof Object));
        System.out.println("falconHeavy instanceof FalconHeavy: " + (falconHeavy instanceof FalconHeavy));
        System.out.println("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        System.out.println("falconHeavy instanceof Starship: " + (falconHeavy instanceof Starship));
        System.out.println("falconHeavy instanceof Rocket: " + (falconHeavy instanceof Rocket));
        //System.out.println("falconHeavy instanceof TieFighter: " + (falconHeavy instanceof TieFighter));

    }

}

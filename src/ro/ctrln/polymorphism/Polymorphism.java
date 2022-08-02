package ro.ctrln.polymorphism;

import ro.ctrln.Inheritance.*; // " * " Aduce si Imprteaza toate clasele din  "ro.ctrln.Inheritance."
import ro.ctrln.util.ProjectUtils;

public class Polymorphism {
    public static void main(String[] args) {
        Battleship            battleship = new Battleship();
        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        TieFighter            tieFighter = new TieFighter();
        XWingStarfighter      xWingStarfighter = new XWingStarfighter();
        FalconHeavy           falconHeavy = new FalconHeavy();

        ProjectUtils.printMessage("battleship instanceof Objects: " + (battleship instanceof Object));
        ProjectUtils.printMessage("battleship instanceof Battleship: " + (battleship instanceof Battleship));
        ProjectUtils.printMessage("battleship instanceof ImperialStarDestroyer: "+ (battleship instanceof ImperialStarDestroyer));
        ProjectUtils.printMessage("imperialStarDestroyer instanceof object: " + (imperialStarDestroyer instanceof Object));
        ProjectUtils.printMessage("imperialStarDestroyer instanceof ImperialStarDestroyer: " + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        ProjectUtils.printMessage("imperialStarDestroyer instanceof Battleship: " +(imperialStarDestroyer instanceof Battleship));
        //ProjectUtils.printMessage("imperialStarDestroyer instanceof TieFitghter" + (imperialStarDestroyer instanceof TieFitghter)); Aceste doua Classe nu au nimic in comun
        ProjectUtils.printMessage("tieFitghter instanceof Object: " + (tieFighter instanceof Object));
        ProjectUtils.printMessage("tieFitghter instanceof TieFitghter: " + (tieFighter instanceof TieFighter));
        ProjectUtils.printMessage("tieFighter instanceof Starship: " + (tieFighter instanceof Starship));
        //ProjectUtils.printMessage("tieFighter instanceof ImperialStarDestroyer: " + (tieFighter instanceof ImperialStarDestroyer));

        ProjectUtils.printMessage("battleship instanceof FalconHeavy:  "+ (battleship instanceof FalconHeavy));
        ProjectUtils.printMessage("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        ProjectUtils.printMessage("xWingStarfighter instanceof Object: " + (xWingStarfighter instanceof Object));
        ProjectUtils.printMessage("xWingStarfighter instanceof XWingStarfighter: " + (xWingStarfighter instanceof XWingStarfighter));
        ProjectUtils.printMessage("xWingStarfighter instanceof Starship: " + (xWingStarfighter instanceof Starship));
        ProjectUtils.printMessage("xWingStarfighter instanceof Rocket: " + (xWingStarfighter instanceof Rocket));

        ProjectUtils.printMessage("falconHeavy instanceof Object: " + (falconHeavy instanceof Object));
        ProjectUtils.printMessage("falconHeavy instanceof FalconHeavy: " + (falconHeavy instanceof FalconHeavy));
        ProjectUtils.printMessage("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        ProjectUtils.printMessage("falconHeavy instanceof Starship: " + (falconHeavy instanceof Starship));
        ProjectUtils.printMessage("falconHeavy instanceof Rocket: " + (falconHeavy instanceof Rocket));
        //ProjectUtils.printMessage("falconHeavy instanceof TieFighter: " + (falconHeavy instanceof TieFighter));

    }

}

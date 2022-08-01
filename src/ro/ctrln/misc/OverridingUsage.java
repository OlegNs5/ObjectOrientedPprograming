package ro.ctrln.misc;

import ro.ctrln.Inheritance.Battleship;
import ro.ctrln.Inheritance.FalconHeavy;

public class OverridingUsage {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.escapeProccedure(3);
        System.out.println("{---------------------}");

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.escapeProccedure(10);
    }
}

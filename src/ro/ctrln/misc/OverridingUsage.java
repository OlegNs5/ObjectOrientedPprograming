package ro.ctrln.misc;

import ro.ctrln.Inheritance.Battleship;
import ro.ctrln.Inheritance.FalconHeavy;
import ro.ctrln.util.ProjectUtils;

public class OverridingUsage {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.escapeProccedure(3);
        ProjectUtils.printMessage("{---------------------}");

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.escapeProccedure(10);
    }
}

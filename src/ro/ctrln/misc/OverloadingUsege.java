package ro.ctrln.misc;

import ro.ctrln.Inheritance.FalconHeavy;
import ro.ctrln.util.ProjectUtils;

public class OverloadingUsege {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
                                        ///***Apelam metodele din FalconHeavy***///
                                        //fiecare metoda se apeleaza in functie de tipul ei de date
        falconHeavy.escapeProccedure(10);
        ProjectUtils.printMessage("----------------------");
        falconHeavy.escapeProccedure(15,true);
        ProjectUtils.printMessage("----------------------");
        falconHeavy.escapeProccedure();
        ProjectUtils.printMessage("----------------------");
        falconHeavy.escapeProccedure(true,false,true,false,true);
        ProjectUtils.printMessage("----------------------");
        ProjectUtils.printMessage(falconHeavy.escapeProccedure(false));
    }
}

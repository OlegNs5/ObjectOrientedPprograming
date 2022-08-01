package ro.ctrln.misc;

import ro.ctrln.Inheritance.FalconHeavy;

public class OverloadingUsege {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
                                        ///***Apelam metodele din FalconHeavy***///
                                        //fiecare metoda se apeleaza in functie de tipul ei de date
        falconHeavy.escapeProccedure(10);
        System.out.println("----------------------");
        falconHeavy.escapeProccedure(15,true);
        System.out.println("----------------------");
        falconHeavy.escapeProccedure();
        System.out.println("----------------------");
        falconHeavy.escapeProccedure(true,false,true,false,true);
        System.out.println("----------------------");
        System.out.println(falconHeavy.escapeProccedure(false));
    }
}

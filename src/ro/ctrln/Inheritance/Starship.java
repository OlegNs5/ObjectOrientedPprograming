package ro.ctrln.Inheritance;

import java.util.Random;

public interface Starship {
                    //**CONSTANTE**//
    int FIRST_INT = 1;
    static int SECOND_INT = 2;
    static final int THIRD_INT =1;  //static, final si public sunt implicite in interfete

    void warp();

    void setStarshipDestination(String destination);//nu avem voie sa returnam nimic{}

    double computeWarpSpeed(int warpFactor, int lightYearsToDestination);

    default int productionID(){
        Random r = new Random();
        return FIRST_INT+(SECOND_INT-THIRD_INT)*r.nextInt(); //ce inseamna acest "next"?
    }
}

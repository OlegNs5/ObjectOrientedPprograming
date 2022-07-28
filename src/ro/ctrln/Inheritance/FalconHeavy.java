package ro.ctrln.Inheritance;



public class FalconHeavy extends Battleship implements Starship,Rocket {

    private String destination;

    @Override
    public void warp() {
        System.out.println("FalconHeavy doesn't warp! She goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String destination) {
        System.out.println( this.destination = getBattleshipName() + " goes to " + destination);//intoarce go to in star usege
        this.destination = getBattleshipName() + " goes to " + destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                " destination = " + destination +
                ", batlleshipName = " + getBattleshipName() +
                ", batlleshipCapacity = " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void lauchCoutdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Lauch sequece "+i);
        }
    }
}
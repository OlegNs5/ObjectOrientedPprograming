package ro.ctrln.polymorphism;

import ro.ctrln.Inheritance.Starship;

public class StarPort {
    private Starship starship;

    public void setStarship(Starship starship){
        this.starship = starship;
    }
    public Starship getStarship(){
        return this.starship;
    }
    public void flyToSpace(){
        starship.warp();
        //starship.setStarshipDestination("base");
    }

    @Override
    public String toString() {
        return "StarPort{" +
                "starship=" + starship +
                '}';
    }
}

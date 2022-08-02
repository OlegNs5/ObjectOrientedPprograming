package ro.ctrln.abstraction;

public class Abstraction {

    public static void main(String[] args) {
       // Trooper trooper = new Trooper();//clasele abstracte nu poate fi instantiata
        StormTrooper stormTrooper = new StormTrooper();
        System.out.println( stormTrooper.warCry());
        stormTrooper.fight("Luke Skywalker");
    }

}

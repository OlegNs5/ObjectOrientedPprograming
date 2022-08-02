package ro.ctrln.encapsulation;

import ro.ctrln.Inheritance.FalconHeavy;

/*
1.Metodele publice dintr-o superclasa (clase parinte) trebuiesc declarate tot publice in subclase
2.Metodele protcted intr-o superclasa pot fi declarate fie public fie protected//NU se pot folosi in afara PACHETELOR
3.Proprietatile declarate public sau protected in superclasa sunt mostenite de clasele copil//doar la un singu nivel
4.Metodele si proprietatile private nu sunt mostenite deloc,
5.Clasele declarate finale nu po fi mostenite
6.Clasele pot fi declarate atunci cand sunt clase interioare
*/
public class EncapsulationTrials {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("Falcon Heavy Encapsulation");
        falconHeavy.escapeProccedure(3);
    }
}

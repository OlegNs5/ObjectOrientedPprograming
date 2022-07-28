package ro.ctrln.Inheritance;
                        //*** POJO -  Plain Old Java Object ***//
import java.util.Objects;

public class Battleship {
    private String battleshipName;
    private int battleshipCapacity;

                        //*** Constructor ***//
//    public Battleship(){}
//
//    public Battleship(String battleshipName, int battleshipCapacity) {
//        this.battleshipName = battleshipName;
//        this.battleshipCapacity = battleshipCapacity;
//    }

                        //*** getter ***//
    public String getBattleshipName() {
        return battleshipName;
    }

    public int getBattleshipCapacity() {
        return battleshipCapacity;
    }
                         //*** setter ***//
    public void setBattleshipName(String battleshipName) {
        this.battleshipName = battleshipName;
    }

    public void setBattleshipCapacity(int battleshipCapacity){
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }
}

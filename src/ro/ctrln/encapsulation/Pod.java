package ro.ctrln.encapsulation;

public class Pod {
    //Clasa interioara
    private class Plane{

    }
    //Se pot mosteni una pe alta in interioru acestei clase publice
private class FlyMshine extends Plane{

}
}
//este private default package access mofifier//poate fi folosite in acelasi pachet//devine private automat
class TieFighterPod{

}
//private class TieFighterPod{}
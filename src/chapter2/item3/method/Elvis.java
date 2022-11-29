package chapter2.item3.method;

public class Elvis {
    private static final Elvis instance = new Elvis();
    private Elvis() {

    }
    public static Elvis getInstance() {
        return instance;
    }

    public void leaveTheBuilding() {

    }

}

package oop;

public class WheeledTransport implements Transport{
    private int wheelCount;
    private int maximumSpeed;

    public WheeledTransport(int wheelCount, int maximumSpeed) {
        this.wheelCount = wheelCount;
        this.maximumSpeed = maximumSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
    public void service(){
        System.out.printf("Обслужено колес - " + wheelCount + ".");
    }
}

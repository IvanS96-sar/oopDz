package oop;

public class MotorTransport extends WheeledTransport{
    private String engineType;
    public MotorTransport(int numberOfWheels, int maximumSpeed, String engineType) {
        super(numberOfWheels, maximumSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public void service(){
        super.service();
        System.out.println(" Обслужен " +"\""
                + engineType + "\"" + " тип двигателя.");
    }
}

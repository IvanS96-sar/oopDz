package oop;

public final class Bicycle extends WheeledTransport{
    private String typeOfBike;
    public Bicycle(int numberOfWheels, int maximumSpeed, String typeOfBike) {
        super(numberOfWheels, maximumSpeed);
        this.typeOfBike = typeOfBike;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    public void setTypeOfBike(String typeOfBike) {
        this.typeOfBike = typeOfBike;
    }
    @Override
    public  void service(){
        super.service();
        System.out.println(" Обслужено навесное оборудование велосипеда типа " +"\""
                + typeOfBike + "\"" + "." );
    }
    public final void ride(){
        System.out.println("Можно кататься");
    }
}

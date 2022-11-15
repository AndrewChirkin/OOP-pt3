package transport;

public class Bus extends Transport{
    private final int capacity;
    private int frequencyOfMovement; //минут
    private final String busType; // по количеству дверей


    public Bus(String brand, String model, String color, int productionYear, String productionCountry, double maxSpeed, int capacity, int frequencyOfMovement, String busType) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.busType = busType;
        this.capacity = capacity;
        this.frequencyOfMovement = frequencyOfMovement;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFrequencyOfMovement() {
        return frequencyOfMovement;
    }

    public void setFrequencyOfMovement(int frequencyOfMovement) {
        this.frequencyOfMovement = frequencyOfMovement;
    }

    public String getBusType() {
        return busType;
    }
    public void busInfo(){
        System.out.println("Автобус - " + getModel() + " " + getBrand() + " , страна производства " + getProductionCountry() + " , год производства " + getProductionYear() + " , вместимость - " + getCapacity());

    }
}

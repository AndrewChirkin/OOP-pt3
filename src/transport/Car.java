package transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireType;

    public Car(String brand, String model, String color, int productionYear, double engineVolume, String productionCountry, double maxSpeed, String transmission,String bodyType, String registrationNumber, int numberOfSeats, String tireType) {
    super(brand, model, color, productionYear,productionCountry, maxSpeed);
    this.engineVolume = engineVolume;
    this.transmission = transmission;
    this.bodyType = bodyType;
    this.registrationNumber = registrationNumber;
    this.numberOfSeats = numberOfSeats;
    this.tireType = tireType;

    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber.toLowerCase();
    }
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        if (tireType == "зимняя" || tireType == "летняя") {
            this.tireType = tireType;
        } else {
            System.out.println("Укажите тип резины(летняя или зимняя).");
        }
    }




}

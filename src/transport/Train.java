package transport;

public class Train extends Transport{
//            «Цена поездки»,
//            «Время поездки»,
//            «Название станции отбытия»,
//            «Конечная остановка»,
//            «Количество вагонов».
//    Создайте геттеры и сеттеры для необходимых полей, создайте конструкторы. Настройте проверки данных.
    private double tripPrice;
    private String tripTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, String color, int productionYear, String productionCountry,double maxSpeed, double tripPrice, String tripTime, String departureStation, String endingStation, int numberOfWagons) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.departureStation = departureStation;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }


    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}

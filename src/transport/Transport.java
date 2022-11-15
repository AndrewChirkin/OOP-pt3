package transport;

public class Transport {
//            «Марка»,
//            «Модель»,
//            «Год выпуска»,
//            «Страна производства»,
//            «Цвет кузова»,
//            «Максимальная скорость передвижения».
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }

    public int getProductionYear() {
        return Math.abs(productionYear);
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand != null && !brand.isBlank() && !brand.isEmpty()){
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model != null && !model.isEmpty() && !model.isBlank()){
            this.model = model;
        }
    }

//    Создайте геттеры и сеттеры для необходимых полей.
//    Параметры «Год выпуска», «Страна производства» не могут изменяться, «Цвет», «Скорость» меняться могут.
//    Для изменяемых параметров добавьте проверку данных, что значение указано корректно, не содержит null и не пустое.

}

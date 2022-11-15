import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", "жёлтый", 2015, 1.7,"Россия",0,"","","",4,"летняя");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", "чёрный", 2020, 3.0,"Германия",0,"","","",4,"летняя");
        Car BMW = new Car("BMW", "Z8", "чёрный", 2021, 3.0,"Германия",0,"","","",4,"летняя");
        Car Kia = new Car("Kia", "Sportage 4-го поколения", "красный", 2018, 2.4,"Южная Корея",0,"","","",4,"летняя");
        Car Hyundai = new Car("Hyundai", "Avante", "оранжевый", 2016, 1.6,"Южная Корея",,"","","",4,"летняя");

        Train Lastochka = new Train("Ласточка","B-901","",2011,"Россия",301,3500,"","Белорусский вокзал","Минск-Пассажирский",11 );
        Train Leningrad = new Train("Ленинград","D-125","",2019,"Россия",270,1700,"","Ленинградский вокзал","Лениград-Пассажирский",8 );


//        Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч,
//        отходит от Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей,
//        в поезде 11 вагонов.
//        Поезд «Ленинград», модель D-125, 2019 год выпуска в России, скорость передвижения — 270 км/ч,
//        отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки — 1700 рублей,
//        в поезде 8 вагонов.


    }
}
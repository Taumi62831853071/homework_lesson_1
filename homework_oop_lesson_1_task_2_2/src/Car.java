public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    void print() {
        System.out.print(brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color+ " цвета, объём двигателя - " + engineVolume + " л.");
    }
}

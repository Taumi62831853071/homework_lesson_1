public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, int year, String country, String color, double engineVolume) {

        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        this.country = country;
        if (country == null) {
            this.country = "default";
        }
        this.color = color;
        if (color == null) {
            this.color = "белого";
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

    }

    void print() {
        System.out.print(brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color+ " цвета, объём двигателя - " + engineVolume + " л.");
    }
}

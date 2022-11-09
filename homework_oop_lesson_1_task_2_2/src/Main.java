public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.year = 2015;
        car1.country = "России";
        car1.color = "желтого";
        car1.engineVolume = 1.7;
        car1.print();
        System.out.println();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.year = 2020;
        car2.country = "Германии";
        car2.color = "черного";
        car2.engineVolume = 3.0;
        car2.print();
        System.out.println();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.year = 2021;
        car3.country = "Германии";
        car3.color = "черного";
        car3.engineVolume = 3.0;
        car3.print();
        System.out.println();

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4-поколения";
        car4.year = 2018;
        car4.country = "Южной Корееи";
        car4.color = "красного";
        car4.engineVolume = 2.4;
        car4.print();
        System.out.println();

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.year = 2016;
        car5.country = "Южной Корее";
        car5.color = "ораньжевого";
        car5.engineVolume = 1.6;
        car5.print();
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada","Granta", 2015, "России","желтого",1.7);
        car1.print();
        System.out.println();

        Car car2 = new Car("Audi","A8 50 L TDI quattro", 2020, "Германии","черного",3.0);
        car2.print();
        System.out.println();

        Car car3 = new Car("BMW","Z8", 2021, "Германии","черного",3.0);
        car3.print();
        System.out.println();

        Car car4 = new Car("Kia","Sportage 4-поколения", 2018, "Южной Корее","красного",2.4);
        car4.print();
        System.out.println();

        Car car5 = new Car("Hyundai","Avante", 2016, "Южной Корее","ораньжевого",1.6);
        car5.print();
        System.out.println();
    }
}
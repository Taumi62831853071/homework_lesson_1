public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(1988, "Информация не указана", "Информация не указана", "Информация не указана");
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 1988;
        maxim.jobTitle = "бренд-менеджера";
        maxim.print();
        System.out.println();

        Human anya = new Human(1993,"Информация не указана", "Информация не указана", "Информация не указана");
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;
        anya.jobTitle = "методиста образовательных программ";
        anya.print();
        System.out.println();

        Human katya = new Human(1992,"Информация не указана", "Информация не указана", "Информация не указана");
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1992;
        katya.jobTitle = "продакт-менеджера";
        katya.print();
        System.out.println();

        Human artem = new Human(1995,"Информация не указана", "Информация не указана", "Информация не указана");
        artem.name = "Артём";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "директора по развитию бизнеса";
        artem.print();
        System.out.println();

    }
}
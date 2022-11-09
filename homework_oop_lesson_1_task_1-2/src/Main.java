public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим","Минск", 1988, "бренд-менеджера");
        maxim.print();
        System.out.println();

        Human anya = new Human("Аня","Москва", 1993, "методиста образовательных программ");
        anya.print();
        System.out.println();

        Human katya = new Human("Катя","Калининград", 1992, "продакт-менеджера");
        katya.print();
        System.out.println();

        Human artem = new Human("Аня","Москва", 1995, "директора по развитию бизнеса");
        artem.print();
        System.out.println();

    }
}
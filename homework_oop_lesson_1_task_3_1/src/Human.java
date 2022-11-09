public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {

        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        this.town = town;
        if (town == null) {
            this.town = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

    }

    void print() {
        System.out.print("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!");
    }
}

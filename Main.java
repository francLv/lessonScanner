import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите \n имя \n опыт работы(лет) \n тип кухни");
        String firstName = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef who cooks " + cuisinePreference +
                " dishes and has " + yearsOfExperience + " years of experience.");
    }
}
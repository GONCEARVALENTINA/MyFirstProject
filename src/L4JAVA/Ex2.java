package L4JAVA;


import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your language (EN/RU/RO): ");
        String language = scan.nextLine();
        System.out.println("What is your name?: ");
        String name = scan.nextLine();
        if (language.contains("EN")) {
            System.out.println("Hello, " + name);
        }
        else if (language.contains("RO")) {
            System.out.println("Salut, " + name);
        }
        else if (language.contains("RU")) {
            System.out.println("Привет, " + name);
        }
        else {
            System.out.println("I don't know this language...");
        }
    }
}

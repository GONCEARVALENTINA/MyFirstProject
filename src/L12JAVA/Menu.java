package L12JAVA;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Create your nickname:");
        String user = scanner.nextLine();
        do {
            System.out.println("Create your nickname:");
            User.user.setName(scanner.nextLine());
        } while (User.user.getName().equals(""));

        do {
            System.out.println("Create your password:");
            User.user.setPassword(scanner.nextLine());
        } while (User.user.getPassword().equals(""));

    }

}



import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        String ni = "Hello";
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        name = input.nextLine();


        System.out.println(ni + " " + name);

        name = input.nextLine();
    }
}

package L4JAVA;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которое нужно разбить на множители:");
        int n = scanner.nextInt();
        int b = 2;
        while (n != 1) {
            if (n % b == 0) {
                System.out.print(b + " ");
                n /= b;
            } else if (b == 2) {
                b++;
            } else {
                b += 2;
            }
        }
    }
}
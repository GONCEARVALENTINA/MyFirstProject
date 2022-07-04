package Leson4;

import java.util.Scanner;

public class Conparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter first integer:");
        number1 = scan.nextInt();

        System.out.printf("Enter second integer:");
        number2 = scan.nextInt();
        if (number1 == number2)
        System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2);
        System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2 );




    }
}

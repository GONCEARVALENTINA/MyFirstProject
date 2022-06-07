import java.util.Scanner;

public class Demo1 {
    public static void main(String args[]){

        Scanner myLittleScanner = new Scanner(System.in);
        int number1;
        int number2;
        int sum;


        System.out.println("Enter first integer");// просим пользователя ввести значение
        number1 = myLittleScanner.nextInt();
        System.out.println("Enter second integer");// просим пользователя ввести значение
        number2 = myLittleScanner.nextInt();
        sum = number1 + number2;
        System.out.println(sum);
        System.out.printf("Sum is: %d", sum);

    }
}

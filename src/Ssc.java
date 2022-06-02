import java.util.Scanner;

public class Ssc {

    public static void main(String[] args) {
        Scanner myLittleScanner = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter first integer:");
        number1 = myLittleScanner.nextInt();


        System.out.println("Enter second integer:");
        number2 = myLittleScanner.nextInt();
        sum=number1+number2;

                System.out.println("This is:"+sum);
                System.out.printf("Sum is:%d",sum);
        }
    }
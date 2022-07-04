package Youtube;

import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println( "Введите ифше имя : " );
//        String username = scan.nextLine();
//        System.out.println(" Привет!" + username);
//        int num1 = scan.nextInt();
//        byte num2 = scan.nextByte();
//        boolean b = scan.nextBoolean();
//        float num3 = scan.nextFloat();
//        short num1 = 50, num2 = 10;
//        int res = num1 + num2;
//        System.out.println("РЕЗУЛЬТАТ : " + res);
//        float num1 = 20, num2 = 2;
//        float res = num1/num2;
//        System.out.println("РЕЗУЛЬТАТ:" + res);
        System.out.println("Введите первое число:");
        float num1 = scan.nextFloat();

        System.out.println("Введите второе число:");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 * num2;
        float res3 = num1 / num2;
        float res4 = num1 - num2;

        System.out.println("РЕЗУЛЬТАТ:");

        System.out.println(res1 + "\n" + res2 + "\n" + res3 +"\n" + res4);

    }
}

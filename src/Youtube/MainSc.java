package Youtube;

import java.util.Scanner;

public class MainSc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(" Введите  имя: ");
//        String username = scan.nextLine();
//        System.out.println("Привет, " + username);

        System.out.println("Введите первое число:");
        float num1 = scan.nextFloat();
////        byte num2 = scan.nextByte();
////        short num3 = scan.nextShort();
//        float num4 = scan.nextFloat();
        System.out.println("Виедите второе число: ");
        float num2 = scan.nextInt();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println(" РЕЗУЛЬТАТ");
        System.out.println();

        System.out.println(res1 + "\n" + res2 + " \n " + res3 + "\n" + res4);


    }
}

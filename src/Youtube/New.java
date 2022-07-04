package Youtube;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(" Пожалуйста введите свое имя: ");
//        String username = scan.nextLine();
//
//        System.out.println("HELLO! " + username);



//        int a =  10;
//        int b = 2;
//        int res = a / b;
//        System.out.println("RESULT:" + res);
        System.out.println("Введите первое число:");
        int a = scan.nextInt();
        System.out.println("BBедите второе число:");
        int d = scan.nextInt();

        int res = a/d;

        System.out.println("РЕЗУЛЬТАТ:");
        System.out.println(+ res);


    }
}

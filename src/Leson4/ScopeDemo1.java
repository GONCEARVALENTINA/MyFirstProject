package Leson4;

import java.util.Scanner;

public class ScopeDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1;
        System.out.println("Enter integer :");// просим у пользователя ввести значение
        number1 = scan.nextInt();// вкладываем это значение в переменную number1 типа  int
        if ( number1 ==10)  {
            int y = 20;
//            System.out.println("number1 and y:" + number1 +" " + y);
            System.out.printf("number1 and y: %d %d%n", number1, y);
            number1 = y * 4;



        }
        System.out.println("number1 is:" + number1);
    }
}

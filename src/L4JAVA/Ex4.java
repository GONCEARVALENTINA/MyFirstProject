package L4JAVA;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size massive : ");
        int N = in.nextInt();
        int[] mass = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number in massive : ");
            int a = in.nextInt();
            mass[i] = a;
        }
    }
}

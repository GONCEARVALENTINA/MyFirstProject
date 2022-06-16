package L4JAVA;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size massive - ");
        int N = in.nextInt();
        int[] mass = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number in massive : ");
            int a = in.nextInt();
            mass[i] = a;
        }
//        System.out.println(" ");
//        countingSort2(mass);
//        for (int c : mass) {
//            System.out.println("in descending order(убывание) - " + c); //Вывод по убывания
//        }
        System.out.println(" ");
        countingSort2(mass);
        for (int x : mass) {
            System.out.println("in ascending order(возрастание) - " + x); //Вывод по возрастанию
        }
    }

    public static void countingSort2(int[] mass) {
        for (int i = 0; i < mass.length + 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] < mass[j]) {
                    int temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
    }
    public static void countingSort(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                int temp = mass[i];
                mass[i] = mass[i + 1];
                mass[i + 1] = temp;
            }
        }
    }
}
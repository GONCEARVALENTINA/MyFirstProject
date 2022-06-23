package L7JAVA;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        int[] num = new int[4];
        int min;

        num[0] = 70;
        num[1] = 59;
        num[2] = -50;
        num[3] = 10;
            min = num[0];
            for (int i = 0; i < 4; i++) {
                if (num[i] < min) min = num[i];
            }
            System.out.println("min are" + " " + min);

        }
}


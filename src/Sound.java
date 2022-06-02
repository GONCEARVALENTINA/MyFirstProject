import java.util.Scanner;
public class Sound {
    public static void main(String[] args){

        int speed=343;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the echo-time:");

        double time = input.nextDouble();
        double distance = speed * time/2.0;

        System.out.println("Distance:" + distance);

    }
}

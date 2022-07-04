package Lesson88;

public class FSArrayDemo {
    public static void main(String[] args) {

        int x;

        FailSoftArray fs = new FailSoftArray(5, -1);

        System.out.println("Error processing with no reporting");

        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else System.out.println("The index " + i + "is out range when .");

        }

        System.out.println();

        System.out.println("Error processing with reporting");


    }
}
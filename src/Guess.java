import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException, IOException {

        char ch, answer = 'S';
        System.out.println("Задумана буква из диапазона A-Z. ");
        System.out.printf("Попытайтесь угадать");

        ch = (char) System.in.read();
        if (ch== answer) System.out.println("Правельно");
        else System.out.println("");


    }
}

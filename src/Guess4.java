import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.print("Угадывайте.");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("Правельно");
            else {
                System.out.println("Нужная буква находится ближе к ");
                if (ch < answer) System.out.println("концу алфавита");
                else System.out.println("началу алфавита");
                System.out.println("Попробуйте уще раз");
            }


        } while(answer != ch);
    }
    }


import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {


        char ch;
        System.out.print("Нажмите нужную клавишу, а затем клавишу[ВХОД]");

        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " +" " + ch);
    }
}

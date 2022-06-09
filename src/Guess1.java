public class Guess1 {
    public static void main(String[] args)
            throws java.io.IOException
    {char ch, answer = 'S';
        System.out.println("Задумана буква от А - Z");
        System.out.println("Пoпытaйтecь ее угадать:");
        ch = (char) System.in.read (); // ПОЛУЧИТЬ СИМВОЛ С КЛАВИАТУРЫ
        if (ch ==answer) System.out.println("ПРАВЕЛЬНО");
        else System.out.println(" ...Извинитe, вы не угадали.");

    }
}

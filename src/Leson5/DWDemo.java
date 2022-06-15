package Leson5;

import java.io.IOException;

public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.println("Нажмитенужную клавишу , а затем ENTER:  ");
            ch = (char) System.in.read();
        }  while (ch != 'q');

    }
}
//package Leson5;
//
//public class Guess4 {
//    public static void main(String[] args) {
//        char ch, ignore, answer = 'S';
//        do {
//            System.out.println("Задумана буква из диапазона от A до Z ");
//            System.out.print("Угадывайте");
//            ch = (char) System.in.read();
//            do {
//                ignore = (char) System.in.read();
//            } while (ignore != '\n');
//            if (ch == answer) System.out.println("Правельно");
//            else {
//                System.out.println("Нужная буква находится ближе к");
//                if (ch < answer) System.out.println("кщрцу алфавита");
//                else System.out.println("к концу алфавита");
//            }
//        } while (answer != ch);
//    }
//}

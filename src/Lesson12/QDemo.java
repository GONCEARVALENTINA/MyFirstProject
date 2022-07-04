//package Lesson12;
//
//public class QDemo {
//    public static void main(String[] args) {
//        Queue bigQ = new Queue(100);
//        Queue smallQ = new Queue(4);
//
//        char ch;
//        int i;
//        System.out.println(" Using gueue to keep the alphaper");
//        for (i=0; i<26; i++)
//            bigQ.put((char) ('A' + i));
//        System.out.println("What contains bigQ:");
//        for (i=0; i<26; i++){
//            ch = bigQ.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//        System.out.println();
//        System.out.println("Using smalQ to get an error");
//        for (i=0; i< 5; i++){
//            System.out.println("trying to save" + (char));
//            smallQ.put((char) ('Z' - i));
//        }
//    }
//}

//package L12JAVA;
//
//import javax.sound.midi.Soundbank;
//import java.util.Scanner;
//
//public class VoteApp {
//    String[] issues = {
//            "Natural cataclysms",
//            "The problem of wars",
//            "Ecological issue",
//            "Demographic issue", "World energy issue"};
//    double avg;
//    int min, max;
//    int[][] marks = new int[5][10];
//    Scanner in = new Scanner(System.in);
//
//    int putMarks() {
//        int g;
//        while (true) {
//            g = (int) ((Math.random()) * 10);
//            if (!(g < 11 && g > 0))
//                System.out.println("Please try again");
//            else break;
//        }
//        return g;
//
//    }
//
//    void showIssuesAndVote() {
//        System.out.println("Top 5 critical global issues:\n");
//        for (int i = 0; i < issues.length; i++)
//            System.out.println((i + 1) + "," + issues[i]);
//        System.out.println("\nPlease rate issue on a scale of 1-10\n" +
//                "1 being a minor issue, 10 being a disaster).");
//        for (int i = 0; i < marks[i].length; i++) {
//            System.out.println((i + 1) + " person your turn:");
//            marks[i][j] = putMarks();
//        }
//        System.out.println();
//
//    }
//
//    void arrayAndAverange() {
//
//        System.out.println("Name of issue\t\tU1\t\tU2\t\tU3\t\tU4\t\tU5\t\tU6\t\tU7\t\tU8\t\tU9\t\tU10\t\t№ of marks\t\tAVG\t\tSum");
//        int total = 0;
//        for (int i = 0; i < marks.length; i++) {
//            total = 0;
//            System.out.print(issues[i] + "\t\t");
//            for (int j= 0; j < marks[i].length; j++) {
//                System.out.print(marks[i][j] + "\t");
//                avg = avg + marks[i][j];
//                total += marks[i][j];
//            }
//            avg = avg / marks[i].length;
//            System.out.print("\t\t" + marks[i].length + ";\t");
//            System.out.print("\t\t" + avg);
//            System.out.print("\t\t" + total);
//            avg = 0;
//
//
////          void getMinAndMax(){
////            int total = 0;
////            max = 0;
////            min = 101;
////            int currentMinIssue = 0;
////            int currentMaxIssue = 0;
////            for (int i =0; i < marks[i].length; i++){
////                total = 0;
////                for (int i1 = 0; i < marks[i].length; i++) {
////                    total += marks[i][i];
////                }
////                if(total < min){
////                    min = total; currentMinIssue = i;}
////                if (total > max) {
////                    max = total; currentMaxIssue = i;}
//            }
//            System.out.println("ggg");
//            System.out.println("gggggggg");
//        }
//
//        }
//
//
//





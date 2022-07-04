//package L12JAVA;
//
//import javax.sound.midi.Soundbank;
//import java.util.Scanner;
//
//public class VA {
//    String[] issues = {
//            "Natural cataclysms",
//            "The problem of wars",
//            "Ecological issue",
//            "Demographic issue", "World energy issue"};
//    int nrRespondents;
//    int[][] marks;
//    VA(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number of respondents");
//        nrRespondents = in.nextInt();
//        marks = new int[issues.length][nrRespondents];
//    }
//    int putMarks(){
//        int k;
//        while (true){
//            k = (int) (Math.random() *10);
//
//               if (!(k < 11 && k > 0))
//                   System.out.println("Attention!");
//               else break;
//        }
//        return k;
//    }
//    void showIssuesAndVote(){
//        System.out.println("Top" + issues.length + "critical global issues:\n");
//        for (int i = 0; i < issues.length; i++){
//            System.out.println("\n" + (i+1) + " . " + issues[i]);
//            System.out.println("\nPlease rate each issue on a scale of 1-10\n" +
//                    "1 being a minor issue, 10 being a disaster)");
//            int i, j;
//
//            for (i = 0; i <  nrRespondents; i++){
//                System.out.println("\n" + (i+ 1) + "person, it's your turn tovate");
//                for (j = 0; j <issues.length; j++){
//                    System.out.println("\nLet's rate" + (issues[j]) + ":");
//                    marks[j][i]= putMarks();
//                }
//                System.out.println();
//            }
//            void displayStatistics(){
//                int sum, avg;
//                int max,min;
//                int gMax = 0;
//                int gMin = 101;
//                int currentMinIssue = 0;
//                int currentMaxIssue = 0;
//                System.out.println("Issue Type\t\t\t");
//                for (int i = 0; i < nrRespondents; i++)
//                    System.out.print("\tP" + (i +1));
//                System.out.print("\t\tNr. marks\t\tAvg\t\tSum\t\tMin9☻t\tMax\n");
//
//                for(int i = 0; i <marks.length; i++){
//                    sum = 0;
//                    max = min = marks[0][0];
//                    System.out.print(issues[i] + "\t\t");
//                    for (int j = 0; j < marks[i].length; j++)
//                        System.out.print(marks[i][j] + "\t");
//                    sum += marks[i][j];
//                    if (marks[i][j] < min) min = marks[i][j];
//                    if (marks[i][j] > max) max = marks[i][j];
//                }
//                avg = sum / marks[i].length;
//            }
//
//        }
//    }
//
//
//
//
//
//
//}

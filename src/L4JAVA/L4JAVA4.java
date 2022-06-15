package L4JAVA;


import java.util.Scanner;
public class L4JAVA4 {
    public static void main(String[] args){
        System.out.print("Пожалуйста, введите 3 цифры:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();

        if(a>b){
            int t = a;
            a = b;
            b = c;
            c = t;

        }
        if(a>c){
            int t = a;
            a = c;
            c = t;
        }
        if(b>c){
            int t = b;
            b = c;
            c = t;
        }

        System.out.println(a+" "+b+" "+c);
    }
}
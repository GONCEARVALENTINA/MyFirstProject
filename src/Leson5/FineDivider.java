package Leson5;

public class FineDivider {
    public static void main(String[] args) {
        for (int i=2; i <=20; i++){
            System.out.print("Делитель для " + i + ": ");
            for (int j = 2; j < i; j++){
                if ((i%j) ==0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

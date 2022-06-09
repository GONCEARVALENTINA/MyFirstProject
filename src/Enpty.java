public class Enpty {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <=5;){
            System.out.println(i);
            sum += i++;
            System.out.println("Сумма внутри цикла"+sum);
    }
} }

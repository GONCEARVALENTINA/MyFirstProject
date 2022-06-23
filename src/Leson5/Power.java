package Leson5;

public class Power {
    public static void main(String[] args) {
        int e;// число
        int result;// результат

        for (int i = 0; i <= 5; i++){
            result = 1;// 1 это результат  2 в степени 0
            e = i;
            while (e > 0){
                result *= 2;
                e--;// это степень которую всегда сбрасываем
            }
            System.out.println("2 в степени " + i +  " равно " + result);

        }
    }
}

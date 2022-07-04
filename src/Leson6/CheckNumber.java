package Leson6;

public class CheckNumber { // Заявляем, что у нас будет метод, который будет возвращать TRUE или FALS и принимает целочисленные значения
    boolean isEven(int x) { // (int x) параметры-целочисленные значения
        if ((x%2) == 0) return true; // возвращаетя число четное
        else return false;
    }
     boolean isDivider(int candidateToDivider, int number){
        if (number%candidateToDivider==0) return true;
        else return false;
     }

    }


package Leson6;

public class ParamDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();
        if (e.isEven(10)) System.out.println("10 is even");
        if (e.isEven(9)) System.out.println("9 is even");
        if (e.isEven(12)) System.out.println("12 is even");
    }
}

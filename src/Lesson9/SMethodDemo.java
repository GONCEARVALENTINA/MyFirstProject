package Lesson9;

public class SMethodDemo {
    public static void main(String[] args) {
        System.out.println("value of val: " +StaticMethod.val);
        System.out.println("value returned by valDiv2: " + StaticMethod.valDiv2());

        StaticMethod.val = 50;//ьожно здесь задать значение и обращаться следует по названию класса

        System.out.println("value of val: " + StaticMethod.val);
        System.out.println("value returned by valDiv2()" + StaticMethod.valDiv2());

    }
}

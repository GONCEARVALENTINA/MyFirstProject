package Lesson9;

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x and ob.2x are independent");
        System.out.println("ob1.x: " + ob1.x + "\n" + "ob2x:" + ob2.x);

        System.out.println();

        System.out.println("Static Y is common");

        StaticDemo.y = 19;

        System.out.println("ob1.sum()" + ob1.sum());
        System.out.println("ob2.sum()" +ob2.sum());
        System.out.println();

        StaticDemo.y = 100;

        System.out.println("ob1.sum()" + ob1.sum());
        System.out.println("ob2.sum()" +ob2.sum());
        System.out.println();


    }
}

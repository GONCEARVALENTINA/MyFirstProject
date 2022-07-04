package Lesson8;

public class Overload {
    void ovlDemo(){
        System.out.println("no parameters");
    }
    void ovlDemo(int a){
        System.out.println("One parameters" + a);
    }
    void ovlDemo(int a, int b){
        System.out.println("Two parameters" + a +" " +b);
    }
    void ovlDemo(double a, double b){
        System.out.println("two parameters of type double" + a + " " +b);
    }
    int ovlDemo(float a){
        System.out.println("one parameters:" +a);
        return (int) a;
    }



}

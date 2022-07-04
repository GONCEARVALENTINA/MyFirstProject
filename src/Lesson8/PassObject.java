package Lesson8;

public class PassObject {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5 , 5);
        System.out.println("ob1 имеет те же размеры, что и оb2: " + ob1. sameBlok (ob2) ) ;

        System.out.println("ob1 имеет те же размеры, что и оb3: " + ob1. sameBlok (ob3) ) ;


        System.out.println("ob2 имеет те же размеры, что и оb3: " + ob2. sameBlok (ob3) ) ;
    }
}

package JRus;

public class CatDemo {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Barsik";


        Cat.count++;


        Cat vasea = new Cat();
        vasea.age = 4;
        vasea.name = "Vasea";

        Cat.count++;

        System.out.println("Cat" + " " + barsik.name + "  " + barsik.age);

        System.out.println("Cat" + "  " + vasea.name + "  " + vasea.age);

        System.out.println("Общее количество котов = " + Cat.count);


    }
}

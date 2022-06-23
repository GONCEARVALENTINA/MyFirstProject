package Leson6;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle();
        Vehicle jeep = new Vehicle();
        mercedes.passenger = 7;
        mercedes.fuelcap = 16;
        mercedes.mpg = 21;

        jeep.passenger = 7;
        jeep.fuelcap = 25;
        jeep.mpg = 15;


//        int range1 = mercedes.fuelcap * mercedes.mpg;
//        int range2 = jeep.fuelcap * jeep.mpg;

        System.out.println("mercedes can take" + mercedes.passenger + " passenger" +" ");
        mercedes.range();
        System.out.println("jeep can take" + jeep.passenger + " passenger" + " ");
        jeep.range();
        int howManyMilesCanGo = jeep.rangeInt();
        System.out.println("this one from method rangeInt" +"  "+ howManyMilesCanGo);
    }
}

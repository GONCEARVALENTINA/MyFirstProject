package Leson6;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle(7, 16,21);
        Vehicle jeep = new Vehicle(7,25,15);
//        mercedes.passenger = 7;
//        mercedes.fuelcap = 16;
//        mercedes.mpg = 21;
//
//        jeep.passenger = 7;
//        jeep.fuelcap = 25;
//        jeep.mpg = 15;




//        int range1 = mercedes.fuelcap * mercedes.mpg;
//        int range2 = jeep.fuelcap * jeep.mpg;

        System.out.println("mercedes can take" + mercedes.passenger + " passenger" +" ");
        mercedes.range();
        System.out.println("jeep can take" + jeep.passenger + " passenger" + " ");
        jeep.range();
        int howManyMilesJeepCanGo = jeep.rangerInt();
        System.out.println("this one is method rangeInt: " + howManyMilesJeepCanGo);

         double gallons = jeep.fueNeeded(700);
         int rangeNeeded = 1400;
         double gallons2 = mercedes.fueNeeded(rangeNeeded);
        System.out.println("jeep need" + gallons );
        System.out.println("mercedes need"+" "+ gallons2);
//        jeep.myMethod();

//        int howManyMilesCanGo = jeep.rangeInt();
//        System.out.println("this one from method rangeInt" +"  "+ howManyMilesCanGo);


//        Vehicle ferrari = mercedes;
//        ferrari.passenger = 12;
//        System.out.println(mercedes.passenger);

//        int a = 10;
//        int b = 11;
//         a =b;
//         a = a +2;
//        System.out.println("a" + "  " + a + "  " +  "b" + " " + b);

    }

}

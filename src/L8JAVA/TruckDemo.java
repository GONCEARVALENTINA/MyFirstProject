package L8JAVA;



public class TruckDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle(7, 16,21);
        Vehicle jeep = new Vehicle(7,25,15);
        Truck truck = new Truck();


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


    }

}

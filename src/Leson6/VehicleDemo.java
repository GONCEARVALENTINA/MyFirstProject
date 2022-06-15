package Leson6;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle();
        mercedes.passenger = 7;
        mercedes.fuelcap = 16;
        mercedes.mpg = 21;
        int range = mercedes.fuelcap * mercedes.mpg;
        System.out.println("mercedes can take" + mercedes.passenger + " passenger to the distance of" + range + "miles");
    }
}

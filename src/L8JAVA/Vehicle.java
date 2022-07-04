package L8JAVA;

public class Vehicle {

    int passenger;
    private int fuelcap;//емкость топливного бака
    private int mpg;//потпебление топлива в милях на галлон

     public Vehicle(){}
    Vehicle(int numberOfPassenger, int fuelCapVolume, int milerPerGalolon){
        passenger = numberOfPassenger;
        fuelcap = fuelCapVolume;
        mpg = milerPerGalolon;
    }

    void range(){
        System.out.println("Maximum distance with full fuelcap" + "  "+ fuelcap * mpg + " " + "miles");
    }
    int rangerInt() {
        return mpg * fuelcap; }



    double fueNeeded ( int distance){
        return (double) distance / mpg;
    }

}



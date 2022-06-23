package Leson6;

public class Vehicle {

    int passenger;//количество пассажиров
    int fuelcap;//емкость топливного бака
    int mpg;//потпебление топлива в милях на галлон

    void range(){
        System.out.println("Maximum distance" + "  "+ fuelcap * mpg + " " + "miles");
    }
    int rangeInt(){
        return  mpg * fuelcap;
    }
}

package Leson6;

public class Vehicle {

    int passenger;
    int fuelcap;//емкость топливного бака
    int mpg;//потпебление топлива в милях на галлон
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

//        double fueNeeded ( int distance)
//            return (double) distance / mpg;
//
//        } // Метод возвращает значение, которое задали действием mpg * fuelcap
        //    void myMethod(){
//        int i;
//        for (i=0; i < 10; i++){
//            if (i==5) return;
//            System.out.println("cmth");
//        }
//    }

    double fueNeeded ( int distance){
        return (double) distance / mpg;
    }
//
}





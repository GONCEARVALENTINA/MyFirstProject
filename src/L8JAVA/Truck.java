package L8JAVA;

public class Truck extends Vehicle{

    public Truck(){}

     int cargocap;
    Truck(int р, int f, int m, int с){
        super(1, 8, 12);
        cargocap = 'c';
    }
    int getCargocap(){
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

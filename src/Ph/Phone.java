package Ph;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Calling" + " " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling" + "  " + name + "  " + "with number" + " " + number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}

package Ph;

public class Phone1Demo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("659265556", "Samsung", 7.1);
        Phone phone3 = new Phone("69020894", "Appel");

        phone1.setNumber("457896544");
        phone1.setModel("Nokia");
        phone1.setWeight(4.5);

        System.out.println("Number of phon1: " + phone1.getNumber());
        System.out.println("Model of phon1:" + phone1.model);
        System.out.println("Weight of phon1:" + phone1.weight);

        System.out.println();

        System.out.println("Number of phon2: " + phone2.getNumber());
        System.out.println("Model of phone2.model:" + phone2.model);
        System.out.println("Weight of phon2:" + phone2.weight);

        System.out.println();

        System.out.println("Number of phon3: " + phone3.getNumber());
        System.out.println("Model of phon3: " + phone3.model);
        System.out.println("Weight of phon3: " + phone3.weight);

        System.out.println();

        phone1.receiveCall("Anya");
        phone2.receiveCall("Dany");
        phone3.receiveCall("Dany", "12345696");

    }
}

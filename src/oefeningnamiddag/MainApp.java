package oefeningnamiddag;

public class MainApp {

    public static void main(String[] args) {

        Car car = new Car(100, 250);
        car.accelerator(50);
        car.slow(26);
        //car.park(9);
        System.out.println(car.getSpeed());




        /*SUV suv = new SUV();
        suv.setColor("rood");

        Cabrio cabrio = new Cabrio();


        ElektrischeWagen elektrischeWagen = new ElektrischeWagen();*/


    }
}

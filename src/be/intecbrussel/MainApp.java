package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        System.out.println(dog1);
        System.out.println(dog2);

        //dog.sound();
        //cat.sound();

        String a = new String("Hi");
        String b = new String("Hi");
        String c = new String("Hello");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        int num01 = 5;
        int num02 = 5;
        int num03 = 10;

        System.out.println(num01 == num02);
        System.out.println(num01 == num03);
    }

}

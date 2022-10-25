package oefening;

public class MainApp {

    public static void main(String[] args) {


        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1);
        triangle1.setAngles(3);
        System.out.println(triangle1.getAngles());
        triangle1.edgy();

        Square square1 = new Square();
        Square square2 = new Square();
        System.out.println(square1.equals(square2));
        square1.edgy();
    }

}

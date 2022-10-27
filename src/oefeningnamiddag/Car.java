package oefeningnamiddag;

public class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {

    }

    public Car(int speed, int hp) {
        this.speed = speed;
        this.hp = hp;
    }

    public Car(String color, int hp) {
        setColor(color);
        this.hp = hp;
    }

    public void accelerator(int amount) {
        this.speed += (amount + (hp/100));
    }

    public void slow(int amount) {
        this.speed -= (amount - (hp/100));
    }

    public void park(int amount) {
        this.speed = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

}

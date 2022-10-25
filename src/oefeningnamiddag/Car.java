package oefeningnamiddag;

public class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {

    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void accelerator(int amount) {
        if (amount >= 0) {
            amount += (hp/100);
        }
    }

    public void slow(int amount) {
        if (amount >= 0) {
            amount -= (hp/100);
        }
    }

    public void park(int amount) {
        if (amount != 0) {
            amount = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

}

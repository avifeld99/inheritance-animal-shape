package oefening;

import java.util.Objects;

public class Triangle extends Shape {

    private int angles;

    public int getAngles() {
        return angles;
    }

    public void setAngles(int angles) {
        if (angles == 3) {
            this.angles = angles;
            System.out.println("triangle created");
        } else {
            System.out.println("it's no triangle");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return angles == triangle.angles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(angles);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "angles=" + angles +
                '}';
    }

}

package main.java;

public class PointRunner extends Parameters {
    public static void main(String[] args) throws CloneNotSupportedException {
        PointRunner point = new PointRunner();
        point.setCoordinates();
        point.toString();
        System.out.println(point);
        System.out.println();

        System.out.println("Distance between coordinates: " + point.calculateDistance());
        System.out.println();

        System.out.println(equals(point.getX(), point.getY()));
        System.out.println();

        PointRunner clonnedPoint = point.clone();
        clonnedPoint.toString();
        System.out.println(clonnedPoint);

    }
}


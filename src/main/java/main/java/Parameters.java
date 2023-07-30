package main.java;

import org.testng.annotations.Test;

abstract class Parameters implements Cloneable {

    private int x;
    private int y;

    public Parameters() {
        this.x = getX();
        this.y = getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCoordinates() {
        setX(4);
        setY(8);
    }
    public int calculateDistance(){
        return getY() - getX();
    }
    @Test
    static boolean equals(Object m, Object n) {
        return m == n;
    }

    public String toString() {
        return "Point X: " + getX() + " ; " + " Point Y: " + getY();
    }

    @Override
    protected PointRunner clone() throws CloneNotSupportedException {
        return (PointRunner) super.clone();
    }
}


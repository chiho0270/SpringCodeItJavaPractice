package org.example.Head02_OOProgramming.topic03.SOLID.LSP;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

/*
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
*/
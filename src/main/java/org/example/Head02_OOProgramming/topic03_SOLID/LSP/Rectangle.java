package org.example.Head02_OOProgramming.topic03_SOLID.LSP;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be > 0");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be > 0");
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
/*
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
}
*/
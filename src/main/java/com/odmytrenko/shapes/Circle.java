package com.odmytrenko.shapes;

public class Circle extends Shape {

    private double radius;
    private double square;

    public Circle(double radius) {
        this.radius = radius;
        this.square = Math.pow(radius, 2) * Math.PI;
    }
}

package com.odmytrenko.shapes;

public class Square extends Shape {

    private double edge;
    private double square;

    public Square(double edge) {
        this.edge = edge;
        this.square = Math.pow(edge, 2);
    }
}

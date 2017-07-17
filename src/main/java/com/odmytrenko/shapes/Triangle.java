package com.odmytrenko.shapes;

public class Triangle extends Shape {

    private double edgeA;
    private double edgeB;
    private double edgeC;
    private double height;
    private boolean isEquilateral;
    private boolean isIsosceles;
    private boolean isScalene;

    public Triangle(int edgeA, int edgeB, int edgeC, int height) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        this.height = height;

        if (edgeA == edgeB && edgeB == edgeC) this.isEquilateral = true;
        if (edgeA == edgeB && edgeB != edgeC) this.isIsosceles = true;
        if (edgeA != edgeB && edgeB != edgeC) this.isScalene = true;
    }
}

package com.odmytrenko;

import com.odmytrenko.shapes.Circle;
import com.odmytrenko.shapes.Shape;
import com.odmytrenko.shapes.Square;
import com.odmytrenko.shapes.Triangle;

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        Shape triangle = new Triangle(10, 10, 10, 9);
        triangle.toXML();
        System.out.println("--------------------------------");
        triangle.toJSON();
        System.out.println("--------------------------------");

        Shape square = new Square(11);
        square.toXML();
        System.out.println("--------------------------------");
        square.toJSON();
        System.out.println("--------------------------------");

        Shape circle = new Circle(6);
        circle.toXML();
        System.out.println("--------------------------------");
        circle.toJSON();
        System.out.println("--------------------------------");
    }
}

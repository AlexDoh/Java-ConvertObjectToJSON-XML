package com.odmytrenko.shapes;

import java.util.ArrayList;
import java.util.List;

public class Group extends Shape {

    private List<Shape> listOfShapes = new ArrayList<>();

    public Group() {
    }

    public Group(Shape shape) {
        listOfShapes.add(shape);
    }

    public boolean addShapeToGroup(Shape shape) {
        return listOfShapes.add(shape);
    }

    public boolean removeShapeFromGroup(Shape shape) {
        return listOfShapes.remove(shape);
    }

    public Shape getShapeByIndex(int index) {
        return listOfShapes.get(index);
    }

    public List<Shape> getListOfShapes() {
        return listOfShapes;
    }

}

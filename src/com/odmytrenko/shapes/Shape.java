package com.odmytrenko.shapes;

import com.odmytrenko.shapes.converting.ShapeToJSON;
import com.odmytrenko.shapes.converting.ShapeToXML;

public abstract class Shape {

    public void toXML() throws IllegalAccessException {
        ShapeToXML.shapeToXML(this);
    }

    public void toJSON() throws IllegalAccessException {
        ShapeToJSON.shapeToJSON(this);
    }
}

package com.odmytrenko.shapes;

import com.odmytrenko.shapes.utilities.ShapeToJSON;
import com.odmytrenko.shapes.utilities.ShapeToXML;

public abstract class Shape {

    public boolean addedToGroup;

    public String toXML() throws IllegalAccessException {
        return ShapeToXML.shapeToXML(this);
    }

    public String toJSON() throws IllegalAccessException {
        return ShapeToJSON.shapeToJSON(this);
    }

    public boolean isAddedToGroup() {
        return addedToGroup;
    }

    public void setAddedToGroup() {
        addedToGroup = true;
    }
}

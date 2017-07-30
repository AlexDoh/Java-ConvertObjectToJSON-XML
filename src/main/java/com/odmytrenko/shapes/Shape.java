package com.odmytrenko.shapes;

import com.odmytrenko.shapes.utilities.ConverterToJSON;
import com.odmytrenko.shapes.utilities.ConverterToXML;
import com.odmytrenko.shapes.utilities.ShapeToJSON;
import com.odmytrenko.shapes.utilities.ShapeToXML;

public abstract class Shape {

    private boolean addedToGroup;
    private ConverterToJSON converterToJSON;
    private ConverterToXML converterToXML;

    public Shape() {
        this.converterToJSON = new ShapeToJSON(this);
        this.converterToXML = new ShapeToXML(this);
    }

    public String toXML() throws IllegalAccessException {
        return converterToXML.toXML();
    }

    public String toJSON() throws IllegalAccessException {
        return converterToJSON.toJSON();
    }

    public boolean isAddedToGroup() {
        return addedToGroup;
    }

    public void setAddedToGroup() {
        addedToGroup = true;
    }
}

package com.odmytrenko.shapes.utilities;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToXML implements ConverterToXML {

    private shapesPropertiesContainer shapesPropertiesContainer = new shapesPropertiesContainer();
    private Shape shapeForConvert;

    public ShapeToXML(Shape shape) {
        shapeForConvert = shape;
    }

    public String toXML() throws IllegalAccessException {
        StringBuilder shapeString = new StringBuilder();
        shapeString.append(shapesPropertiesContainer.getHeaderTagXML()).append(shapesPropertiesContainer.getNewLine());
        shapeString.append(shapesPropertiesContainer.getTagShapeOpenedXML()).append(shapesPropertiesContainer.getNewLine());
        shapeString.append(shapesPropertiesContainer.getTab());
        shapeString.append(shapesPropertiesContainer.putValueBetweenTagClassXML(shapeForConvert.getClass().getSimpleName()));
        shapeString.append(shapesPropertiesContainer.getNewLine()).append(shapesPropertiesContainer.getTab());
        shapeString.append(shapesPropertiesContainer.getTagPropertiesOpenedXML()).append(shapesPropertiesContainer.getNewLine());
        for (Field field : shapeForConvert.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTab());
            shapeString.append(shapesPropertiesContainer.getTagPropertyOpenedXML()).append(shapesPropertiesContainer.getNewLine());
            shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTab());
            shapeString.append(shapesPropertiesContainer.getRoundedTagByNameAndValue(field.getName().toLowerCase(), field.get(shapeForConvert)));
            shapeString.append(shapesPropertiesContainer.getNewLine());
            shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTab());
            shapeString.append(shapesPropertiesContainer.getTagPropertyClosedXML()).append(shapesPropertiesContainer.getNewLine());
        }
        shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTagPropertiesClosedXML());
        shapeString.append(shapesPropertiesContainer.getNewLine()).append(shapesPropertiesContainer.getTagShapeClosedXML());

        return shapeString.toString();
    }
}

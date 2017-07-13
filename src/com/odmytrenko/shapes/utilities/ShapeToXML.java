package com.odmytrenko.shapes.utilities;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToXML {

    public static String shapeToXML(Shape shape) throws IllegalAccessException {
        StringBuilder shapeString = new StringBuilder();
        shapeString.append(PropertiesContainer.getHeaderTagXML()).append(PropertiesContainer.getNewLine());
        shapeString.append(PropertiesContainer.getTagShapeOpenedXML()).append(PropertiesContainer.getNewLine());
        shapeString.append(PropertiesContainer.getTab());
        shapeString.append(PropertiesContainer.putValueBetweenTagClassXML(shape.getClass().getSimpleName()));
        shapeString.append(PropertiesContainer.getNewLine()).append(PropertiesContainer.getTab());
        shapeString.append(PropertiesContainer.getTagPropertiesOpenedXML()).append(PropertiesContainer.getNewLine());
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTab());
            shapeString.append(PropertiesContainer.getTagPropertyOpenedXML()).append(PropertiesContainer.getNewLine());
            shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTab());
            shapeString.append(PropertiesContainer.getRoundedTagByNameAndValue(field.getName().toLowerCase(), field.get(shape)));
            shapeString.append(PropertiesContainer.getNewLine());
            shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTab());
            shapeString.append(PropertiesContainer.getTagPropertyClosedXML()).append(PropertiesContainer.getNewLine());
        }
        shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTagPropertiesClosedXML());
        shapeString.append(PropertiesContainer.getNewLine()).append(PropertiesContainer.getTagShapeClosedXML());
        System.out.println(shapeString);

        return shapeString.toString();
    }
}

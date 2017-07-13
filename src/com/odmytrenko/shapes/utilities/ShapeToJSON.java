package com.odmytrenko.shapes.utilities;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToJSON {

    public static String shapeToJSON(Shape shape) throws IllegalAccessException {
        StringBuilder shapeString = new StringBuilder();
        shapeString.append(PropertiesContainer.getOpenedSquareBracket()).append(PropertiesContainer.getNewLine());
        shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTagClassJSON());
        shapeString.append(PropertiesContainer.getColon()).append(PropertiesContainer.getSpace());
        shapeString.append(shape.getClass().getSimpleName());
        shapeString.append(PropertiesContainer.getComma()).append(PropertiesContainer.getNewLine());
        shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTagPropertiesJSON());
        shapeString.append(PropertiesContainer.getColon()).append(PropertiesContainer.getSpace());
        shapeString.append(PropertiesContainer.getOpenedSquareBracket()).append(PropertiesContainer.getNewLine());
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getTab());
            shapeString.append(field.getName().toLowerCase());
            shapeString.append(PropertiesContainer.getColon()).append(PropertiesContainer.getSpace());
            shapeString.append(field.get(shape));
            shapeString.append(PropertiesContainer.getComma());
            shapeString.append(PropertiesContainer.getNewLine());
        }
        shapeString.append(PropertiesContainer.getTab()).append(PropertiesContainer.getClosedSquareBracket());
        shapeString.append(PropertiesContainer.getNewLine());
        shapeString.append(PropertiesContainer.getClosedSquareBracket()).append(PropertiesContainer.getNewLine());

        return shapeString.toString();
    }
}

package com.odmytrenko.shapes.utilities;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToJSON implements ConverterToJSON {

    private shapesPropertiesContainer shapesPropertiesContainer = new shapesPropertiesContainer();
    private Shape shapeForConvert;

    public ShapeToJSON(Shape shape) {
        shapeForConvert = shape;
    }

    public String toJSON() throws IllegalAccessException {
        StringBuilder shapeString = new StringBuilder();
        shapeString.append(shapesPropertiesContainer.getOpenedSquareBracket()).append(shapesPropertiesContainer.getNewLine());
        shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTagClassJSON());
        shapeString.append(shapesPropertiesContainer.getColon()).append(shapesPropertiesContainer.getSpace());
        shapeString.append(shapeForConvert.getClass().getSimpleName());
        shapeString.append(shapesPropertiesContainer.getComma()).append(shapesPropertiesContainer.getNewLine());
        shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTagPropertiesJSON());
        shapeString.append(shapesPropertiesContainer.getColon()).append(shapesPropertiesContainer.getSpace());
        shapeString.append(shapesPropertiesContainer.getOpenedSquareBracket()).append(shapesPropertiesContainer.getNewLine());
        for (Field field : shapeForConvert.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getTab());
            shapeString.append(field.getName().toLowerCase());
            shapeString.append(shapesPropertiesContainer.getColon()).append(shapesPropertiesContainer.getSpace());
            shapeString.append(field.get(shapeForConvert));
            shapeString.append(shapesPropertiesContainer.getComma());
            shapeString.append(shapesPropertiesContainer.getNewLine());
        }
        shapeString.append(shapesPropertiesContainer.getTab()).append(shapesPropertiesContainer.getClosedSquareBracket());
        shapeString.append(shapesPropertiesContainer.getNewLine());
        shapeString.append(shapesPropertiesContainer.getClosedSquareBracket()).append(shapesPropertiesContainer.getNewLine());

        return shapeString.toString();
    }
}

package com.odmytrenko.shapes.converting;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToJSON {

    public static void shapeToJSON(Shape shape) throws IllegalAccessException {
        System.out.println("{\r");
        System.out.println("\tclass: " + shape.getClass().getSimpleName() + ',');
        System.out.println("\tproperties: {");
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println("\t\t" + field.getName().toLowerCase() + ": " + field.get(shape) + ',');
        }
        System.out.println("}\r");
    }
}

package com.odmytrenko.shapes.converting;

import com.odmytrenko.shapes.Shape;

import java.lang.reflect.Field;

public class ShapeToXML {

    public static void shapeToXML(Shape shape) throws IllegalAccessException {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<shape>");
        System.out.println("\t<class>" + shape.getClass().getSimpleName() + "</class>");
        System.out.println("\t<properties>");
        for (Field field : shape.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println("\t\t<property>");
            System.out.println("\t\t" + '<' + field.getName().toLowerCase() + '>' + field.get(shape) +
                    "</" + field.getName().toLowerCase() + '>');
            System.out.println("\t\t</property>");
        }
        System.out.println("\t</properties>");
        System.out.println("</shape>");
    }
}

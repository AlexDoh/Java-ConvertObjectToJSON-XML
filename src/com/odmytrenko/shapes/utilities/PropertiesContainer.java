package com.odmytrenko.shapes.utilities;

import java.util.HashMap;
import java.util.Map;

public class PropertiesContainer {

    private static Map<String, Character> commonElements = new HashMap<>();
    private static Map<String, String> propertiesForXML = new HashMap<>();
    private static Map<String, String> propertiesForJSON = new HashMap<>();

    static {
        commonElements.put("opened square bracket", '{');
        commonElements.put("closed square bracket", '}');
        commonElements.put("tab", '\t');
        commonElements.put("new line", '\n');
        commonElements.put("colon", ':');
        commonElements.put("space", ' ');
        commonElements.put("comma", ',');

        propertiesForJSON.put("class", "class");
        propertiesForJSON.put("properties", "properties");

        propertiesForXML.put("class", "<class>");
        propertiesForXML.put("properties", "<properties>");
        propertiesForXML.put("property", "<property>");
        propertiesForXML.put("shape", "<shape>");
        propertiesForXML.put("head", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }

    public static char getOpenedSquareBracket() {
        return commonElements.get("opened square bracket");
    }

    public static char getClosedSquareBracket() {
        return commonElements.get("closed square bracket");
    }

    public static char getTab() {
        return commonElements.get("tab");
    }

    public static char getNewLine() {
        return commonElements.get("new line");
    }

    public static char getColon() {
        return commonElements.get("colon");
    }

    public static char getSpace() {
        return commonElements.get("space");
    }

    public static char getComma() {
        return commonElements.get("comma");
    }

    public static String getTagClassJSON() {
        return propertiesForJSON.get("class");
    }

    public static String getTagPropertiesJSON() {
        return propertiesForJSON.get("properties");
    }

    public static String getTagClassOpenedXML() {
        return propertiesForXML.get("class");
    }

    public static String getTagClassClosedXML() {
        return propertiesForXML.get("class").charAt(0) + "/" + propertiesForXML.get("class").substring(1);
    }

    public static String getTagPropertiesOpenedXML() {
        return propertiesForXML.get("properties");
    }

    public static String getTagPropertiesClosedXML() {
        return propertiesForXML.get("properties").charAt(0) + "/" + propertiesForXML.get("properties").substring(1);
    }

    public static String getTagPropertyOpenedXML() {
        return propertiesForXML.get("property");
    }

    public static String getTagPropertyClosedXML() {
        return propertiesForXML.get("property").charAt(0) + "/" + propertiesForXML.get("property").substring(1);
    }

    public static String getTagShapeOpenedXML() {
        return propertiesForXML.get("shape");
    }

    public static String getTagShapeClosedXML() {
        return propertiesForXML.get("shape").charAt(0) + "/" + propertiesForXML.get("shape").substring(1);
    }

    public static String putValueBetweenTagClassXML(String value) {
        return propertiesForXML.get("class") + value + propertiesForXML.get("class").charAt(0) + "/" +
                propertiesForXML.get("class").substring(1);
    }

    public static String putValueBetweenTagPropertiesXML(String value) {
        return propertiesForXML.get("properties") + value + propertiesForXML.get("properties").charAt(0) + "/" +
                propertiesForXML.get("properties").substring(1);
    }

    public static String putValueBetweenTagPropertyXML(String value) {
        return propertiesForXML.get("property") + value + propertiesForXML.get("property").charAt(0) + "/" +
                propertiesForXML.get("property").substring(1);
    }

    public static String putValueBetweenTagShapeXML(String value) {
        return propertiesForXML.get("shape") + value + propertiesForXML.get("shape").charAt(0) + "/" +
                propertiesForXML.get("shape").substring(1);
    }

    public static String getHeaderTagXML() {
        return propertiesForXML.get("head");
    }

    public static String getRoundedTagByNameAndValue(String tag, Object value) {
        return '<' + tag + '>' + value + "</" + tag + '>';
    }
}

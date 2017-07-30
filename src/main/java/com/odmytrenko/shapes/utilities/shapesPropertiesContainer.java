package com.odmytrenko.shapes.utilities;

import java.util.HashMap;
import java.util.Map;

public class shapesPropertiesContainer {

    private Map<String, Character> commonCharacters = new HashMap<>();
    private Map<String, String> propertiesForXML = new HashMap<>();
    private Map<String, String> propertiesForJSON = new HashMap<>();

    shapesPropertiesContainer() {
        commonCharacters.put("opened square bracket", '{');
        commonCharacters.put("closed square bracket", '}');
        commonCharacters.put("tab", '\t');
        commonCharacters.put("new line", '\n');
        commonCharacters.put("colon", ':');
        commonCharacters.put("space", ' ');
        commonCharacters.put("comma", ',');

        propertiesForJSON.put("class", "class");
        propertiesForJSON.put("properties", "properties");

        propertiesForXML.put("class", "<class>");
        propertiesForXML.put("properties", "<properties>");
        propertiesForXML.put("property", "<property>");
        propertiesForXML.put("shape", "<shape>");
        propertiesForXML.put("head", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }

    public char getOpenedSquareBracket() {
        return commonCharacters.get("opened square bracket");
    }

    public char getClosedSquareBracket() {
        return commonCharacters.get("closed square bracket");
    }

    public char getTab() {
        return commonCharacters.get("tab");
    }

    public char getNewLine() {
        return commonCharacters.get("new line");
    }

    public char getColon() {
        return commonCharacters.get("colon");
    }

    public char getSpace() {
        return commonCharacters.get("space");
    }

    public char getComma() {
        return commonCharacters.get("comma");
    }

    public String getTagClassJSON() {
        return propertiesForJSON.get("class");
    }

    public String getTagPropertiesJSON() {
        return propertiesForJSON.get("properties");
    }

    public String getTagClassOpenedXML() {
        return propertiesForXML.get("class");
    }

    public String getTagClassClosedXML() {
        return propertiesForXML.get("class").charAt(0) + "/" + propertiesForXML.get("class").substring(1);
    }

    public String getTagPropertiesOpenedXML() {
        return propertiesForXML.get("properties");
    }

    public String getTagPropertiesClosedXML() {
        return propertiesForXML.get("properties").charAt(0) + "/" + propertiesForXML.get("properties").substring(1);
    }

    public String getTagPropertyOpenedXML() {
        return propertiesForXML.get("property");
    }

    public String getTagPropertyClosedXML() {
        return propertiesForXML.get("property").charAt(0) + "/" + propertiesForXML.get("property").substring(1);
    }

    public String getTagShapeOpenedXML() {
        return propertiesForXML.get("shape");
    }

    public String getTagShapeClosedXML() {
        return propertiesForXML.get("shape").charAt(0) + "/" + propertiesForXML.get("shape").substring(1);
    }

    public String putValueBetweenTagClassXML(String value) {
        return propertiesForXML.get("class") + value + propertiesForXML.get("class").charAt(0) + "/" +
                propertiesForXML.get("class").substring(1);
    }

    public String putValueBetweenTagPropertiesXML(String value) {
        return propertiesForXML.get("properties") + value + propertiesForXML.get("properties").charAt(0) + "/" +
                propertiesForXML.get("properties").substring(1);
    }

    public String putValueBetweenTagPropertyXML(String value) {
        return propertiesForXML.get("property") + value + propertiesForXML.get("property").charAt(0) + "/" +
                propertiesForXML.get("property").substring(1);
    }

    public String putValueBetweenTagShapeXML(String value) {
        return propertiesForXML.get("shape") + value + propertiesForXML.get("shape").charAt(0) + "/" +
                propertiesForXML.get("shape").substring(1);
    }

    public String getHeaderTagXML() {
        return propertiesForXML.get("head");
    }

    public String getRoundedTagByNameAndValue(String tag, Object value) {
        return '<' + tag + '>' + value + "</" + tag + '>';
    }
}

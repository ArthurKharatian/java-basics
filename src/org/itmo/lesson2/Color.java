package org.itmo.lesson2;

public enum Color {
    GREEN("Зеленый", 1),
    LIGHT_BLUE("Зеленый", 1),
    BLACK("Зеленый", 1),
    RED("Зеленый", 1),
    WHITE("Зеленый", 1),
    ORANGE("Зеленый", 1);

    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}

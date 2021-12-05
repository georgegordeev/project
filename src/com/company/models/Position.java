package com.company.models;

public enum Position {
    FITTER ("монтажник"),
    STONE_CUTTER ("каменоломщик"),
    DEVELOPER ("разработчик");

    private String position;

    Position() {
    }

    Position(String position) {
        this.position = position;
    }

    public String getEnumPosition() {
        return position;
    }

    public String getStringPosition() {
        return "должность - " + position + ", ";
    }
}

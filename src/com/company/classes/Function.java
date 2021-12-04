package com.company.classes;

public enum Function {
    FITTER ("монтажник"),
    STONE_CUTTER ("каменоломщик"),
    DEVELOPER ("разработчик");

    private String function;

    Function() {
    }

    Function(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public String getInfoFunction() {
        return "должность - " + function + ", ";
    }
}

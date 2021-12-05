package com.company.classes;

public class StoneCutter extends Employee {

    private final String[] LAWS = {"Newton's first law", "Newton's second law", "Newton's third law"};

    private int[] lawsIndex;
    private String newtonsLaw = "";

    public StoneCutter(String name, String surname, int[] lawsIndex, Long salary) {
        super(name, surname, Position.STONE_CUTTER, salary);
        if (lawsIndex.length <= 3 && lawsIndex.length != 0) {
            this.lawsIndex = new int[lawsIndex.length];
            for (int i = 0; i < lawsIndex.length; i++) {
                this.lawsIndex[i] = lawsIndex[i];
            }
            newtonsLaw = "знает законы Ньютона: ";
        } else if (lawsIndex.length == 0) {
            this.lawsIndex = new int[] {};
            newtonsLaw = "не знает законы Ньютона, ";
        } else {
            throw new IllegalArgumentException("Некорректное создание объекта!");
        }


    }

    public String getNewtonsLaw() {
        return newtonsLaw;
    }

    @Override
    public String getInfoPosition(Position position) {
        if (lawsIndex.length <= 3 && lawsIndex.length != 0) {
            for (int i = 0; i < lawsIndex.length; i++) {
                newtonsLaw += LAWS[i] + ", ";
            }
        }
        return position.getStringPosition() + newtonsLaw ;
    }
}
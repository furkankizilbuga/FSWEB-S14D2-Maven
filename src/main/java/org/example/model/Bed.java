package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts ;

    public Bed(String style, int sheets, int quilts, int height, int pillows) {
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilts= quilts;
        this.height = height;
        this.style = style;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}

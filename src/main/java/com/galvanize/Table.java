package com.galvanize;

public class Table {

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                '}';
    }

    private String shape;
}

package com.itheima.homeWork.HomeWork04;

public class Fridge {
    private String[] color;
    private int[]  capacity;
    private String[] mode;



    public Fridge() {}

    public Fridge(String[] color, int[] capacity, String[] mode) {
        this.color = color;
        this.capacity = capacity;
        this.mode = mode;
    }


    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public int[] getCapacity() {
        return capacity;
    }

    public void setCapacity(int[] capacity) {
        this.capacity = capacity;
    }

    public String[] getMode() {
        return mode;
    }

    public void setMode(String[] mode) {
        this.mode = mode;
    }
}

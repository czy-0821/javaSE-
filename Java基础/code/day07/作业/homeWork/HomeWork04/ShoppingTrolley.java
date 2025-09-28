package com.itheima.homeWork.HomeWork04;

import java.lang.reflect.Field;

public class ShoppingTrolley {
    private frideDemo fridge;
    private int number;


    public void addAllToShoppingTrolley(){
        System.out.println("已经添加" +this.number+"台"+ this.fridge.getColor() +
                "容积为" + this.fridge.getCapacity() + "L净水模式为" +
                this.fridge.getMode() + "的饮水器到购物车中");
    }

    public ShoppingTrolley() {
    }

    public ShoppingTrolley(frideDemo fridge, int number) {
        this.fridge = fridge;
        this.number = number;
    }

    public frideDemo getFridge() {
        return fridge;
    }

    public void setFridge(frideDemo fridge) {
        this.fridge = fridge;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

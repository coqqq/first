package com.zelin.pojo;

public class fruit {
    public String name;        //水果名称
    public double price;       //水果价格
    public int num;            //水果数量
    public double sum;         //小计


    //构造无参
    public fruit(String s, String name, int num) {
        super();
    }

    public fruit(double price, int name) {
        this.price = price;
        this.num = name;
    }

    //构造有参
    public fruit(String name, double pice, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public fruit(String name, double price, int num, double sum) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", sum=" + sum +
                '}';
    }

    public int getSum() {
        return 0;
    }
}

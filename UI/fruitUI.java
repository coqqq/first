package com.zelin.pojo.UI;


import com.zelin.pojo.fruit;

import java.util.Scanner;

public class fruitUI {

    public fruit[] fruits;
    public int count = 0;
    private Object fruitUI;


    public fruitUI() {

        fruits = new fruit[5];
    }

    public void showMenu() {
        System.out.println("================ 水果超市 ================");
        System.out.println("【1】购买苹果");
        System.out.println("【2】购买桔子");
        System.out.println("【3】购买香蕉");
        System.out.println("【4】打印小票");
        System.out.println("【5】退出系统");
        System.out.println("=======================================");


        //定于一个扫描器
        Scanner sc = new Scanner(System.in);
        //用户选择
        user(sc);

    }

    private void user(Scanner sc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择商品：");

        int top = sc.nextInt();
        int sum = 0;
        switch (top) {
            case 1:
                System.out.println("苹果");
                fruit apple = fruits(sc, 10.0, "苹果", sum);
                break;

            case 2:
                System.out.println("桔子");
                fruit oranage = fruits(sc, 4.8, "桔子", sum);
                break;

            case 3:
                System.out.println("香蕉");
                fruit banana = fruits(sc, 3, "香蕉", sum);
                break;

            case 4:
                System.out.println("打印小票");
                printTickets();
                break;

            case 5:
                System.out.println("退出系统");
                System.exit(0);
                break;

            //default:
            // break;
        }
        System.out.println("是否重新选择： (y/n)");

        if (sc.next().equalsIgnoreCase("y")) {
            user(sc);
        }

        fruits[count++] = (fruit) fruitUI;
    }

    private void printTickets() {

            double sum = 0.0;
            //1.遍历数组
            for (int k = 0; k < fruits.length; k++) {
                //1.1)获得水果对象
                fruit fruit = fruits[k];
                if (fruit != null) {
                    //1.2)计算总金额
                    sum += fruit.getSum();
                }

//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
//                        System.out.println("\t\t 总计(￥)：" + sum);
//                System.out.printlnrintln("\t\t 当前日期：" + sdf.format(new Date()));
                System.out.println("------------------------------------------------ ");
            }


        }



    private fruit fruits(Scanner sc, double price, String name, int sum) {
        System.out.println("请输入购买数量：");
        //1.构造对象
        int num = sc.nextInt();
        fruit fruits = new fruit(name, price, num);
        return fruits;


    }


}




package com.zsj.lib.androidlibtest.entity;

/**
 * Created by shkstart on 2016/11/12 0012.
 */
public class Product {
    public Product(String memberNum, String minTouMoney, String money, String name, String suodingDays, String yearRate) {
        this.memberNum = memberNum;
        this.minTouMoney = minTouMoney;
        this.money = money;
        this.name = name;
        this.suodingDays = suodingDays;
        this.yearRate = yearRate;
    }

    public String memberNum;
    public String minTouMoney;
    public String money;
    public String name;
    public String suodingDays;
    public String yearRate;
}

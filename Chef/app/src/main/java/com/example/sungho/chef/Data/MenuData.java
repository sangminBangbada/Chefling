package com.example.sungho.chef.Data;

import java.util.ArrayList;

/**
 * 파이어베이스에 전체 메뉴 정보를 보내기 위한 객체
 * Generated by JSW 2019-10-24
 */
public class MenuData {
    private ArrayList<Cooks> cooks = new ArrayList<Cooks>();
    private ArrayList<Foods> foods = new ArrayList<Foods>();
    private RestaurantInfo rest_info = new RestaurantInfo();

    public RestaurantInfo getRest_info() {
        return rest_info;
    }

    public void setRest_info(RestaurantInfo rest_info) {
        this.rest_info = rest_info;
    }

    public ArrayList<Cooks> getCooks() {
        return cooks;
    }

    public void setCooks(ArrayList<Cooks> cooks) {
        this.cooks = cooks;
    }

    public ArrayList<Foods> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Foods> foods) {
        this.foods = foods;
    }
}

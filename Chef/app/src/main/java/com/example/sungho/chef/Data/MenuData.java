package com.example.sungho.chef.Data;

import com.example.sungho.chef.Position;

import java.util.ArrayList;

/**
 * 파이어베이스에 전체 메뉴 정보를 보내기 위한 객체
 * Generated by JSW 2019-10-24
 */
public class MenuData {
    private ArrayList<Cooks> cooks = new ArrayList<Cooks>();
    private ArrayList<Foods> foods = new ArrayList<Foods>();
    private ArrayList<Positions> positions = new ArrayList<Positions>();
    private ArrayList<String> foods_type = new ArrayList<String>();
    private RestaurantInfo rest_info = new RestaurantInfo();

    // Getter
    public ArrayList<Positions> getPositions() { return positions; }
    public RestaurantInfo getRest_info() {
        return rest_info;
    }
    public ArrayList<Cooks> getCooks() {
        return cooks;
    }
    public ArrayList<Foods> getFoods() {
        return foods;
    }
    public ArrayList<String> getFoods_type() { return foods_type; }

    // Setter
    public void setPositions(ArrayList<Positions> positions) { this.positions = positions; }
    public void setRest_info(RestaurantInfo rest_info) {
        this.rest_info = rest_info;
    }
    public void setCooks(ArrayList<Cooks> cooks) {
        this.cooks = cooks;
    }
    public void setFoods(ArrayList<Foods> foods) {
        this.foods = foods;
    }
    public void setFoods_type(ArrayList<String> foods_type) { this.foods_type = foods_type; }
}
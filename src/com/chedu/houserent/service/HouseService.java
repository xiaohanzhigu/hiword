package com.chedu.houserent.service;

import com.chedu.houserent.domain.House;

public class HouseService {
    private House[] houses ;
    private int houseNum = 3;
    private int houseCounter = 3;

    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"李明","111","保定市",2000,"未出租");
        houses[1] = new House(2,"大力","112","石家庄",5000,"未出租");
        houses[2] = new House(3,"海棠","113","曲阳县",5000,"已出租");
    }

    //房屋信息查询
    public House find(int findId){
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }



    //删除房屋
    public boolean del(int delLd){
        int index = -1;
        for (int i = 0; i < houseNum ; i++) {
            if (houses[i].getId() == delLd){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;
        return true;
    }

    //添加房屋
    public boolean add(House newHouse){
        if (houseNum == houses.length){
            System.out.println("房屋已满");
            return false;
        }
        houses[houseNum++] = newHouse;
        newHouse.setId(++houseCounter);
        //房屋自增
        House[] newHouses = new House[houses.length+1];
        System.arraycopy(houses,0,newHouses,0,houses.length);
        houses = newHouses;
        return true;
    }

    //房屋列表
    public House[] list(){
        return houses;
    }
}

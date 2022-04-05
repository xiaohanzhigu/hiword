package com.chedu.houserent.view;

import com.chedu.houserent.service.HouseService;
import com.chedu.houserent.utility.Utility;
import com.chedu.houserent.domain.House;

public class houseView {

    private boolean loop = true;
    private char key;
    private HouseService houseService = new HouseService(5);

    public void mainMenu(){
        do{
            System.out.println("\n================房屋出租界面================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("=========================================");
            key = Utility.readChar();
            switch(key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    upDateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }

    //房屋信息查询
    public void findHouse(){
        System.out.println("请输入要查询的房屋id(-1退出)");
        int findId = Utility.readInt();
        if (findId == -1){
            return;
        }
        House house = houseService.find(findId);
        if (house != null ){
            System.out.println(house);
        }else {
            System.out.println("没有找到此房屋");
        }
    }

    //修改房屋信息
    public void upDateHouse(){
        System.out.print("请输入要修改房屋信息的编号(输入-1退出): ");
        int upDateId = Utility.readInt();
        if (upDateId == -1){
            return;
        }
        House house = houseService.find(upDateId);
        if (house == null) {
            System.out.println("没有此房屋");
            return;
        } else {
            System.out.print("姓名（" +house.getName() +" ): ");
            String name = Utility.readString(10,"");
            if (!"".equals(name)){
                house.setName(name);
            }

            System.out.print("电话（" +house.getPhone()+"): ");
            String phone = Utility.readString(12,"");
            if (!"".equals(phone)){
                house.setPhone(phone);
            }

            System.out.print("地址（"+house.getAddress()+"): ");
            String Address = Utility.readString(20,"");
            if (!"".equals(Address)){
                house.setAddress(Address);
            }

            System.out.print("租金（" +house.getRent()+ "): " );
            int rent = Utility.readInt(-1);
            if (rent != -1) {
                house.setRent(rent);
            }

            System.out.print("状态（" +house.getState()+"): " );
            String state = Utility.readString(5,"");
            if (!"".equals(state)) {
                house.setState(state);
            }

            System.out.println("修改完成");
        }
    }

    //删除房屋信息
    public void delHouse(){
        System.out.println("请输入要删除的房屋id（收入-1退出）:");
        int delLd = Utility.readInt();
        System.out.println(delLd);
        if (delLd == -1) {
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delLd)){
                System.out.println("房屋信息已删除");
            }else {
                System.out.println("没有找到该编号");
            }
        }else{
            System.out.println("放弃删除");
        }
    }

    //添加房源
    public void addHouse(){
        System.out.print("请输入姓名: ");
        String name = Utility.readString(8);
        System.out.print("请输入电话: ");
        String phone = Utility.readString(11);
        System.out.print("请输入地址: ");
        String address = Utility.readString(10);
        System.out.print("请输入租金: ");
        int rent = Utility.readint(10);
        System.out.print("请输入状态:");
        String state = Utility.readString(5);
        House newHouse = new House(0,name,phone,address,rent,state);
        houseService.add(newHouse);
    }

    //房屋列表
    public void listHouse(){
        House[] houses = houseService.list();
        System.out.println("================房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("====================================");
    }

    //退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
}

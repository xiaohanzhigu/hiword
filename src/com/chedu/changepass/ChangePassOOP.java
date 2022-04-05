package com.chedu.changepass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class ChangePassOOP {

    Scanner scanner = new Scanner(System.in);
    int choose;
    Information[] information = new Information[3];
    int count = 0;
    Date date = null;
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    boolean loop = true;
    double balance;

    public void showMenu(){
        do {
            System.out.println("=================零钱通=================");
            System.out.println("\t\t\t1    零钱通明细");
            System.out.println("\t\t\t2    收益入账");
            System.out.println("\t\t\t3    支出");
            System.out.println("\t\t\t4    退出");
            System.out.println("请选择功能（1-4）：");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    this.showInformation();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4 :
                    this.exit();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while(loop);
    }

    public void showInformation(){
        for (int i = 0; i < count; i++) {
            System.out.println(information[i]);
        }
    }

    public void income(){ //入账
        double incomeMoney;
        System.out.println("请输入金额");
        incomeMoney = scanner.nextDouble();
        if (incomeMoney < 0){
            System.out.println("输入错误");
            return;
        }
        information[count] = new Information();
        information[count].money = incomeMoney;
        System.out.println("请输入商品信息: ");
        information[count].note = scanner.next();
        date = new Date();
        information[count].date = s.format(date);
        balance += incomeMoney;
        information[count].balance = balance;
        Information[] newInformation = new Information[information.length+1];
        System.arraycopy(information, 0, newInformation, 0, information.length);
        information = newInformation;
        count++;
    }

    public void pay(){
        double payMoney;
        System.out.println("请输入支出金额: ");
        payMoney = scanner.nextDouble();
        if (payMoney > balance){
            System.out.println("余额不足");
            return;
        }
        if (payMoney < 0){
            System.out.println("输入错误");
        }
        information[count] = new Information();
        information[count].money = payMoney;
        System.out.println("请输入消费信息：");
        information[count].note = scanner.next();
        date = new Date();
        information[count].date = s.format(date);
        balance -= payMoney;
        information[count].balance = balance;
        Information[] newInformation = new Information[information.length+1];
        System.arraycopy(information,0,newInformation,0,information.length);
        information = newInformation;
        count++;
    }

    public void exit(){
        String  choice;
        while(true) {
            System.out.println("请输入Y/N");
            choice = scanner.next();
            if ("y".equals(choice) || "Y".equals(choice) ||
                "n".equals(choice) || "N".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice) || "Y".equals(choice)){
            loop = false;
            System.out.println("退出");
        }
    }
}


package com.chedu.encap;

class Account {
    private String name;
    private double balance;
    private String  pass;

    public Account(){

    }

    public Account(String name,double balance,String  pass){
        setName(name);
        setBalance(balance);
        setPass(pass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length()<=4 && name != null) {
            this.name = name;
        }else {
            System.out.println("名字长度需要大于等于2小于等于4，以为你设置为默认名字张三");
            this.name = "张三";
        }
    }

    public String  getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if (pass.length() == 6 ) {
            this.pass = pass;
        }else {
            System.out.println("密码必须为六位数，以为你设置为123456");
            this.pass = "123456";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        }else {
            System.out.println("余额必须大于等于20，以为你设置为0");
        }
    }
    public String  inof(){
        return "名字："+this.name+"  余额："+this.balance+"  密码："+this.pass;
    }
}

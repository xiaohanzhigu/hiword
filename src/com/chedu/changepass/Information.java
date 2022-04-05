package com.chedu.changepass;

public class Information {
    String note;
    double money;
    String date;
    double balance;

    @Override
    public String toString() {
        return "Information{" +
                "note='" + note + '\'' +
                ", money=" + money +
                ", date='" + date + '\'' +
                ", balance=" + balance +
                '}';
    }
}

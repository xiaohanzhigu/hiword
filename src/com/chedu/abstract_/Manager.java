package com.chedu.abstract_;

public class Manager extends Empolyee{
    private int  bonus;

    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void work() {
        System.out.println("经理" + getName() + getId() + "正在工作");
    }
}

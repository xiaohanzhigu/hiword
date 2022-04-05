package com.chedu.abstract_;

public class CommonEmpolyee extends Empolyee{
    public CommonEmpolyee(String name, String id, int salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("员工"+getName() + getId() + "正在工作");
    }
}

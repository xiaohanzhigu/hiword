package com.chedu.polyparameter;

//import com.chedu.override.Person;

import java.util.Date;

public class polyParameter {
    public static void main(String[] args) {
        Manage liming = new Manage("liming", 5000, 300);
        Worker xiaoli = new Worker("xiaoli", 3000);
        System.out.println(liming.getAnnual());
        System.out.println(xiaoli.getAnnual());
        Tools tools = new Tools();
        tools.testWork(liming);
        tools.testWork(xiaoli);
        String a1 = "asd";
        String a2 = "asd";
        String a3 = new String("1000");
        String a4 = new String("1000");
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);

        Date data = null;

    }

}
class Tools{
    public void testWork(Empolyee e){
        if (e instanceof Worker){
            System.out.println(((Worker) e).Work());
        }else if (e instanceof Manage){
            System.out.println(((Manage) e).manage());
        }else {

        }
    }
}

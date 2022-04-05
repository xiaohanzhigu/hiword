package com.chedu.homework.chapter11;

public class EcmDef {
    public static void main(String[] args) {
        String a = "asdf";
        int i = Integer.parseInt(a);
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);
            System.out.println(res);


        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static double cal(int a,int b){
        int res = a / b;
        return res;
    }
}

package com.chedu.homework;

import java.util.Arrays;
import java.util.Comparator;

/*
案例:自定义Book类,里面包含name和price,按price排序(从大到小)
.要求使用两种方式排序,有一个Book[]books=4本书对象.
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] Books = new Book[4];
        Books[0] = new Book("三国演义", 100);
        Books[1] = new Book("水浒传", 90);
        Books[2] = new Book("红楼", 120);
        Books[3] = new Book("西游记", 200);

//        System.out.println(Arrays.toString(soft(Books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1 = (Integer) o1;
//                Integer i2 = (Integer) o2;
//                return i1 - i2;
//            }
//        })));

        Arrays.sort(Books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                return i1.name.length() - i2.name.length();
            }
        });
        System.out.println(Arrays.toString(Books));
    }
    public static Book[] soft(Book[] Books, Comparator c){
        for (int i = 0; i < Books.length; i++) {
            Book book = new Book();
            for (int j = 0; j < Books.length - 1 - i; j++) {
                if (c.compare(Books[j].price, Books[j + 1].price) >  0){
                    book = Books[j];
                    Books[j] = Books[j + 1];
                    Books[j + 1] = book;
                }
            }
        }
        return Books;
    }
}

class Book{
    String name;
    int price;

    public Book(){}
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
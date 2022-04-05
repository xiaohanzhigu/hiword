//求数组最大值
//考虑了数组为空和没有数组的情况
/*
public class hello{
    public static void main(String[] args) {
        double[] arr = null;
        A01 a01 = new A01();
        if (a01.Max(arr) != null){
            System.out.println(a01.Max(arr));
        }else {
            System.out.println("数组为null");
        }
    }
}
class A01{
    public Double Max(double[] arr){
        if (arr != null &&arr.length > 0){
            double max = arr[0];
            for (int i = 1;i < arr.length;i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }
    }
}
 */

//多态数组
//利用了类型判断和向下转型
/*
class Person {//父类
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {//返回名字和年龄
        return name + "\t" + age;
    }
}


class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getscore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //重写父类say

    public String say() {
        return "学生" + super.say() + " score=" + score;
    }

    //特有的方法
    public void study() {
        System.out.println("学生" + getName() + "正在学java..");
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写重写父类的 say 方
    @Override
    public String say() {
        return "老师 " + super.say() + " salary=" + salary;
    }

    //特有方法
    public void teach() {
        System.out.println("老师 " + getName() + " 正在讲 java 课程...");
    }
}

public class hello {
    public static void main(String[] args) {
                //应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
                 // 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 say 方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
                //循环遍历多态数组，调用 say
        for (int i = 0; i < persons.length; i++) {
                //老师提示: person[i] 编译类型是 Person ,运行类型是是根据实际情况有 JVM 来判断
            System.out.println(persons[i].say());//动态绑定机制
                //这里大家聪明. 使用 类型判断 + 向下转型.
            if (persons[i] instanceof Student) {//判断 person[i] 的运行类型是不是 Student
                Student student = (Student) persons[i];//向下转型
                student.study();
                //小伙伴也可以使用一条语句 ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
                //System.out.println("你的类型有误, 请自己检查...");
            } else {
                System.out.println("你的类型有误, 请自己检查...");
            }
        }
    }
}
 */

//删除数组中的指定值
/*
public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int last = 0,slow = 0;
        while (last < len) {
            if (nums[last] != val) {
                nums[slow] = nums[last];
                slow++;
            }
            last++;
        }
        return slow;
    }
}
 */
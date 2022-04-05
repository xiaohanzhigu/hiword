package com.chedu.encap;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc1 = new PC("华硕","16GB","R9-5900HX","512G");
        Note note = new Note("魔幻青","16GB","R9-5900HX","512G");
        System.out.println(pc1.getDetails()+"\n品牌  "+pc1.getBrand());
        System.out.println(note.getDetails()+"\n颜色  "+note.getColor());
    }
}
class Computer{
    private String memory;
    private String CPU;
    private String disk;

    public String getDetails(){
        return "内存  "+memory+"\nCPU  "+CPU+"\n硬盘  "+disk;
    }

    public Computer(){
    }

    public Computer(String memory, String CPU, String disk) {
        setMemory(memory);
        setCPU(CPU);
        setDisk(disk);
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}

class PC extends Computer{
    private String brand;

    public PC(String brand,String memory, String CPU, String disk) {
        super(memory, CPU, disk);
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Note extends Computer{
    private String color;

    public Note(String color,String memory, String CPU, String disk){
        super(memory,CPU,disk);
        //this.color = color;
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
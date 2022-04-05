//杨辉三角
/*public class hello{
        public static void main(String[] arge){
            int arr[][] = new int[20][];
            for (int i = 0;i<arr.length;i++){
                arr[i] = new int[i+1];
                for (int j = 0;j<arr[i].length;j++) {
                    if (j == 0||j == arr[i].length - 1) {
                        arr[i][j] = 1;
                    }
                    else {
                        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    }
                }
            }
            for (int i = 0;i<arr.length;i++){
                for (int j = 0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.print("\n");
            }
        }
    }*/
//int类型迷宫
/*public class hello {
    public static void main(String[] arge) {
        Map map1 = new Map();
        //制作迷宫
        int[][] map = new int[8][7];
        for(int i = 0; i < map.length;i++){
            for(int j = 0;j < map[i].length;j++){
                map[0][j] = 1;
                map[7][j] = 1;
                if (i > 0 && i < 7){
                    if ( j == 0 || j == 6){
                        map[i][j] = 1;
                    }
                }
            }
        }
        //设置障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        map[4][2] = 1;
        map[4][3] = 1;
        map[3][4] = 1;
        //初始地图
        map1.showMap(map);
        //判断找没找到
        if (map1.findWay(map,1,1)){
            System.out.println("找到后的地图");
            map1.showMap(map);
        }
        else {
            System.out.println("没有找到");
            map1.showMap(map);
        }
    }
}
class Map{
    public boolean findWay(int[][] map,int i,int j) {
        if (map[6][5] == 2) { //终点
            return true;
        } else if (map[i][j] == 0) {
            map[i][j] = 2; //先假设可以走
            if (findWay(map, i + 1, j)) { //下走
                return true;
            } else if (findWay(map, i, j + 1)) { //右走
                return true;
            } else if (findWay(map, i - 1, j)) { //左走
                return true;
            } else if (findWay(map, i, j - 1)) { //上走
                return true;
            } else {
                map[i][j] = 3; //死路
                return false;
            }
        } else {
            return false;
        }
    }
    public void showMap(int[][] map){
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}*/
//char类型迷宫
/*public class hello {
    public static void main(String[] arge) {
        Map map1 = new Map();
        //制作迷宫
        //'|'代表墙，'*'代表可以走到路,'#'代表死路
        char[][] map = new char[8][7];
        for(int i = 0; i < map.length;i++){
            for(int j = 0;j < map[i].length;j++){
                if (i > 0 && i < 7){
                    if ( j == 0 || j == 6){
                        map[i][j] = '|';
                    }else {
                        map[i][j] = '0';
                    }
                    map[0][j] = '|';
                    map[7][j] = '|';
                }
            }
        }
        //设置障碍物
        map[3][1] = '|';
        map[3][2] = '|';
        map[2][2] = '|';
        //map[4][2] = '|';
        //map[4][3] = '|';
        //map[3][4] = '|';
        //初始地图
        map1.showMap(map);
        //判断找没找到
        if (map1.findWay(map,1,1)){
            System.out.println("找到后的地图");
            map1.showMap(map);
        }
        else {
            System.out.println("没有找到");
            map1.showMap(map);
        }
    }
}
class Map{
    public boolean findWay(char[][] map,int i,int j) {
        System.out.println("第"+i+++"次");
        showMap(map);
        if (map[6][5] == '*') { //终点
            return true;
        } else if (map[i][j] == '0') {
            map[i][j] = '*'; //先假设可以走
            //找路策略：下->右->左->下
            if (findWay(map, i + 1, j)) { //下走
                return true;
            } else if (findWay(map, i, j + 1)) { //右走
                return true;
            } else if (findWay(map, i - 1, j)) { //左走
                return true;
            } else if (findWay(map, i, j - 1)) { //上走
                return true;
            } else {
                map[i][j] = '#'; //死路
                return false;
            }
        } else {
            return false;
        }
    }
    public void showMap(char[][] map){
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}*/
//汉诺塔
/*public class hello {
    public static void main(String[] arge) {
       int num = 2;
       Map p = new Map();
       p.move(num,'A','B','C');
    }
}
class Map{
    public void move(int num,char a,char b,char c){
        if (num == 1){
            System.out.println(a+"->"+c);
        }else {
            move(num - 1 ,a,c,b);
            System.out.println(a+"->"+c);
            move(num - 1,b,a,c);
        }
    }
}*/
//八皇后
/*
public class hello{
    public static void main(String[] arge){
        int[][] arr = new int[8][8];
        eightQueen myQueen = new eightQueen();
        myQueen.runBoard(arr,0);
    }
}

class eightQueen{
    private static int count = 0;

    //检查棋盘
    public boolean judgeBoard(int[][] arr,int low,int row) {
        for (int i = low-1; i >= 0; i--) { //检查上面
            if (arr[i][row] == 1) {
                return false;
            }
        }
        for (int i = low-1,j = row-1;i >= 0 && j >= 0;i--,j--){ //检查左上
            if (arr[i][j] == 1){
                return false;
            }
        }
        for (int i = low-1,j = row+1;i >= 0 && j < arr[i].length;i--,j++){ //检查右上
            if (arr[i][j] == 1){
                return false;
            }
        }
        //arr[low][row] = 1;
        return true;
    }

    //显示棋盘
    public void showBoard(int[][] arr){
        System.out.println("第" + ++count +"次");
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
                }
            System.out.print("\n");
            }
    }

    //运行棋盘
    public void runBoard(int[][] arr,int row){
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if (judgeBoard(arr, row, i)) {
                arr[row][i] = 1;
                if (row == 8 - 1){
                    showBoard(arr);
                } else {
                    runBoard(arr, row + 1);
                }
                arr[row][i] = 0;
            }
        }
    }

}*/
//猜拳
/*
import java.util.Random;
import java.util.Scanner;
public class hello{
    public static void main(String[] args){
        Tom tom = new Tom();
        tom.play();
    }
}
class Tom{
    //0为石头，1为剪刀，2为布
    public Integer judge(int player,int pc){
        if (player == pc){
            return 0;
        }else if (pc == 0 && player == 1){
            return -1;
        }else if (pc == 0 && player == 2){
            return 1;
        }else if (pc == 1 && player == 2){
            return -1;
        }else if (pc == 1 && player == 0){
            return 1;
        }else if (pc == 2 && player == 0){
            return -1;
        }else  {
            return 1;
        }
    }
    public void play(){
        Scanner input = new Scanner(System.in);
        int i=0,n = 3;
        int[] pc = new int[n];
        int[] player = new int[n];
        int[] result = new int[n];
        do {
             player[i] = input.nextInt();
             pc[i] = (int) (Math.random() * 10 / 4);

                 while (true) {
                     if(player[i] > 2||player[i] < 0){
                         System.out.println("输入错误请重新输入");
                         player[i] = input.nextInt();
                     }else{
                         break;
                     }
                 }

            if (player[i] <= 2) {
                result[i] = judge(player[i], pc[i]);
                System.out.println("玩家：" + player[i] + "  电脑：" + pc[i] + "  结果：" +result[i] );
            }
            i++;
        }while (i < n);

        System.out.println("结束");
        for (int j = 0;j < n;j++){
            System.out.println("玩家：" + player[j] + "  电脑：" + pc[j] + "  结果：" +result[j] );
        }
        }
}



 */
//翻转二维数组
/*
public class hello{
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //上下交换
        int[] t = matrix[0];
        matrix[0] = matrix[matrix.length-1];
        matrix[matrix.length-1] = t;

        int i = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                int row = i+1,cow = j-1;
                for (; row < matrix.length && cow >= 0; row++,cow--) {}
                row--;cow++;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row][cow];
                matrix[row][cow] = temp;
            }

             i = matrix.length-1;
        for (int j = matrix[matrix.length-1].length-2; j > 0; j--) {
            int row = i;
            int cow = j;
            System.out.println(i+"  "+j);
            for (; row > 0 && cow < matrix[matrix.length - 1].length - 1; row--, cow++) {}
            //row++;cow--;
            System.out.println(row+"  "+cow);
            int temp = matrix[i][j];
            matrix[i][j] = matrix[row][cow];
            matrix[row][cow] = temp;
        }
        for ( i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
 */
package com.chedu.clessexercise;

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

}
package JKlevel;

import java.util.Arrays;

public class twicelevel3 {
    // A {{5,6,78,1},{7,54,15,6},{7,45,16,12},{17,2,11,-15}}
    // B {{8,13,19,-5},{45,-8,1,45},{33,4,6,27},{14,22,75,31}}
    /*public static int[][] initializationMatrix(int n){
        int[][] result = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                result[i][j] = (int)(Math.random()*10); //采用随机函数随机生成1~10之间的数
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        int[][] RS = new int[4][4];
        int[][] A = {{5, 6, 78, 1}
                , {7, 54, 15, 6}
                , {7, 45, 16, 12}
                , {17, 2, 11, -15}};
        int[][] B = {{8, 13, 19, -5},
                {45, -8, 1, 45},
                {33, 4, 6, 27},
                {14, 22, 75, 31}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    RS[i][j] =RS[i][j] +  A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("【");
            for (int j = 0; j < 4; j++) {
                System.out.print(RS[i][j] + " ");
            }
            System.out.println("】");
            System.out.println("\n");


        }
    }
}

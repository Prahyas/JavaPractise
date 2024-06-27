import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int sum(int[][] arr){
        int sumi = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sumi = sumi + arr[i][j];
            }
        }
        return sumi;
    }

    public static void main(String[] args) {

        int[][] myArr = new int[3][3];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[1][0] = 4;
        myArr[1][1] = 5;
        myArr[1][2] = 6;
        myArr[2][0] = 7;
        myArr[2][1] = 8;
        myArr[2][2] = 9;

        System.out.println(sum(myArr));

    }
}
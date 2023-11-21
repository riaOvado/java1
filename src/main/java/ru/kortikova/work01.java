package ru.kortikova;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class work01 { //классы с б буквы, дорогая
    public static void main(String[] args) {
        //Task01();
        //Task02();
        //Task03();
        //Task04();
        //Task05(5,1);
        //Task06();


        }
    public static void Task01(){
        int [] arr2 = {1,1,0,0,0,1,0};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0){
                arr2[i] = 1;
            } else if (arr2[i] == 1){
                arr2[i] = 0;
            }
            System.out.print(arr2[i] + " ");
        }

    }

    public static void Task02(){
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static  void Task03(){
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6){
                arr3[i]*=2;
            }
            System.out.print(arr3[i] + " ");

        }
    }
    
    public static void Task04(){
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if(i==j || arr4[i].length - i - 1 == j){
                    arr4[i][j] = 1;
                } else {arr4[i][j] = 0;}
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
            
        }
    }

    public static void Task05(int len, int initValue){
        int [] arr = new int[len];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = initValue;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task06(){
        int[][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j ||arr[i].length - i - 1 == j ){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

}

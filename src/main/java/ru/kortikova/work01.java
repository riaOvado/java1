package ru.kortikova;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class work01 { //классы с б буквы, дорогая
    public static void main(String[] args) {
        //Task01();
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

}

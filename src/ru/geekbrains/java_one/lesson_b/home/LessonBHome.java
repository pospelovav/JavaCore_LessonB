package ru.geekbrains.java_one.lesson_b.home;

import java.util.Arrays;

public class LessonBHome {

    private static int[] inversion (int[] arr){
        int[] arrInversion = Arrays.copyOf(arr, arr.length);  //копирование массива (на случай, если оригинал нужно оставить)
        for (int i = 0; i < arrInversion.length; i++){
            if (arrInversion[i] == 0){    //трогаем только 1 и 0
                arrInversion[i] = 1;
            } else if (arrInversion[i] == 1){
                arrInversion[i] = 0;
            }
        }
        return arrInversion;
    }

    private static void arrPlusTree (int[] arr){
        int el = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = el;
            el+=3;
        }
    }

    private  static int[] arrLessSixXTwo (int[] arr){
        int[] arrLessSix = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < arrLessSix.length; i++){
                if (arrLessSix[i] < 6){
                    arrLessSix[i] *= 2;
                }
            }
        return arrLessSix;
    }

    private static int arrMaxElement (int[] arr){
        int maxEl = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxEl < arr[i]){
                maxEl = arr[i];
            }
        }
        return maxEl;
    }

    private static int arrMinElement (int[] arr){
        int minEl = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (minEl > arr[i]){
                minEl = arr[i];
            }
        }
        return minEl;
    }

    private static void arrDiagModif (int[][] arr){
        int i = 0;
        int j = 0;
        while (i < arr[0].length){
            arr[i][j] = 1;
            i++;
            j++;
        }
    }

    private static void printArrSquare (int[][] arr){     //печать квадратных массивов
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }

    private static boolean checkBalance (int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        int df = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        //System.out.println(rightSum);
        for (int i = 0; i < arr.length; i++){
            rightSum -= arr[i];
            leftSum += arr[i];
            if (leftSum == rightSum) {
                df = 1;                         //если сюда написать return, то ругается, поэтому тут костылик
            }
        }
        return (df == 1);
    }

    public static void main (String[] args){
        int[] arr = {0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1};
        int[] arrInv = inversion(arr);
        System.out.println("Original:  " + Arrays.toString(arr));
        System.out.println("Inversion: " + Arrays.toString(arrInv));
        System.out.println();

        int[] arrEight = new int[8];
        arrPlusTree(arrEight);
        System.out.println("PlusTree: " + Arrays.toString(arrEight));
        System.out.println();

        int[] arrXTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrXTwoModif = arrLessSixXTwo(arrXTwo);
        System.out.println("Original array:  " + Arrays.toString(arrXTwo));
        System.out.println("LessSixXTwo: " + Arrays.toString(arrXTwoModif));
        System.out.println();

        int[] arrForMaxMin = {1, 5, 3, 2, 11, 4, -5, 2, 4, 8, 9, 11};
        System.out.println(Arrays.toString(arrForMaxMin));
        System.out.println("MaxElement = " + arrMaxElement(arrForMaxMin));
        System.out.println("MinElement = " + arrMinElement(arrForMaxMin));
        System.out.println();

        int[][] arrSquare = new int[4][4];
        printArrSquare(arrSquare);
        arrDiagModif(arrSquare);
        printArrSquare(arrSquare);

        int[] arrForBalance = {10, 1, 2, 3, 4};  //true
       // int[] arrForBalance = {1, 1, 1, 2, 1};  //true
       // int[] arrForBalance = {2, 1, 1, 2, 1};   //false
       // int[] arrForBalance = {2, 1, 1, 2, 3, 1};   //false
        System.out.println(checkBalance(arrForBalance));

    }
}

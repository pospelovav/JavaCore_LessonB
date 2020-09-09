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

    }
}

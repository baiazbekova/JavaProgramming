package practice;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50};
        int[] arr3 = {60, 70, 80};
    //                        0           1           2
        int[][] arr2D = {{10, 20, 30}, {40, 50}, {60, 70, 80}};
        System.out.println(Arrays.deepToString(arr2D));

        //{40, 50}
        System.out.println(Arrays.toString(arr2D[1]));

        //80
        System.out.println(arr2D[2][2]);



    }

}

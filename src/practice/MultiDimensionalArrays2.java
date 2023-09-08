package practice;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

         /*
        group1 = {"Ahmed", "Jimmy"};
        group2 = {"Breanna", "Victoria", "Daniel"};
        group3 = {"Natalia", "Aaron", "Christina", "Josh"};
        */
            //                      0                 1                                  2
        String[][] groups = {{"Ahmed", "Jimmy"}, {"Breanna", "Victoria", "Daniel"},{"Natalia", "Aaron", "Christina", "Josh"} };
        //                      0         1          0          3           4
        System.out.println(Arrays.toString(groups[1])); //{"Breanna", "Victoria", "Daniel"}


        //Natalia
        System.out.println((groups[2][0]));
        //[[Ahmed, Jimmy], [Breanna, Victoria, Daniel], [Natalia, Aaron, Christina, Josh]]
        System.out.println(Arrays.deepToString(groups));
    }
}

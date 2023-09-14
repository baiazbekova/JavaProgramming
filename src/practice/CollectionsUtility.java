package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,80,40,50,60,90,200, 50, 50));
        System.out.println(numbers); //[100, 80, 40, 50, 60, 90, 200]

        Collections.sort(numbers);
        System.out.println(numbers); //[40, 50, 60, 80, 90, 100, 200]

        Integer max = Collections.max(numbers);
        System.out.println(max); //200

        Integer min = Collections.min(numbers);
        System.out.println(min);//40

        Collections.reverse(numbers);
        System.out.println(numbers); //[200, 100, 90, 80, 60, 50, 40]

        Collections.swap(numbers, 1, 4);
        System.out.println(numbers); //[200, 60, 90, 80, 100, 50, 40]

        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println(numbers); //[40, 60, 90, 80, 100, 50, 200]

        Integer frequency = Collections.frequency(numbers, 50);
        System.out.println(frequency); //3



    }
}

package practice;
import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysUtility {

    public static void main(String[] args) {

        //toString(): converts array object to string, returns String
        String[] names =  {"Aigerim", "Mederbek", "Bermet", "Saniya"};
        System.out.println(Arrays.toString(names)); //[Aigerim, Mederbek, Bermet, Saniya]

        //sort(): sorts the array in ascending order
        int[] numbers = {1,2,3,8,10,5,6};
        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 8, 10, 5, 6]

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 5, 6, 8, 10]

        //equal(): comprares two array objects if they have same elements in same order, returns boolean
        char[] arr1 = {'a','b','c'};
        char[] arr2 = {'a','c','b'};

        System.out.println(arr1 == arr2); //false
        System.out.println(Arrays.equals(arr1,arr2)); //false

        Arrays.sort(arr1); //{'a','b','c'}
        Arrays.sort(arr2);  //{'a','b','c'}


        //copyOf(array, newLength): copies the specified array elements and sets new length, returns new array
        int[] scores = {45,55,65,75,85};
        int[] scores2 = Arrays.copyOf(scores, 8);
        System.out.println(Arrays.toString(scores2)); //[45, 55, 65, 75, 85, 0, 0, 0]

        int[] scores3 = Arrays.copyOf(scores, 3);
        System.out.println(Arrays.toString(scores3)); //[45, 55, 65]

        //copyOfRange
        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
        //index:            0    1    2    3     4     5

        char[] elements1 = Arrays.copyOfRange(elements, 2, 4);
        System.out.println(Arrays.toString(elements1)); //[C, D]








    }
}

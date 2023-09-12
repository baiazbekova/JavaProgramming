package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Apples");
        groceryList.add("Yogurt");
        groceryList.add("Salt");
        groceryList.add("Pepper");
        groceryList.add("Grapes");

        //contains(element)
        boolean r1= groceryList.contains("Banana");
        System.out.println(r1); //true
        System.out.println("---------------------");

        //equals(list)

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Apples");
        list2.add("Yogurt");
        list2.add("Salt");
        list2.add("Pepper");
        list2.add("Grapes");
        boolean r2= list2.equals(groceryList);
        System.out.println(r2); //true
        System.out.println("---------------------");


        //isEmpty()
        boolean r5 = list2.isEmpty();
        System.out.println(r5);


        //containsAll(Collection Type)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Arrays.asList(10,20,30,40,50);
        boolean r6 = numbers.containsAll(Arrays.asList(10,20,30,40,50));
        System.out.println(r6);

        //addAll(CollectionType)
        numbers.addAll(Arrays.asList(60,70,80,90,100));
        System.out.println(numbers);

        //removeAll(CollectionType)
        numbers.removeAll(Arrays.asList(60,80,90));
        System.out.println(numbers);

        //retainAll(CollectionType)
        numbers.retainAll(Arrays.asList(10,20,30));
        System.out.println(numbers);
    }
}

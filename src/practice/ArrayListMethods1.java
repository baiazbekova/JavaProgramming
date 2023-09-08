package practice;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        ArrayList<String> groceryList = new ArrayList<>();

        //add()
        groceryList.add("Banana");
        groceryList.add("Apples");
        groceryList.add("Grapes");
        groceryList.add("Rice");
        groceryList.add("Mandarins");

        System.out.println(groceryList);

        System.out.println("---------------------");

        //size()
        int a = groceryList.size();
        System.out.println(a); //5

        System.out.println("----------------------");

        //get()
        System.out.println(groceryList.get(1)); //Apples

        System.out.println("----------------------");


        //set()
        groceryList.set(2, "Egg");
        System.out.println(groceryList.get(2)); //Egg

        //remove(index)
        groceryList.remove(3);
        System.out.println(groceryList); //[Banana, Apples, Egg, Mandarins]
        System.out.println("----------------------");

        //remove(obj)
        boolean r1 = groceryList.remove("Egg");
        System.out.println(groceryList); //[Banana, Apples, Mandarins]
        System.out.println(r1); //true
        System.out.println("----------------------");

        //clear()
        groceryList.clear();
        System.out.println(groceryList);//[]
        System.out.println("----------------------");

        //indexOf(element)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);

        int b = numbers.indexOf(20);
        System.out.println(b); //1
        System.out.println("----------------------");


        //lastIndexOf(element)
        int c=  numbers.lastIndexOf(30);
        System.out.println(c); //5



    }
}

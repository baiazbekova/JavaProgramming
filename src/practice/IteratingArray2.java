package practice;

public class IteratingArray2 {

    public static void main(String[] args) {

        String[] fruits = {"Orange", "Banana", "Apples", "Kiwi", "Peaches"};
        //indexes             0         1          2        3         4

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]); //Orange,Banana,Apples,Kiwi,Peaches
        }
        System.out.println("--------------------");
        for(int i= fruits.length-1; i>=0; i--){
            System.out.println(fruits[i]); //Peaches,Kiwi,Apples, Banana, Orange
        }
    }
}

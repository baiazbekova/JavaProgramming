package practice;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int each:numbers){
            System.out.println(each);
        }

        String[] fruits = {"Orange", "Banana", "Apples"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

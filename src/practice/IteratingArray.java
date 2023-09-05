package practice;

public class IteratingArray {

    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50};
        //indexes:       0  1   2  3  4

        for(int i=0; i<=numbers.length-1; i++){
            System.out.println(numbers[i]); //10,20,30,40,50
        }
        System.out.println("-----------------------");

        for(int i=numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]); //50,40,30,20,10
        }
    }
}

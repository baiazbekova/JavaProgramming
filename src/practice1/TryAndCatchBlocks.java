package practice1;

public class TryAndCatchBlocks {
    public static void main(String[] args) {


        try{
            System.out.println(9/0);
            System.out.println("Try block");
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(  e.getMessage()); /// by zero
            System.out.println("Catch block");

        }finally{
            System.out.println("Finally block");
        }

        System.out.println("Hello");
    }


}

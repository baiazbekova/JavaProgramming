package abstractMethods;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        Integer[] arr = {10,20,30};

        //System.out.println(arr[20]); //unchecked

        //System.out.println("Java".charAt(-1));


        String str = null;
        System.out.println(str.toUpperCase()); //.NullPointerException



    //checked
        //Thread.sleep(500);

        FileInputStream file = new FileInputStream("path file")

    }
}

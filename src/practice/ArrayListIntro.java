package practice;
import java.util.ArrayList;


public class ArrayListIntro {

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(10);
       list.add(10);
       list.add(10);

        System.out.println(list);//[10, 10, 10]
        System.out.println(list.size()); //3

    }
}

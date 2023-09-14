package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));

        //removeIf(Predicate)
        list.removeIf(each -> each < 5);
        System.out.println(list);


        System.out.println("--------------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("java", "javascript", "python", "csharp"));

        names.removeIf(p-> p.startsWith("j"));
        System.out.println(names); //[python, csharp]


    }
}

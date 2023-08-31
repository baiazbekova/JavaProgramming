package practice;

public class GarbageCollection {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        str = null; //eligible for garbage collection

        System.out.println("--------------------");

        String word = "python";
        word =  "java";
        System.out.println(word);

    }

}

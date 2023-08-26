package practice;

public class StringMethods_Part3 {

    public static void main(String[] args) {

        //isEmpty()
        String str = "   ";
        boolean r1 = str.isEmpty();
        System.out.println(r1); //false

        //isBlank()
        String str1 = "   ";
        boolean r2 = str1.isBlank();
        System.out.println(r2); //true

        //equals()
        String s1 = "Java";
        String s2 = new String ("Java");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        //equalsIgnoreCase(String)
        String word1 = "JAVA";
        String word2 = "java";

        System.out.println(word1.equals(word2));//false
        System.out.println(word1.equalsIgnoreCase(word2));//true

        //contains()
        String sentence = "I love Java programming language";
        boolean hasCSharp = sentence.contains ("C#");
        System.out.println(hasCSharp);//false

        //startsWith()
        String sentence1 = "Wooden Spoon";
        boolean result1 = sentence1.startsWith("Wood");
        System.out.println(result1); //true


        //endsWith()
        String sentence2 = "Wooden Spoon";
        boolean result2 = sentence2.endsWith("Spoon");
        System.out.println(result2); //true
    }
}

package practice;

public class StringMethods_Part2 {

    public static void main(String[] args) {
            //replace()
            String str1 = "Wooden Spoon";
            str1 = str1.replace("o", "e");
            System.out.println(str1);

            String sentence1 = "I love Java, Java is the best language";
            sentence1 = sentence1.replace("Java", "C#");
            System.out.println(sentence1);

            //replaceFirst()
            String sentence2 = "I love Kyrgyzstan, Kyrgyzstan is a great place to live";
            //sentence2=sentence2.replaceFirst("o", "i");
            sentence2=sentence2.replaceFirst("Kyrgyzstan", "USA");
            System.out.println(sentence2);

            //subString()
            String str2 = "Java Programming Language";
            String result2 = str2.substring(str2.indexOf("P"));
            //System.out.println(result2);

            result2 = str2.substring(5,16);
            System.out.println(result2);

            String s1 = "I love Java";
            s1=s1.substring(2,6);
            System.out.println(s1);


            //repeat()
            String s2 = "Aigerim";
            s2=s2.repeat(4);
            System.out.println(s2);




    }
}

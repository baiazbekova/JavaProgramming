package practice1;

public class MissingCharacter {


    public static char[] findMissingCharacter(String str1, String str2){

        //convert strings to character array
        char [] charArray1=str1.toCharArray();
        char [] charArray2=str2.toCharArray();

        for (int i=0; i<=charArray1.length; i++){
            if (charArray1[i] == charArray2[i]){
                return charArray1;
            }
        }


        return charArray1;
    }
}

package practice;

public class StaticDemo {

    static String n1 = examName ("0");//static variable declaration

    {
        examName ("A");  //instance block
    }
    static {
        examName ("C"); //static block
    }

    public static String examName (String str){
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
    }

}

//static variable declaration
//static blocks//instance variable declaration
//instance blocks
//constructor

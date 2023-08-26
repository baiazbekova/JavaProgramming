package practice;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        double number = 0.8;

        if(number>0){
            System.out.println("positive");
        }else if (number <0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

        int score = 75;
        char grade; //a,b,c,d

        if(score>85){
            System.out.println(grade = 'A');
        }else if (score<=85 && score>=80){
            System.out.println(grade = 'B');
        }else if (score<80 && score>=50){
            System.out.println(grade = 'C');
        }else {
            System.out.println(grade = 'D');
        }

        int score5 = 170;

        //1 to check if the score is valid
        //2 to check if the score is pass or fail

        if (score5>=0 && score5<=100){
            if(score>=60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{
            System.out.println("score is invalid");
        }




    }





}



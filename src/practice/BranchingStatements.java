package practice;

public class BranchingStatements {

    public static void main(String[] args) {


        //Break statement

        for (char i ='A'; i<= 'E'; i++) {
            System.out.println(i); //A B C D E

            if (i == 'C') {
                break; //A B C

            }
        }
            System.out.println( "----------------------");

            for (int i =1; i<=5; i++){
                System.out.println(i); // 1 2 3
                if (i == 3){
                    break;
                }
            }

        System.out.println("----------------------");

            for (char i = 'A'; i<= 'E'; i++){
                if (i == 'C'){
                   continue;
                }
                System.out.println(i); //A B D E
            }

    }
}

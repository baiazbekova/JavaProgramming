package practice;

public class SwitchStatement {

    public static void main(String[] args) {

        int number = 3;

        //print the name of the day

        switch (number){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number"); //since it is at the end, I dont need to give break statement

        }
    }
}

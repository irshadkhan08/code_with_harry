package conditionalsJava4;
import java.util.Scanner;

public class Irk_18_Elseif {
    public static void main(String[] args) {
        //In hence switch case
        int age;
       // System.out.println("Enter Your Age ");
       // Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        switch (age) {
//            case 18 -> System.out.println("You are going to become an adult");
//            case 21 -> System.out.println("you are going to get a job");
//            case 60 -> System.out.println("you are going to get retired");
//            default -> System.out.println("Enjoy your life!");
//        }
//        System.out.println("Thanks for using my java code");

//        String var = "monika";
//        switch(var)
//        {
//            case "monika"->{
//                System.out.println("you are monika");
//                System.out.println("monika is genius in the world!!!");
//                System.out.println("monika is my sister");
//            }
//            case "irshad" -> System.out.println("i am irshad!!!");
//            case "sakir" -> System.out.println("you are sakir !!!");
//            case "anil" -> System.out.println("you are anil");
//            default -> System.out.println("Enjoy your life");
//        }
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Today is Monday ");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Today is enjoy with his friend");
                break;
        }
//        System.out.println("Thanks using my java code!");
//        int age = 18;
//        if(age>56)
//        {
//            System.out.println("you are experienced!");
//        }
//        else if(age>46)
//        {
//            System.out.println("you are semi-experienced!");
//        }
//        else if(age>36) {
//            System.out.println("you are semi-semi-experienced!");
//        }
//        else{
//            System.out.println("You are not experienced ");
//        }


    }
}

package basicJavaString3;

public class Irk_15_ps3 {
    public static void main(String[] args) {

        //problem1
//        String name = "Irshad khan";
//        name = name.toLowerCase();
//        System.out.println(name);

        //problem2
//        String text = "i am irshad khan";
//        text = text.replace(" ","_");
//        System.out.println(text);

        //problem3
//        String letter = "Dear <|name|>, Thanks a lot";
//        letter  = letter.replace("<|name|>","irshad");
//        System.out.println(letter);
//        System.out.println(letter.replace("<|name|>","irshad"));

        //problem4
        String myString = "This string contains  double and triple        spaces";
        System.out.println(myString.indexOf("  "));//20
        System.out.println(myString.indexOf("   "));//39
        System.out.println(myString.indexOf("   ")); //triple not present in my string will be return -1

        //problem5
        String letter = "Dear Irshad, \n\tThis java course is nice.\n\tThanks!";
        String letter1 = "Dear Irshad, \tThis java course is nice.\tThanks!";
       // System.out.println(letter);
        System.out.println(letter1);
    }
}

package Lesson;

public class Factorial {
  //this method should return all integers below "n"
  //this method finds the factorial.
  //n can be any valid input

    public static String fact(int n){
     //this if statement is our end condition
        if(n==1) {
            return "1";
        }
     //this is our recursive call to the fact() method
    return n+"*"+(fact( n-1));
    }
}

package Lesson;

public class Overload {

//method overloading is referred to as a situation when a class
    //has two or methods by the same name but different parameters
    public String testOverload(String s){
        return s;
    }
    public String testOverload(String s,String x){
        return s+x;
    }
    public int testOverload(int x){
        return x;
    }
    //type casting is changing one type to another
    public int testOverload(char x){
        return x;
    }
}

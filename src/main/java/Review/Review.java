package Review;

import java.util.ArrayList;
import java.util.List;

public class Review {
    /* This is our Java review */
   //Encapsulation is the mechanism of wrapping data and code acting on the data together as a single unit.Constructor
    //creatioon is an example of encapsumlation
   //Abstraction is hiding the implementation details fromm the user.
   //Inheritance is the mechanism in which one object inherits properties of a parent object.
   //polymorphism is a process in which we can perform the same action in different ways.method overloading is an example
   //of polymorphism.

   //there are 2 major data tyoes, primitives and non primitives
    //primitive types are
    //boolean,char,byte,short,int,long,float,double
    //major difference amongst them is the byte value.
//non primitives include
    //Arrays,Classes,Interfaces.

   //Our main method, or entrypoint is considered a THREAD
   //a THREAD is considered a "thread of execution"
    //"thread of execution is the smallest sequence of programmed instructions
   public static void main(String[] args) {
  // statements are instructions that tell the language what to do
   //almost every statement needs to have its type declared
       //you need to be explicit with the typing
       //an expression is a construct made up of code and operators and method invocation
       // x in this statement would be considered a variable
       //a variable is a piece of memory that contain a data value
       int x=3+1;
//the four major variable types are as follows
 //instance variables(non static fields) have values unique to each instance
 //class variables(static fields) are unique to the class and exist in only one state.omounof ++
 //local variables are values specific to a method's temporary state
 //parameters are values that you can pass to a method
       //there are multiple ways to declare an array
  int[] intArray = new int[3];
  int otherArray[] = {1,2,3,4,5};
       int[] lastArray = new int[]{1,2,3};
    //ArrayLists are all pretty much declared the same way
    //Note the generic typing
    ArrayList<Integer> arrayList = new ArrayList();
    //Note that ArrayLists can be declared with the interface List
    List<Integer> otherList = new ArrayList(); //example of polymorphism
//all programmimg lanuguages will be compiled execute the whole program
       //interprets one line at a time
   //    Model is where the data attributes are stored.
   //    Controller is where mapping is done
    //   service has the business login
     //  view is where we can store objects.
       Dog dog = new Dog(4, "Purple");
       Dog newDog = new Dog(4, "Brown");

       System.out.println(newDog);
   }
}

package Lesson;

public class Lesson {
   /*Java Methods */
    //methods can be described as functions tied to classes
    //you'll see it in reference to functions tied to object
    //methods can be referred to as a collection of statements that re grouped together to open
    //methods can be referred to by name.
    //In Java , all methods have names
    //overall everything in Java is a method.
    public String returnString(){
        return "This is inside of a method as well!";
    }
    //public static is the modifier
    //"public" is an access miodifier
    //private code cannot be accessed
    //"package-private" can only be acccssed by package local code
    //"static" is a non-access modifier
    //int would be your return type
    //if you're not returning anthing you would specify the retuen type of void

   //overall evreything in Java that is a function is technically a method
    //"returnInt" would be the method name
    //"()" would be your pararmeters
    //you pass in arguments inside your parameters(or as parameters)

    //thre name of the method and its parameters are referred to as its signatures.
    public static int returnInt(){
       //method body
    //this is where the method specific code will live
    //most method implementations will need statements in their bodies
        return 23;
    }
   public static int adder(int a,int b){
       //note that our parameters can be referred to in our method body
       //you don't need to utilize parameters that have been defined.
       //note that a return statement is the value that the method give back
       //think of it as your output
        return a+b;
   }
    //main is a method
    //but since it is our entry point ,you may hear it referred by other names
//
    public static void main(String[] args) {
     //sout is also technically a method
        System.out.println("This is inside a method");
        //take note that you can construct Lesson Object inside of the Lesson Class
        Lesson lesson = new Lesson();
     //you will then be able to call the main method but this behavior may be undefined
     //lesson.main(strings)
       //you can call methods insiode of a static content
       //you just need to construct the object first
        System.out.println(lesson.returnString());
        System.out.println(returnInt());
        //constructing an object with a static variable
        Dog myDog = new Dog("Rover",2);
        Dog otherDog = new Dog("Rover",2);
        Dog yetAnotherDog = new Dog("Rover",2);
//note that the value of amountOfDogs changes according to how many dogs constructed
        //this is because stattic variable that increments in Dog constructor
        System.out.println("amout of dogs"+myDog.amountOfDogs);
//whenever you utilize/method tht is aclled clling meythos
        //you sn also say you pass args into paprmets

        System.out.println(adder(4,7));
        for(int i=0;i<args.length;i++){
        System.out.println(args);
   }

}
}

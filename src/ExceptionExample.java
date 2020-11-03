/**
 * Illustrate the nature of Exception objects
 */
public class ExceptionExample {

    public static void main(String[ ] args) {
        Exception whatHappened = methodA();
        if(whatHappened != null){
            System.out.println("Something went wrong!");
            System.out.println("The message was: "+whatHappened.getMessage());
            System.out.println("Where it happened:");
            whatHappened.printStackTrace();
            System.out.println("toString test:");
            System.out.println(whatHappened);
        }
        else
            System.out.println("Everything went well!");

        System.out.println("Continuing to run anyway...");
    }//main

    public static Exception methodA(){
        Exception result = methodB();
        return result;
    }//methodA

    public static Exception methodB(){
        Exception e = new Exception("Oops! I goofed.");
        return e; //An error happened.
        // return null; //No error happened.
    }//methodB

}//ExceptionExample


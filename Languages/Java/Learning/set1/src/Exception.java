/*
All exceptions and errors are subclasses of class Throwable, which is the base class of hierarchy.

Throwable has 2 subclasses : Exception and Error

1.Exception is for exceptional conditions that a user's programs should catch, i.e NullPointerException
2.Error is used by the Java run-time system (JVM) to indicate errors having to do with run-time environment (JRE),
  i.e. StackOverFlow-Error


 */

public class Exception {

    public static void main(String[] args) {

        // Simple Exception handling
        int a = 12, b = 0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The Division execution ends here");
        }

        // a try-catch clause can have multiple clauses.

        ageValidation(19); // No exception is thrown, simply the message
        ageValidation(16);
    }

    // With the throw keyword

    static void ageValidation(int age){
        if (age<18){
            throw new ArithmeticException("Access Denied! You are under age.");
        }else {
            System.out.println("Access Granted! ");
        }
    }
}

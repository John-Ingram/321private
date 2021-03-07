/**
 * John Ingram, CS321, March 7 2021
 * All test cases for the Greeter Class
 * 
 * *Note: I know that there is not really much of a point to using javadoc style comments here.
 *        I just personally like the style and consistency.
 */
import java.util.Scanner;

public class GreeterTester 
{
    /**
     * Sets up and runs the test cases found in this class
     * @param args unused
     */
    public static void main(String[] args) 
    {
        Greeter worldGreeter = new Greeter("World");
        Greeter spaceGreeter = new Greeter("Space");
        Scanner inScanner = new Scanner(System.in);
        
        //Tests:
        System.out.println(testSayHello(worldGreeter));
        System.out.println(testSwapNames(worldGreeter, spaceGreeter));
        System.out.println(testSetName("BillyBob", spaceGreeter));
        System.out.println(testGetRandomInstance(15));

        //Say the user's name
        System.out.print("What is your name? ");
        String name = inScanner.nextLine();
        Greeter userGreeter = new Greeter(name);
        System.out.println(userGreeter.sayHello());
        inScanner.close();

        //Two references to one object
        Greeter confusingGreeter = new Greeter("foo");
        Greeter referenceGreeter = confusingGreeter;
        confusingGreeter.setName("bar");
        System.out.println(referenceGreeter.sayHello());

        //Null Greeter
        Greeter nullGreeter = new Greeter(null);
        System.out.println(nullGreeter.sayHello());
        /*
         * This code prints "Hello, null!"
         * because the implicit conversion of a null value into a string simply
         * returns the string "null" 
         * 
         * I am not sure what number or file name is refferenced in the assignment
         */
    }  
    
    /**
     * Creates the test output for Greeter.sayHello()
     * @param greeter the greeter who's sayHello function will be tested
     * @return the output of the greeter parameter's sayHello function
     */
    private static String testSayHello(Greeter greeter)
    {
        return greeter.sayHello();
    }

    /**
     * Creates the test output for Greeter.setName()
     * @param newName the new name for the greeter
     * @param greeter the greetes who's name will be changed
     * @return A string illustrating that the name of the greeter has been changed
     */
    private static String testSetName(String newName, Greeter greeter)
    {
        String output  = "Saying hello to the greeter: \n" + greeter.sayHello();
               output += "Setting " + newName + " as the newName";
        greeter.setName(newName);
               output += "Saying hello to the greeter: \n" + greeter.sayHello();
        return output;
    }

    /**
     * Creates the test output for Greeter.getRandomInstance()
     * @param iterations How many times the function will be called
     * @return A string illustrating the random instances of greeter
     */
    private static String testGetRandomInstance(int iterations)
    {
        String output = "";
        for (int i = 0; i < iterations; i++) 
        {
            output += "Saying hello to the random greeter: " 
                      + Greeter.getRandomInstance().sayHello() + "\n";
        }
        return output;
    }
    /**
     * Creates the test output for Greeter.swapNames(greeter)
     * @param greeterA The greeter that will have it's name swapped with greeterB
     * @param greeterB The greeter that will have it's name swapped with greeterA
     * @return A string illustrating the swapping of the names for greeterA and greeterB
     */
    private static String testSwapNames(Greeter greeterA, Greeter greeterB)
    {
        String output  = "Saying hello to greeter A: \n" + greeterA.sayHello() + "\n";
               output += "Saying hello to greeter B: \n" + greeterB.sayHello() + "\n";
               output += "Swapping the names of greeter A and B \n";
        greeterA.swapNames(greeterB);
               output += "Saying hello to greeter A: \n" + greeterA.sayHello() + "\n";
               output += "Saying hello to greeter B: \n" + greeterB.sayHello() + "\n"; 
        return output;
    }

}

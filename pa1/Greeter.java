import java.util.Random;

/**
 * John Ingram, CS321, March 7 2021
 * A class for producing simple greetings
 * 
 */
public class Greeter 
{
    /**
     * Constructs a Greeter object that can greet a person or entity.
     * @param aName the name of the person or entity who should 
     * be adressed in the greetings.
     */
    public Greeter(String aName)
    {
        name = aName;
    }
    /**
     * Greet with a "Hello" message. 
     * @return a message containing "Hello" and the name of
     * the greeted person or entity.
     */
    public String sayHello()
    {
        return "Hello, " + name + "!";
    }
    /**
     * Sets this greeter's name to the given name.
     * @param name the new name for this greeter
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Swap the names of this greeter with the name of another greeter
     * @param other the greeter that this greeter will swap names with
     */
    public void swapNames(Greeter other)
    {
        String tempName;
        tempName = this.name;
        this.name = other.name;
        other.name = tempName;
    }
    /**
     * Returns a single greeter object randomly selcted from two 
     * premade greeter objects.
     * @return A single randomly selected greeter object
     */
    public static Greeter getRandomInstance()
    {
        if (generator.nextBoolean())
            return venus;
        else
            return mars;
    }
    private String name;
    private static Random generator = new Random();
    private static Greeter venus = new Greeter("Venus");
    private static Greeter mars = new Greeter("Mars");
}

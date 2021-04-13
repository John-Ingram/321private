package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The self guided Tour class.
 * This class creates a basic self guided tour.
 */
public class GuidedTour implements Tour
{
    private String description;
    private int cost, minutes;

    public GuidedTour()
    {
        this.description = "A guided tour of the mansion";
        this.cost = 80;
        this.minutes = 90;
    }
    /**
     * Get a description of the tour.
     * @return A description of the tour
     */
    @Override public String getDescription()
    {
        return this.description;
    }

    /**
     * Get the cost for this Tour.
     * @return The cost for this Tour
     */
    @Override public int getCost()
    {
        return this.cost;
    }

    /**
     * Get the minimum time this tour will take.
     * @return The minimum time this tour will take
     */
    @Override public int getMinTimeInMinutes()
    {
        return this.minutes;
    }
    
    /**
     * Overrides the default toString() behaviour.
     * @return The attributes of the Current Tour
     */
    @Override public String toString()
    {
        return getDescription() + ".\nCost: $" + getCost() + 
        "\nMinimum time required to finish this tour: " + getMinTimeInMinutes() + " minutes.";
    } 
}


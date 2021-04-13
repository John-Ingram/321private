package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The base class for all extras
 */
public abstract class Extra implements Tour{

    /**
     * A description of this part of the Tour.
     */ 
    private String description;

    /**
     * The cost of this part of the tour, 
     * and the time it would take to complete it.
     */
    private int cost, minutes;

    /** 
     * The Tour that this part of the 
     * Tour is being added on to.
     */
    private Tour baseTour;

    protected Extra(Tour baseTour, String description, int cost, int minutes)
    {
        this.baseTour = baseTour;
        this.description = description;
        this.cost = cost;
        this.minutes = minutes;
    }
    /**
     * Get a full description of the tour.
     * @return A description of the tour
     */
    @Override public String getDescription()
    {
        return baseTour.getDescription() + this.description;
    }

    /**
     * Get the total cost for this Tour.
     * @return The cost for this Tour
     */
    @Override public int getCost()
    {
        return baseTour.getCost() + this.cost;
    }

    /**
     * Get the minimum time this entire tour will take.
     * @return The minimum time this tour will take
     */
    @Override public int getMinTimeInMinutes()
    {
        return baseTour.getMinTimeInMinutes() + this.minutes;
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


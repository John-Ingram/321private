package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The Tour interface.
 */
public interface Tour {
    
    /**
     * Get a description of the tour.
     * @return A description of the tour
     */
    public String getDescription();

    /**
     * Get the cost for this Tour.
     * @return The cost for this Tour
     */
    public int getCost();

    /**
     * Get the minimum time this tour will take.
     * @return The minimum time this tour will take
     */
    public int getMinTimeInMinutes();
    
    /**
     * Overrides the default toString() behaviour.
     * @return The attributes of the Current Tour
     */
    public String toString();
}

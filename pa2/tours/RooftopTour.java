package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The Rooftop Tour class.
 * Adds a Rooftop Tour to a Tour
 */
public class RooftopTour extends Extra{

    /**
     * Creates an extra that is a RooftopTour
     */
    public RooftopTour(Tour baseTour)
    {
        //    baseTour, -----------description--------- , price, time
        super(baseTour, ", a tour of rooftops and balconies", 25, 60);
    }
    
}


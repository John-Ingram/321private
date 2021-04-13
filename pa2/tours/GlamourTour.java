package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The Glamour Tour class.
 * Adds a Glamour Tour to a Tour
 */
public class GlamourTour extends Extra{

    /**
     * Creates an extra that is a GlamourTour
     */
    public GlamourTour(Tour baseTour)
    {
        //    baseTour, -----------description-------------- , price, time
        super(baseTour, ", a tour of glamourous period costumes", 45, 90);
    }
    
}


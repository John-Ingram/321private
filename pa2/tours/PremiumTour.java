package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The Premium Tour class.
 * Adds a Premium Tour to a Tour
 */
public class PremiumTour extends Extra{

    /**
     * Creates an extra that is a PremiumTour
     */
    public PremiumTour(Tour baseTour)
    {
        //    baseTour, ------------------description------------------- , price, time
        super(baseTour, ", a premium tour that includes many extra areas", 25, 60);
    }
    
}


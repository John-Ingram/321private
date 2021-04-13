package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The Estate Tour class.
 * Adds an Estate Tour to a Tour
 */
public class EstateTour extends Extra{

    /**
     * Creates an extra that is an EstateTour
     */
    public EstateTour(Tour baseTour)
    {
        //    baseTour, -----------description--------- , price, time
        super(baseTour, ", a trolley tour of the estate grounds", 20, 60);
    }
    
}



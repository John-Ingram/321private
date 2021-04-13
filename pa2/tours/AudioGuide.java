package tours;
/**
 * John Ingram, CS321, April 11 2021
 * The audio guide class.
 * Adds an audio guide to a Tour
 */
public class AudioGuide extends Extra{

    /**
     * Creates an extra that is an AudioGuide
     */
    public AudioGuide(Tour baseTour)
    {
        //    baseTour, -----------description------------- , price, time
        super(baseTour, ", an audio guide by curators and hosts", 10, 0);
    }
    
}

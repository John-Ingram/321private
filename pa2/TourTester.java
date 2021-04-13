import tours.*;
/**
 * John Ingram, CS321, April 11 2021
 * A class to test the Tour package system
 */
public class TourTester {
    
    public static void main(String[] args) {
        Tour packOne = new AudioGuide( new EstateTour( new SelfGuidedTour()));
        Tour packTwo = new RooftopTour( new GlamourTour( new GuidedTour()));
        Tour packThree = new EstateTour( new PremiumTour( new GuidedTour()));

        System.out.println("Tour package one: \n" + packOne + "\n\n");
        System.out.println("Tour package two: \n" + packTwo + "\n\n");
        System.out.println("Tour package three: \n" + packThree + "\n\n");
    }
}

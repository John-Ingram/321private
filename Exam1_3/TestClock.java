// All tests for the Clock class
package Exam1_3;

import Exam1_3.Clock.AmPm;

public class TestClock {
    public static void main(String[] args) {
        Clock defaultClock = new Clock();
        System.out.println(defaultClock.getTime());

        Clock lateClock = new Clock();
        lateClock.setAm_pm(AmPm.PM);
        lateClock.setHours(11);
        lateClock.setMinutes(57);
        System.out.println(lateClock.getTime());

        Clock earlyClock = new Clock();
        earlyClock.setAm_pm(AmPm.AM);
        earlyClock.setHours(8);
        earlyClock.setMinutes(15);
        System.out.println(earlyClock.getTime());

        
    }
}

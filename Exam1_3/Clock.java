package Exam1_3;


public class Clock {
    private int hours, minutes;
    private AmPm am_pm;
    public enum AmPm{
        AM(1),
        PM(2);

        private final int value;

        AmPm(int value){
            this.value = value;
        }
    }

    Clock(){
        this.am_pm = AmPm.AM;
        this.hours = 6;
        this.minutes = 0;
    }

    //getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getAm_pm() {
       if(this.am_pm == AmPm.AM) return "a.m";
       else return "p.m.";
    }

    public String getTime(){
        String output = String.format("%02d:%02d ", hours, minutes);
        return output + getAm_pm();
    }

    //Setters
    public void setHours(int hours) {
        if(hours <= 12 && hours >= 1) this.hours = hours;
        else throw new IllegalArgumentException("Must be a value between 1 and 12");
    }

    public void setMinutes(int minutes) {
        if(minutes <= 59 && minutes >= 0) this.minutes = minutes;
        else throw new IllegalArgumentException("Must be a value between 0 and 59");
    }

    public void setAm_pm(AmPm am_pm) {
        this.am_pm = am_pm;
    }
    
}

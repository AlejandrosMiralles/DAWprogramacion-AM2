package Java;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int secondsLimit = 359999;
        if (seconds > secondsLimit){ return null;}

        int secondsTime, minutesTime, hoursTime;
        
        secondsTime = seconds % 60;
        minutesTime = (seconds / 60) % 60;
        hoursTime = seconds / 3600;

        return String.format("%2d:%2d:%2d", hoursTime, minutesTime, secondsTime).replaceAll(" ", "0") ;
    }


    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }

}

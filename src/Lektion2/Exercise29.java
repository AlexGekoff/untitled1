package Lektion2;

import static java.lang.Integer.parseInt;

public class Exercise29 {
    public static void main(String[] args) {
/*
     Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
     följande:
     tidpunkt i timma och minut för avgången (t ex 12 41)
     körtid i timma och minut (t ex 3 47)
     I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt passeras ska det
     även skrivas “NÄSTA DAG“ i utmatningsrutan.
 */
        String departureTime = "12 41";
        String runTime = "3 47";


    }

    static int hoursFromString(String timeString){
        String hours = timeString.substring(timeString.length() -2, timeString.length());
        hours = hours.trim();
        return parseInt(hours);
    }
}

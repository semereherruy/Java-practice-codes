import java.util.*;
public class DisplayCT {
    public static void main(String args[]){
        System.out.println(System.currentTimeMillis());

        long totalMilliSec = System.currentTimeMillis();
        long total_sec = totalMilliSec / 1000;  // 'cuz 1 sec = 100 ms
        long current_sec = total_sec % 60;
        long total_min = total_sec / 60;
        long current_min = total_min % 60;
        long total_hour = total_min / 60;
        long current_hour = total_hour % 24;
        System.out.println("Current time is:" + current_hour + ":" + current_min + ":" + current_sec);
    }
}

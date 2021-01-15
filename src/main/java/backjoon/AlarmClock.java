package backjoon;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int mins = sc.nextInt();

        if(mins>=45)
            mins-=45;
        else{
            if(hour==0)
                hour=23;
            else
                hour-=1;
            int need = 45-mins;
            mins = 60-need;
        }
        System.out.println(hour+" "+mins);
    }
}
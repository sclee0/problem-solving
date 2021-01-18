package backjoon;

import java.util.Scanner;

public class AddingCycle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int before = sc.nextInt();
        int ans = before;
        int cycle = 0;
        int after=0;

        while(true){
            int a = before/10;
            int b = before%10;
            int sum = a+b;
            after = b*10+(sum%10);
            cycle++;
            if(after==ans)
                break;
            before = after;
        }
        System.out.println(cycle);
    }
}

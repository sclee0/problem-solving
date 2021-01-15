package backjoon;

import java.util.Scanner;

public class Quadrant {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int xpos = sc.nextInt();
        int ypos = sc.nextInt();

        if(xpos>0 && ypos>0)
            System.out.println("1");
        else if(xpos>0 && ypos<0)
            System.out.println("4");
        else if(xpos<0 && ypos<0)
            System.out.println("3");
        else
            System.out.println("2");
    }
}

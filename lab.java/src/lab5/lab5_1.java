package lab5;

import java.util.Scanner;

public class lab5_1 {
    public static void main(String[] args) {
        System.out.println("Choose your color: Red(R), yellow(Y), Green(G),");
        Scanner sc = new Scanner(System.in);
        String input1=sc.nextLine();
        if(input1.equals("Red")){
            System.out.println("stop");
        }
        else if(input1.equals("yellow")){
            System.out.println("ready");
        }else if(input1.equals("Green")){
            System.out.println("go");
        }else{
            System.out.println("none");
        }

    }
}

package lab1;

import java.util.Scanner;

public class lab1_4 {
    static boolean checkNumber(int n){
        if (n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(checkNumber(input)){
            System.out.println(input+" yes it is a power of two");
        }
        else{
            System.out.println(input+" no it is not a power of two");
        }
    }
}

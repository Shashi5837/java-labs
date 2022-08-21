package lab5;

import java.util.Scanner;

public class lab5_3 {
    static  boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

           
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
       if(prime(n)){
        System.out.println(n+" is a prime number");
       }else{
        System.out.println(n+" not a prime number");
       }
    }
}

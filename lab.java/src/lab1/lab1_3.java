package lab1;

import java.util.Scanner;
public class lab1_3 {

/**
 * 
 */
static boolean number(int input){
    String str=Integer.toString(input);
    char digit;
    boolean flag=true;
    for(int i=0;i<str.length()-1;i++){
        digit=str.charAt(i);
    
    if(digit>str.charAt(i+1)){
        flag=false;
    }
}

return flag;
}
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int input=sc.nextInt();
    if(number(input)||input<101){
        System.out.println(input+" is a increasing number");

    }
    else{
        System.out.println(input+"is not a increasing number");
    }
    
}
}

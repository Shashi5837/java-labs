package lab3;
import java.util.Scanner;
public class lab3_4 {
    public static void main(String[] args) {
        //input String
        CountChars.eachCharacterCount ("shashishekar");
      }
        
      public static void eachCharacterCount (String str){
        char[] stringArray;
        do{
          stringArray = str.toCharArray();
          char chr = stringArray[0];
          int count = 1;
          for(int i = 1; i < stringArray.length; i++){
            if(chr == stringArray[i]){
              count++;
            }
          }
          // remove count for space or tab
          /*if(((chr != ' ') && (chr != '\t'))){
            System.out.println(chr + " - " + count);
          }
    
          str = str.replace(""+chr, "");*/
          
          // terminate the loop 
          // if string is of length 0 
          if(str.length() == 0) {
            break;
          }
        }while(stringArray.length > 1);	
      }
}
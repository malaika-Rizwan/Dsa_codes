

package information_security;
import java.util.*;

public class Functionality {
    
    static String plaintext="abcdefghijklmnopqrstuvwxyz";
   static String   chipertext="zyxwvutsrqponmlkjihgfedcba";
  static String plainT="";
 static String chiper="";
  public void cipher(String plain){
      
      for(int i=0;i<plain.length();i++){
          char c=plain.charAt(i);
          int index=plaintext.indexOf(c);
          char c2=chipertext.charAt(index);
         chiper=chiper+c2;
  
          
      
  }
      System.out.println("plain  text   to " + chiper +"    text");
    }
  public void plain(){
      
      for(int i=0;i<chiper.length();i++){
          char c=chiper.charAt(i);
          int index=chipertext.indexOf(c);
          char c2=plaintext.charAt(index);
         plainT=plainT+c2;
  
          
      
  }
      System.out.println("chiper text   to " + plainT +"    text");
    }
  
  public static void main(String args[]){
      Functionality obj=new Functionality();
      String ptext="hello";
      obj.cipher(ptext);
      obj.plain();
     
  } 
  
  
}
    


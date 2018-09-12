/*
 This code check and print if a given String is a palindrome or not
 E.g. mum is a palindrome.
 */
package Palindrome;

/**
 *
 * @author mosh
 */
public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(palindrome("mum"));
    }
    
    public static String palindrome(String word){
        String rev="";
        int len = word.length();
        
        while(len>0){
           rev = rev + word.charAt(len-1);
           len--;
        }
        
        if (word.equals(rev)) 
            return String.format(word+ " is a palindrome");
        
        else
            return String.format(word+ " is not a palindrome");
    }
}

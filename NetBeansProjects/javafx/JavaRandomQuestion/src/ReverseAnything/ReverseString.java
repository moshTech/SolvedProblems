/*
 This code find and print the reverse of a given String
 E.g. The reverse of "abcde" is edcba.
 */
package ReverseAnything;

/**
 *
 * @author mosh
 */
public class ReverseString {
    public static void main(String...mosh) {
        System.out.println("The reverse is "+reverse("abcde"));
    }
    
    public static String reverse(String word){
        String rev="";
        int len = word.length();
        
        while(len>0){
           rev = rev + word.charAt(len-1);
           len--;
        }
        return rev;
    }
}

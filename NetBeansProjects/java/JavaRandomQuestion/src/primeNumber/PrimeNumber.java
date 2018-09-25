/*
 This code find and print the prime numbers between two numbers.
  E.g the prime numbers between 1 and 20 are: 2,3,5,7,11,13,17,19.
 */
package primeNumber;

/**
 *
 * @author mosh
 */

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("The prime numbers between 1 and 20 are\n");
        prime(1,20);
        System.out.println("");
    }
    
    public static void prime(int start, int end){
        int count = 0;
        for (int i = start; i <=end; i++) {
            count =0;
            if (i==1) //To exclude 1
                continue;
            for (int j = 2; j < i; j++) {
                if((i%j==0)){ //To check if prime or not i.e if true "i" is a prime num else is not, then increase count by 1, then terminate the loop since i cannot be a prime num again
                    count++;
                    break;
                }
            }
            if (count == 0) //For i to be prime number count must equal 0, then print i
                    System.out.print(i+ " ");
        }
    }
}

package assignment1;

import java.util.Scanner;

public class SixthProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        float f = powerOf(a,n);
        System.out.println(f);
    }
    /*
     *This method returns number a in the power of number n.
     *Time complexity: 0(n), where n is the exponent in the power
     *Complexity class:  Linear
     *@param a The number that we will multiply.
     *@param n The quantity that how namy times we will multiply.
     *@return a in the power of n. Using recursion.
     */
    public static float powerOf(int a, int n){
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            return 1 / powerOf(a, -n);
        }
        else {
            return a * powerOf(a, n - 1);
        }
    }
}

package home_work8;
/*Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum
of negative numbers. 0 is neither positive nor negative. If the input is an empty array or is null, return
an empty array.
Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].*/

import java.util.Arrays;

public class Codewars1 {
    public static void main(String[] args) {
        int[]a={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(Kata.countPositivesSumNegatives(a)));
    }
}

class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int countPositives = 0;
        int sumNegatives=0;
        for(int a:input){
            if(a>0){
              countPositives++;
            }else if(a<0){
                sumNegatives+=a;
            }
        }
        return new int[]{countPositives,sumNegatives};
    }
}
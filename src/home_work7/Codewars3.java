package home_work7;

import java.util.Arrays;

/*Triple Trouble
Create a function that will return a string that combines all of the letters of the three
inputed strings in groups. Taking the first letter of all of the inputs and grouping them
next to each other. Do this for every letter, see example below!
E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.*/
public class Codewars3 {
    public static void main(String[] args) {
        System.out.println(Kata1.tripleTrouble("aaa","bbb", "ccc"));
    }
}
class Kata1 {
    public static String tripleTrouble(String one, String two, String three) {
       char[] array=new char[one.length()*3];
       int count=0;
       for (int i=0;i<one.length();i++){
           array[count]=one.charAt(i);
           count++;
           array[count]=two.charAt(i);
           count++;
           array[count]=three.charAt(i);
           count++;
       }
       return new String(array);
    }
}
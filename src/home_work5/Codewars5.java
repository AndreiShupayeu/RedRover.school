package home_work5;

/*Given an array of integers your solution should find the smallest integer.
For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.*/
public class Codewars5 {
    public static void main(String[] args) {
        System.out.println(SmallestIntegerFinder.findSmallestInt(new int[]{4,20,8,1,5}));
    }
}

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i : args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
package home_work5;

/*Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
For example,
[true,  true,  true,  false,
true,  true,  true,  true ,
true,  false, true,  false,
true,  false, false, true ,
true,  true,  true,  true ,
false, false, true,  true]
The correct answer would be 17.
Hint: Don't forget to check for bad values like null/undefined*/
public class Codewars1 {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Counter counter=new Counter();
        System.out.println(counter.countSheeps(array1));

    }
}

class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if(arrayOfSheep ==null){
                break;
            }
            if (arrayOfSheep) {
                count++;
            }
        }
        return count;
    }
}
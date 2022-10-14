package home_work7;
/*I'm new to coding and now I want to get the sum of two arrays...
Actually the sum of all their elements. I'll appreciate for your help.
P.S. Each array includes only integer numbers. Output is a number too.*/
public class Codeqars5 {
    public static void main(String[] args) {
        System.out.println(Sum.arrayPlusArray(new int[]{1, 5, 6}, new int[]{1, 3, 7}));
    }
}
class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumArr1=arr1[0];
        int sumArr2=arr2[0];
        for (int i=1;i<arr1.length;i++){
            sumArr1+=arr1[i];
        }
        for (int i=1;i<arr2.length;i++){
            sumArr2+=arr2[i];
        }
        return sumArr1+sumArr2;
    }
}
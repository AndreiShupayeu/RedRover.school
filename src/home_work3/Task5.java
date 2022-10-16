package home_work3;
/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(sum(array));
    }

    public static int sum(int[][] array) {
        int result = 0;
        for (int[] ar : array) {
            for (int a : ar) {
                result += a;
            }
        }
        return result;
    }
}
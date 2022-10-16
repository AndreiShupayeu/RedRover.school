package home_work3;
/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(max(array));
    }

    public static int max(int[][] array) {
        int max = array[0][0];
        for (int[] ar : array) {
            for (int a : ar) {
                if (max < a)
                    max = a;
            }
        }
        return max;
    }
}

package home_work3;

/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(max(array));
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}

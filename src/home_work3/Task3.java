package home_work3;

/*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/
public class Task3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(min(array));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}

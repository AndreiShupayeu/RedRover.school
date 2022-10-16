package home_work3;
/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(average(array));
    }

    public static int average(int[] array) {
        int sum = sum(array);
        return sum / array.length;
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int a : array) {
            result += a;
        }
        return result;
    }
}

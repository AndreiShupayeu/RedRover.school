package home_work3;

/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int a : array) {
            result += a;
        }
        return result;
    }
}

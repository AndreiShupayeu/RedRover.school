package home_work5;

/*If you can't sleep, just count sheep!!
Task:
 Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.*/
public class Codewars6 {
    public static void main(String[] args) {
        System.out.println(Kata1.countingSheep(3));
    }
}

class Kata1 {
    public static String countingSheep(int num) {
        String string = "";
        for (int i = 1; i <= num; i++) {
            string = string.concat(i + " sheep...");
        }
        return string;
    }
}
/*class Kata {
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}*/
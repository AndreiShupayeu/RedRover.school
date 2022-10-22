package home_work8;

import java.util.Arrays;

/*You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has
gone and switched their heads and tails around! Save the animals by switching them back. You will
be given an array which will have three values (tail, body, head). It is your job to re-arrange the
array so that the animal is the right way round (head, body, tail). Same goes for all the other
arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics
Simples!*/
public class Codewars2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(WrongEndHead.fixTheMeerkat(new String[]{ "head", "body", "tail" })));
    }
}
class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String test=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=test;
        return arr;
    }
}
/*
class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
 */
package home_work7;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
 */
public class Codewars17 {
    public static void main(String[] args) {
        System.out.println(AbbreviateTwoWords.abbrevName("Andrei Shupaev"));
    }
}

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String first = String.valueOf(name.charAt(0)).toUpperCase();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        String second = String.valueOf(name.charAt(count + 1)).toUpperCase();
        name = first + "." + second;
        return name;
    }
}
/*
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    name = name.toUpperCase();
    return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
  }
}
 */
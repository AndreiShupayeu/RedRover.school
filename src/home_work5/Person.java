package home_work5;

import java.util.Calendar;
import java.util.Date;

class TestPerson {
    public static void main(String[] args) {
      Person men = new Person("Andrei",'M',1981);
      Person women=new Person("Anna",'F',1979);
        System.out.println("The name of this person: "+men.getName()+"\n"+"The age of this person: "+men.getAge());
        System.out.println("The name of this person: "+women.getName()+"\n"+"The age of this person: "+women.getAge());

    }
}

public class Person {
    private String name;
    private int age;
    private char sex;
    final private int yearOfBirth;

    public Person(String name, char sex, int yearOfBirth) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }
    public void setName(String name) {        this.name = name;    }
    public void setSex(char sex) {        this.sex = sex;    }
    public String getName() {
        if (sex == 'F') {
            return "Ms " + name;
        } else {
            return "Mr " + name;
        }
    }
    public char getSex() {        return sex;    }
    public int getYearOfBirth() {        return yearOfBirth;    }
    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year-yearOfBirth;
    }

}

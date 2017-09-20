package leetCode.test;

/**
 * Created by Dave on 2017/5/4.
 */
public class Student9 {
    int rollno;
    String name;
    static String COLLEGE = "ITS";

    static void change(){
        COLLEGE = "BBDIT";
    }

    Student9(int r,String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + COLLEGE);
    }

    public static void main(String[] args){
        Student9.change();

        Student9 s1 = new Student9(111,"kane");
        Student9 s2 = new Student9(222,"Dave");

        s1.display();
        s2.display();

    }

}

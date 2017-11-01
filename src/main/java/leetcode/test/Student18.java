package leetcode.test;

/**
 * Created by Dave on 2017/5/17.
 */
public class Student18 implements Cloneable {
    int rollno;
    String name;

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        try {
            Student18 s1 = new Student18(101,"yangheng");
            Student18 s2 = (Student18) s1.clone();
            System.out.println(s1.name + " " + s1.rollno);
            System.out.println(s2.name + " " + s2.rollno);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

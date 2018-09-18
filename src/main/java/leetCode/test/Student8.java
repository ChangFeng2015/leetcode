package leetCode.test;

/**
 * Created by Dave on 2017/5/4.
 */
public class Student8 {
    int rollno;
    String name;
    String college = "ITS";

    Student8(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]){
        Student8 s1 = new Student8(111,"karan");
        Student8 s2 = new Student8(222,"Aryan");

        s1.display();
        s2.display();
    }
}

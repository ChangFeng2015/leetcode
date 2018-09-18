package leetCode.langcommon;

import java.util.Iterator;

public class Students implements Iterable<Student>{

    private Student[] students;

    private int size;

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.length;
            }

            @Override
            public Student next() {
                return students[index ++];
            }
        };
    }

    public Students() {
        size = 0;
        students = new Student[]{};
    }

    public Students(int capacity) {
        size = 0;
        students = new Student[capacity];
    }


    public Student set(int index, Student student) {
        rangeCheck(index);
        Student oldValue = students[index];
        students[index] = student;
        return oldValue;
    }

    public void add(Student student) {
        rangeCheck(size);
        students[size ++] = student;
    }

    public void rangeCheck(int index) {
        if (index >= students.length) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: "+ size;
    }


}

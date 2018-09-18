package leetCode.nio;

import org.junit.Test;

import java.io.*;

;

/**
 * @author Dave
 * @create 2017-11-11 16:42
 **/

public class WriteObject {
    @Test
    public void writeObjectTest() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
            leetCode.nio.Person per = new leetCode.nio.Person("sunwukong", 500);
            objectOutputStream.writeObject(per);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readOjbect() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
            leetCode.nio.Person p = (leetCode.nio.Person) objectInputStream.readObject();
            System.out.println("name : " + p.getName() + "\n age : " + p.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

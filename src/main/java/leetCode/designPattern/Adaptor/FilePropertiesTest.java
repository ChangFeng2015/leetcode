package leetCode.designPattern.Adaptor;

import org.junit.Test;

import java.io.IOException;

public class FilePropertiesTest {

    @Test
    public void fileTest() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

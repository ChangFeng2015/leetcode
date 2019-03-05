package leetCode.io;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName FileCopy
 * @Description TODO
 * @Author Dave
 * @Date 2019/3/5 11:46
 * @Version 1.0
 **/
public class FileCopy {

    public void copy (String path, String fileName, String targetPath, String targetFileName) {
        try {
            FileInputStream fis = new FileInputStream(path + File.separator + fileName);
            //创建字节输出流
            FileOutputStream fos = new FileOutputStream(targetPath + File.separator + targetFileName);
            byte[] bytes = new byte[256];
            int hasRead = 0;
            while ((hasRead = fis.read(bytes)) > 0) {
                fos.write(bytes, 0, hasRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        copy("E:\\logs", "v3a.log", "E:\\logs", "abc.log");
    }
}

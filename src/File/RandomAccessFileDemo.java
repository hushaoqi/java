package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName RandomAccessFileDemo
 * @Description
 * @Author CheChinah
 * @Date 2018/9/27 15:10
 * @Version 1.0
 */
public class RandomAccessFileDemo {

    public static void main(String[] args)
    {
        try {
            //读取文件
            RandomAccessFile r = new RandomAccessFile("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.txt","r");
            //写入文件
            RandomAccessFile w = new RandomAccessFile("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\testW.txt","rw");

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = r.read(bytes))!= -1)
            {
                w.write(bytes,0 ,len);

            }
            w.close();
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("copy successful!");
    }
}

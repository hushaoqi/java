package NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName CopyFileDemo
 * @Description
 * @Author CheChinah
 * @Date 2018/9/28 20:50
 * @Version 1.0
 */
public class CopyFileDemo {

    private static void copyFile() throws IOException {
        //创建一个文件的通道
        FileChannel fcIn = new FileInputStream("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.txt").getChannel();
        //创建一个输出文件通道
        FileChannel fcOut = new FileOutputStream("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test3.txt").getChannel();

        ByteBuffer buf = ByteBuffer.allocate(1024);
        while (fcIn.read(buf)!= -1)
        {
            buf.flip();
            fcOut.write(buf);
            buf.clear();
        }
        fcIn.close();
        fcOut.close();
        System.out.println("copy successful");

    }
    public static void main(String[] args)
    {
        try{
            copyFile();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

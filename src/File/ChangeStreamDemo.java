package File;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @ClassName ChangeStreamDemo
 * @Description 转换流：可以将一个字节流转换为字符流，也可以将一个字符流转换为字节流
 *              OutputStreamWriter:可以将输出的字符转换为字节流的输出形式
 *              InputStreamReader：将输入的字节流转换为字符流输入形式
 * @Author CheChinah
 * @Date 2018/9/20 22:06
 * @Version 1.0
 */
public class ChangeStreamDemo {

    private static void read(InputStream in){
        Reader reader = new InputStreamReader(in, Charset.defaultCharset());
        char [] cs = new char[1024];
        int len = -1;
        try{
            while ((len = reader.read(cs))!= -1){
                System.out.println(new String(cs,0 ,len));

            }
            reader.close();
            System.out.println("write successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void write(OutputStream out){
        Writer writer = new OutputStreamWriter(out,Charset.defaultCharset());
        try {
            writer.write("到我家开开心心来玩耍！\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String [] args) throws FileNotFoundException {
        InputStream in = new FileInputStream("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        read(in);
        OutputStream out = new FileOutputStream("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        write(out);
    }

}

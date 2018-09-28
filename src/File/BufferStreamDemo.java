package File;

import java.io.*;

/**
 * @ClassName BufferStreamDemo
 * @Description 缓存的目的：解决在写入文件操作是，
 * 频繁的操作文件所带来的性能降低的问题。
 * BufferOutputStream 内部默认的缓存大小时8Kb，
 * 每次写入是存储到缓存中的byte数组中，
 * 当数组存满时，会把数组中的数据写入文件，并缓存下标归零
 *
 * 在读取的时候加入字符缓存流，增强读取功能，（readline）
 *
 * FileReader：内部使用InputStreamReader（sun.nio.cs.StreamDecoder)，解码过程，byte->char,默认缓存大小是8K
 *
 * @Author CheChinah
 * @Date 2018/9/21 21:17
 * @Version 1.0
 */
public class BufferStreamDemo {

    private static void charReader(){
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        try{
            Reader reader = new FileReader(file);
            //为字符流提供缓存，已达到高效读取的目的
            BufferedReader br = new BufferedReader(reader);
            char[] cs = new char[1024];
            int len = -1;
            while ((len=br.read(cs))!= -1){
                System.out.println(new String(cs,0,len));
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void byteReader(){
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        try {
            InputStream in = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            bis.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void byteWriter(){
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            //构造一个字节缓冲流
            BufferedOutputStream bos = new BufferedOutputStream(out);

            String info = "小河流水哗啦啦............";
            bos.write(info.getBytes());

            bos.close();
            //out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args)
    {
        byteWriter();
        byteReader();
        charReader();
    }
}

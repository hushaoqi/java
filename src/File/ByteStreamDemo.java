package File;

import java.io.*;
/**
 * @ClassName ByteStreamDemo
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/20 20:17
 * @Version 1.0
 */

public class ByteStreamDemo {

    private static void in(){
        //0、确定目标文件
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        //1、构造一个文件输入流
        try{
            InputStream in = new FileInputStream(file);
            byte[] bytes = new byte[1024 ];
            StringBuilder buf = new StringBuilder();
            int len = -1;//实际每次读取的字节长度
            while ((len = in.read(bytes))!= -1){
                //把数据读入到数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，等于-1时表示文件已经读完
                //根据读取到的字符数组，再去转化为字符串内容,添加到StringBuilder
                buf.append(new String(bytes,0,len));
            }
            //关闭输入流
            in.close();
            System.out.println(buf);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void out(){
        //0、确定目标文件
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");
        //1、构造一个文件输出流对象
        try{
            OutputStream out = new FileOutputStream(file,true);//append为TRUE表示追加内容
            //2、输出的内容
            String info = "小河流水哗啦啦！\r\n";
            //String line = System.getProperty("line.separator");//获取换行符
            //3、把内容写入文件
            out.write(info.getBytes());
            //4、关闭流
            out.close();
            System.out.println("Write success!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        out();
        in();
    }
}



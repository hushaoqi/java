package File;

import java.io.*;

/**
 * @ClassName PrintStreamDemo
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/25 10:00
 * @Version 1.0
 */
public class PrintStreamDemo {

    private static void bytePrint(){
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt");

        OutputStream out = null;
        try {
            out = new FileOutputStream(file);
            //加缓存
            BufferedOutputStream bos = new BufferedOutputStream(out);
            //增强打印输出功能
            PrintStream ps = new PrintStream(bos);
            ps.println("小河流水天天哗啦啦啦！");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args)
    {
        bytePrint();

    }
}

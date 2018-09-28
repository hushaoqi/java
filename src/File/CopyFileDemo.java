package File;

import java.io.*;

/**
 * @ClassName CopyFileDemo
 * @Description 文件的复制：从一个输入流中读取数据，然后通过输出流写入目标位置，一边读一边写
 * @Author CheChinah
 * @Date 2018/9/20 21:36
 * @Version 1.0
 */
public class CopyFileDemo {
    public static void main(String[] args){
        System.out.println("start copy....");
        copy("C:\\Users\\敲键盘的钢琴师\\Desktop\\test.txt","C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.txt");
        System.out.println("copy successful");
    }
    private static void copy(String src,String target){
        File srcFile = new File(src);
        File targetFile = new File(target);

        InputStream in = null;
        OutputStream out = null;

        try{
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len= in.read(bytes)) != -1)
            {
                out.write(bytes,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

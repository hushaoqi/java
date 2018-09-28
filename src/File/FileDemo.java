package File;
import java.io.File;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName FileDemo
 * @Description file类的使用
 * @Author CheChinah
 * @Date 2018/9/20 17:17
 * @Version 1.0
 */
public class FileDemo {
    public static void main(String[] args){
        //File类表示一个文件或目录
        File f1 = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.txt");
        if (!f1.exists()){   //判断文件是否存在
            try{
                f1.createNewFile(); //创建文件
                System.out.println("文件创建成功");
            }catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        //f1.isFile();   是否是文件
        System.out.println("是否为文件："+f1.isFile());
        System.out.println("是否为文件夹："+f1.isDirectory());
        //列出当前文件夹下的所有文件名
        File f2 = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project");
        String[] names = f2.list();
        System.out.println(Arrays.toString(names));

        //列出当前目录下的所有文件，以file对象返回
        File[] fs = f2.listFiles();
        for (File f : fs)
        {
            System.out.println("length:"+f.length());
            System.out.println("name:"+f.getName());
            System.out.println("相对路径:"+f.getPath());
            System.out.println("绝对路径:"+f.getAbsolutePath());
            Date date = new Date(f.lastModified());
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            System.out.println("文件的修改时间："+df.format(date));

            System.out.println("文件最后的修改时间:"+f.lastModified());

        }
    }
}

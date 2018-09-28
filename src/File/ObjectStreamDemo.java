package File;

import java.io.*;

/**
 * @ClassName ObjectStreamDemo
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/25 18:02
 * @Version 1.0
 */
public class ObjectStreamDemo {

    private static void writerObject(){
        Dog dog = new Dog("wangwang",2,"母");
        File file = new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\dog.obj");
        OutputStream out = null;
        try {
            out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dog);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String [] args)
    {
        writerObject();
    }
}

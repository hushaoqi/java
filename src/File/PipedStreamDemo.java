package File;

import org.omg.PortableServer.POA;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName PipedStreamDemo
 * 管道流测试，一个线程写入，一个线程读取
 * @Description 作用，用于线程之间的数据通讯
 * @Author CheChinah
 * @Date 2018/9/27 14:42
 * @Version 1.0
 */
public class PipedStreamDemo {
    public static void main(String[] args)
    {
        PipedInputStream pin = new PipedInputStream();
        PipedOutputStream pout = new PipedOutputStream();

        try {
            pin.connect(pout);//两个管道进行连接
        } catch (IOException e) {
            e.printStackTrace();
        }//输入流与输出流连接

        ReaderTread readerTh = new ReaderTread(pin);
        WriterThread writerTh = new WriterThread(pout);
        new Thread(readerTh).start();
        new Thread(writerTh).start();
    }



}
//读取数据线程
class ReaderTread implements Runnable{
    private PipedInputStream pin;//输入管道

    ReaderTread(PipedInputStream pin) {
        this.pin = pin;
    }

    @Override
    public void run() {
        byte[] buf = new byte[1024];
        int len = 0;
        try {
            len = pin.read(buf);//read阻塞

        String s= new String(buf,0,len);
        System.out.println("抓到："+s);
        pin.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
//写入数据线程
class WriterThread implements Runnable{
    private PipedOutputStream pout;//输出管道

    WriterThread(PipedOutputStream pout)
    {
        this.pout = pout;
    }

    @Override
    public void run() {
        try {
            pout.write("一个小姐姐，，，".getBytes());//管道输出流
            pout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

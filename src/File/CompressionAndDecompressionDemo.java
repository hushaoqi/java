package File;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName CompressionAndDecompressionDemo
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/27 16:26
 * @Version 1.0
 */
public class CompressionAndDecompressionDemo {
    //压缩
    private static void compression(String zipFileName , File targetFile)
    {
        System.out.println("正在压缩中....");
        try {
            //要生成的压缩文件
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            BufferedOutputStream bos = new BufferedOutputStream(out);
            zip(out,targetFile,targetFile.getName(),bos);
            bos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("压缩完成！！！");
    }

    private static void zip(ZipOutputStream zOut, File targetFile, String name, BufferedOutputStream bos) throws IOException {
        if (targetFile.isDirectory())
        {
            File[] files = targetFile.listFiles();
            if (files.length == 0 )
            {
                zOut.putNextEntry(new ZipEntry(name+"/"));//处理空目录
            }
            for (File f : files)
            {
                zip(zOut,f,name+"/"+f.getName(),bos);//递归处理
            }
        }
        else {
            zOut.putNextEntry(new ZipEntry(name));
            InputStream in = new FileInputStream(targetFile);
            BufferedInputStream bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes))!= -1)
            {
                bos.write(bytes,0,len);
            }
            bis.close();
        }
    }

    //解压
    private static void decompression(String targetFileName, String parent){

        try {
            //构建一个解压输入流
            ZipInputStream zIn = new ZipInputStream(new FileInputStream(targetFileName));
            ZipEntry entry = null;
            File file = null;
            while ((entry = zIn.getNextEntry())!= null && !entry.isDirectory()) {
                file = new File(parent,entry.getName());
                if (!file.exists()){
                    new File(file.getParent()).mkdirs();//创建此文件的上级目录
                }
                OutputStream out = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(out);
                byte [] bytes = new byte[1024];
                int len = -1;
                while ((len= zIn.read(bytes))!= -1)
                {
                    bos.write(bytes,0 ,len);
                }
                bos.close();
                System.out.println(file.getAbsolutePath()+"解压成功！");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {

        //compression("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.zip",new File("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project"));
        decompression("C:\\Users\\敲键盘的钢琴师\\Desktop\\java_project\\test.zip","C:\\Users\\敲键盘的钢琴师\\Desktop\\test");
    }
}

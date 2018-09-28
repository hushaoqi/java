package NiuKe;

/**
 * @ClassName Test
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/21 20:18
 * @Version 1.0
 */
public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
}

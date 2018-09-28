package pair1;

/**
 * @author Chechinah
 * @description
 * 程序中使用了Pair泛型类，静态的minmax方法遍历了数组并同时计算出最小值和最大值。
 * 泛型类可以看作普通类的工厂。
 */
public class PairTest {
    public static void main(String [] args)
    {
        String[] words = {"Mary","had","little","lamb"};
        Pair<String> mm =  ArrayAlg.minmax(words);
        System.out.println("min = "+ mm.getFirst());
        System.out.println("max = "+ mm.getSecond ());
    }
}
class ArrayAlg
{
    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0 ) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1 ;i < a.length;i ++)
        {
            if (min.compareTo(a[i]) > 0 ) min = a[i];
            if (max.compareTo(a[i]) < 0 ) max = a[i];
        }
        return new Pair<>(min,max);
    }
}
package decorator;

/**
 * @ClassName SoyaBeanMilk
 * @Description 具体的被装饰者类
 * 豆浆
 * @Author CheChinah
 * @Date 2018/9/28 18:30
 * @Version 1.0
 */
public class SoyaBeanMilk implements Drink {

    @Override
    public float cost() {
        return 10f;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }
}

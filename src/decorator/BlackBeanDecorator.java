package decorator;

/**
 * @ClassName SugarDecorator
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/28 18:35
 * @Version 1.0
 */
public class BlackBeanDecorator extends Decorator {
    public BlackBeanDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost()+ 2.0f;
    }

    @Override
    public String description() {
        return super.description()+"+黑豆";
    }
}

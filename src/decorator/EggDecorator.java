package decorator;

/**
 * @ClassName SugarDecorator
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/28 18:35
 * @Version 1.0
 */
public class EggDecorator extends Decorator {
    public EggDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost()+ 1.0f;
    }

    @Override
    public String description() {
        return super.description()+"+鸡蛋";
    }
}

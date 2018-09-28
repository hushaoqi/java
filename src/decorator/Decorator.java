package decorator;

/**
 * @ClassName Decorator
 * @Description 装饰者的基类
 * @Author CheChinah
 * @Date 2018/9/28 18:32
 * @Version 1.0
 */
public class Decorator implements Drink{
    private Drink drink ;//要装饰的类
    public Decorator(Drink drink)
    {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String description() {
        return drink.description();
    }
}

package decorator;

/**
 * @ClassName Test
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/28 18:38
 * @Version 1.0
 */
public class Test {

    public static void main(String [] args)
    {
        Drink drink = new SoyaBeanMilk();
        SugarDecorator sugar = new SugarDecorator(drink);
        EggDecorator egg = new EggDecorator(sugar);
        BlackBeanDecorator blackBean = new BlackBeanDecorator(egg);

        System.out.println("您点的豆浆是："+blackBean.description());
        System.out.println("一共花了："+blackBean.cost()+"元");

    }
}

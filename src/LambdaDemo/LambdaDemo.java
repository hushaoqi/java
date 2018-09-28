package LambdaDemo;

/**
 * @ClassName LambdaDemo
 * @Description TODO
 * @Author CheChinah
 * @Date 2018/9/20 16:25
 * @Version 1.0
 */
public class LambdaDemo {
    public static void main(String[] args){
//        IEat ieat = new IEatImpl();
//        ieat.eat();

//        IEat ieat2 = new IEat() {
//            @Override
//            public void eat() {
//                System.out.println("eat bnana");
//            }
//        };
//        ieat2.eat();


        //Lambda表达式
        //好处:1、代码更简洁。2、相对于匿名内部内，不会单独生成class文件。
//        IEat ieat3 = ()->{System.out.println("eat orange");};
//        ieat3.eat();

        //带参数Lambda表达式
//        IEat ieat4 = ((thing ,name)-> System.out.println("eat  ,,,,"+thing+"..."+name));
//        ieat4.eat("白菜","绍齐");

        //带返回值
        IEat ieat5 = ((thing, name) -> {
            System.out.println(name+"eat..."+thing);
            return 10;
        });
        ieat5.eat("大饼","孙悟空");

        //只有返回值,返回值不能加return,若加了return，则用大括号括起来；
        IEat ieat6 = ((thing, name) -> 10);
        ieat6.eat("西瓜","猪八戒");
    }
}
//只有一个抽象方法的接口
interface IEat{
    public int eat(String thing,String name);
}
//class IEatImpl implements IEat{
//    @Override
//    public void eat() {
//        System.out.println("eat apple");
//    }
//}

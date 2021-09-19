package factory.simpleFactory;

/**
 * ConcreteProduct（具体产品角色）：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 * 每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法。不同的具体产品类可以提供不同的实现
 *
 */
public class Book1 extends Product {

    @Override
    public void add() {
        System.out.println("我是产品1");
    }
}

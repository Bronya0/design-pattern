package factory.simpleFactory;

/**
 * Factory（工厂角色）：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 * 工厂类可以被外界直接调用，创建所需的产品对象；在工厂类中提供了静态的工厂方法factoryMethod()，
 * 它的返回类型为抽象产品类型Product。
 *
 * 使用配置文件进行改进：https://blog.csdn.net/lovelion/article/details/9300731
 */
public class ProductFactory {

    public static Product getProduct(String type){
        Product product = null;
        if (type.equals("book1")){
            product = new Book1();
            System.out.println("生成book1");
        }else if (type.equals("book2")){
            product = new Book2();
            System.out.println("生成book2");
        }
        return product;

    }
}

package singleTon;

import java.security.acl.LastOwnerException;

/**
 *  懒汉式
 *  使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。
 *  由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
 */
public class Lazy {

    private volatile static Lazy instance = null;

    private Lazy(){}

    public static Lazy getInstance(){
        //第一重判断
        if (instance == null){
            synchronized (Lazy.class){
                //第二重判断
                if (instance == null){
                    instance = new Lazy();
                }
            }
        }

        return instance;
    }
}

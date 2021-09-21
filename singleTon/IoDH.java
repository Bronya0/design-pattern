package singleTon;

/**
 *  静态内部类的方式
 *
 */
public class IoDH {

    private IoDH(){}

    //静态内部类
    private static class HolderClass {
        private final static IoDH instance = new IoDH();
    }

    public static IoDH getInstance(){
        return HolderClass.instance;
    }


}

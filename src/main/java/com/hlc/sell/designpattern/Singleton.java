package com.hlc.sell.designpattern;

/**
 * @Author rjyx
 * @Description 单例模式
 * @Date create in 2018/7/17
 * @Modify by
 */

/**
 *
 * 单例模式的优点：
 *     1，在内存中只有一个对象，节省内存空间。
 *     2，避免频繁的创建销毁对象，可以提高性能。
 *     3，避免对共享资源的多重占用。
 *     4，可以全局访问。
 *
 * 单例模式的优点：
 *     1，扩展困难，由于getInstance静态函数没有办法生成子类的实例。如果要拓展，只有重写那个类。
 *     2，隐式使用引起类结构不清晰。
 *     3，导致程序内存泄露的问题。
 *
 *     适用场景：
 *         由于单例模式的以上优点，所以是编程中用的比较多的一种设计模式。以下为使用单例模式的场景：
 *         1，需要频繁实例化然后销毁的对象。
 *         2，创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
 *         3，资源共享的情况下，避免由于资源操作时导致的性能或损耗等
 *         4，控制资源的情况下，方便资源之间的互相通信。
 */

public class Singleton {

    /**
     *   饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用；
     *
     */
//    public  static   Singleton  singleton = new Singleton();
//
//    public Singleton(){}
//    public static Singleton  getInstance(){
//        return singleton;
//    }


    /**
     *
     * 而懒汉式在调用取得实例方法的时候才会实例化对象。
     */
//    public static Singleton singleton;
//
//    public Singleton(){}
//
//    public static synchronized  Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return  singleton;
//    }


    /**
     *双重锁的形式
     *
     */
    public static volatile Singleton singleton = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

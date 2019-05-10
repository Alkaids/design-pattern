# Singleton Pattern 单例模式

单例模式是开发工程中比较常用的一个设计模式，因为开发中总会有这样的需求--整个项目中同一类型只需要
一个对象，作为公共使用的对象，比如：数据库链接、日志记录等，单例模式就是用来处理这样的需求的。所以
单例模式指的就是保证应用程序中，一个类Class只用一个单独的实例。

## 优点

单例模式保证了全局只有一个类对象实例，减少了对象的频繁创建与回收，有利于类似Java 这种JVM 管理垃圾
回收的资源利用，提高了系统性能。


## 缺点

单例类的使用区别于普通类通过new 来创建对象，需要记住获取单例类的方法，在无法查看源码的情况可能
造成开发人员的困扰。

## 实现思路

要实现一个单例类，一般有下面两个步骤：
1. 私有化构造方法，使得无法在类外部对类进行初始化。
2. 提供公有方法获取已经初始化的单例类，这里需要进行判断处理是否已经存在实例，存在则不初始化，否则初始化实例。

## 实现单例的方法

### 饿汉式-常量式

单例类内部定义唯一不可修改的的静态常量实例，在类家在过程中进行了初始化，通过提供的公共方法调用获取
对象实例，避免了线程安全问题，但如果单例类实例不被使用则会造成资源浪费。

``` java
public class SingletonHungryWithConstant {

    /**
     * 提供静态的不可修改的唯一实例常量
     */
    private final static SingletonHungryWithConstant INSTANCE = new SingletonHungryWithConstant();

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonHungryWithConstant() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonHungryWithConstant getInstance() {
        return INSTANCE;
    }
}
```

### 饿汉式-静态代码块

同常量式的写法类似，只是通过静态代码块在类加载过程进行初始化，存在同样的问题，如果单例类不被使用
容易造成资源浪费，无法实现懒加载。

``` java
public class SingletonHungryWithStaticCode {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonHungryWithStaticCode instance;

    /**
     * 通过静态代码块在类加载过程进行初始化
     */
    static {
        instance = new SingletonHungryWithStaticCode();
    }

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonHungryWithStaticCode() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonHungryWithStaticCode getInstance() {
        return instance;
    }
}
```

### 懒汉式

懒汉式实现单例完成了懒加载过程，即需要使用单例类实例的时候才初始化实例，避免了资源浪费，但是存在
线程安全问题，因为初始化过程无法保证线程安全。

```java
public class SingletonLazy {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazy instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazy() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
```

### 懒汉式-线程同步方法

通过synchronized 修饰获取实例的方法，保证了线程安全，但是由于同步的是整个方法所以效率不高。

```java
public class SingletonLazySyncMethod {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazySyncMethod instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazySyncMethod() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static synchronized SingletonLazySyncMethod getInstance() {
        if (instance == null) {
            instance = new SingletonLazySyncMethod();
        }
        return instance;
    }
}
```

### 饿汉式-同步代码块

由于同步方法需要进行一些不必要的操作所以造成效率不高问题，所以将同步方法改为同步代码块的方式，
缩小了同步范围提高效率，但是由于if 判断没有在同步块中所以无法保证单例。

```java
public class SingletonLazySyncCode {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazySyncCode instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazySyncCode() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazySyncCode getInstance() {
        //由于判断没有在加锁过程，所以判断过程容易造成线程不安全
        if (instance == null) {
            //对类加锁，保证初始化过程的线程安全
            synchronized(SingletonLazySyncCode.class) {
                instance = new SingletonLazySyncCode();
            }
        }
        return instance;
    }
}
```

### 懒汉式-双重加锁

解决同步代码块造成的线程不安全问题，同时保证了单例类的唯一性，提高了判断效率，还实现了懒加载过程
避免了资源的浪费。

```java
public class SingletonLazyDoubleCheck {

    /**
     * 提供静态的唯一实例变量
     */
    private static SingletonLazyDoubleCheck instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonLazyDoubleCheck() {
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonLazyDoubleCheck getInstance() {
        //由于判断没有在加锁过程，所以判断过程容易造成线程不安全
        if (instance == null) {
            //对类加锁，保证初始化过程的线程安全
            synchronized(SingletonLazyDoubleCheck.class) {
                //双重判断 保证多线程环境下的实例单一性
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
```

### 静态内部类

通过静态内部类的创建初始化，既保证了线程安全又可以实现懒加载不会造成资源浪费。

```java
public class SingletonInnerClass {

    /**
     * 提供唯一实例变量
     */
    private SingletonInnerClass instance;

    /**
     * 构造方法私有化，防止外部初始化创建实例
     */
    private SingletonInnerClass() {
    }

    /**
     * 静态内部类，保证线程安全，懒加载实现初始化实例
     */
    private static class SingletonInnerClassInstance {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    /**
     * 提供静态的公共方法获取唯一实例
     * @return
     */
    public static SingletonInnerClass getInstance() {
        return SingletonInnerClassInstance.INSTANCE;
    }
}
```

### 枚举类实现单例

自JDK1.5 引入枚举的概念后，由于枚举类的下面两个特性，很容易实现单例模式：
1. enum 类的构造方法都是private 私有的。
2. enum 类的实例都是static final 修饰的，保证实例静态单一。

```java
public enum  SingletonEnum {

    //枚举单一实例，必须是单一的，不然没法保证单例
    INSTANCE;

    //含有一个需要单例的类型的实例变量
    private Singleton instance;

    //在枚举构造函数中对单例类进行初始化，由于枚举单一实例只会初始化一次保证单例
    SingletonEnum() {
        instance = new Singleton();
    }

    /**
     * 提供静态的公共方法获取唯一实例 通过SingletonEnum.INSTANCE.getInstance() 获取单例类实例
     * @return
     */
    public Singleton getInstance() {
        return instance;
    }
}

/**
 * 单例类-需要单例的类，不需要额外处理
 */
class Singleton {

}
```

## 总结

实现单例模式有上面介绍的多种方式，但是常用和推荐的还是双重锁实现以及枚举方式两种，更推荐枚举，
因为枚举的实现更简单而且更优雅。
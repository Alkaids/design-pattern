# Proxy 代理模式

代理这个词在现在这个网购社会肯定不会陌生，那什么是代理呢？我们平时听到的很多的代购其实就是一种代理，客户需要购买某类商品但是不要亲自去购买而是让代购帮忙购买，最后同样能买到想要的商品。
开发中使用的代理模式也是借用的代理的概念的一种设计模式，客户端不要要接触实际需要的类的使用，或者屏蔽客户端对实际业务类的使用，而通过代理类对象完成所需要的业务操作。

## 定义

[代理模式](https://zh.wikipedia.org/wiki/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F) 在维基百科上的定义是这样的：

**代理模式（英语：Proxy Pattern）** 是程序设计中的一种设计模式。所谓的代理者是指一个类别可以作为其它东西的接口。代理者可以作任何东西的接口：网络连接、存储器中的大对象、文件或其它昂贵或无法复制的资源。

## 角色分析

![代理模式UML图](../../static/proxy.png)

从图1的代理模式UML 类图中可以看出，代理模式主要有下面几种角色：

+ **抽象主题：** 定义代理类和被代理类公共的对外方法，公共方法的定义使得代理类可以完成被代理类的工作。

+ **代理类：** 代理模式的核心类，主要是用于供客户端使用，对代理类进行隔离。

+ **被代理类：** 客户端最终需要的实际完成的业务需求类。

## 示例

下面我还是以代购这个过程为栗子演示代理模式的使用。

### 抽象主题

```java
public interface Action {

    /**
     * 购买商品方法
     */
    void buy();
}
```

### 被代理类

```java
public class NormalUser implements Action {

    /**
     * 用户名
     */
    public String userName;

    /**
     * 构造函数
     * @param userName 用户名
     */
    public NormalUser(String userName) {
        this.userName = userName;
    }

    /***
     * 用户购买方法
     */
    @Override
    public void buy() {
        System.out.println(userName +"付钱购买商品！");
    }
}
```

### 代理类

```java
public class ProxyUser implements Action {

    /**
     * 代购名称
     */
    public String proxyName;

    /**
     * 含有别代理对象的引用
     */
    private NormalUser user;

    /**
     * 构造函数传入需要代理的对象
     * @param proxyName 代购名称
     * @param user 被代理对象
     */
    public ProxyUser(String proxyName, NormalUser user) {
        this.proxyName = proxyName;
        this.user = user;
    }

    /**
     * 代购购买方法
     */
    @Override
    public void buy() {
        System.out.println("代购" + proxyName + "帮" + user.userName + "购买商品");
        user.buy();
    }
}
```

### 客户端

```java
public class ProxyTest {

    /**
     * main函数模拟整个代购过程
     */
    public static void main(String[] args) {
        NormalUser normalUser = new NormalUser("张三");
        ProxyUser proxyUser = new ProxyUser("李四", normalUser);

        proxyUser.buy();
    }
}
```

### 结果

![代理模式示例结果](../../static/proxy-result.png)

## 应用场景

在软件开发中下面几种应用场景可以考虑使用代理模式：

+ **延迟加载：** 有某种业务并不是马上使用，而且完成这种业务需要占用大量的系统资源，这用情况可以使用代理模式。代理模式的使用可以减少不必要的资源浪费，同时可以加快系统响应速度，提高用户体验。

+ **静态代理：** 需要对已知业务进行明确的业务扩展的场景可以使用代理模式，这种明确知道扩展业务的应用就属于静态代理。

+ **动态代理：** 完成某种业务逻辑比较复杂，有多个步骤组成，这时候如果对每个步骤都建立抽象然后在具体实现就显得比较复杂，而且后期需要修改是也需要改动的地方比较多，不利于维护，这种情况也可以使用代理模式。代理模式可以简化业务逻辑，利于系统维护，提高系统的灵活性。

+ **安全隔离：** 将客户端于真实对象进行隔离，控制用户对真实对象的访问权限，这种做权限控制的场景也适用于代理模式。对每类角色都建立对应的代理类，方便对用户的权限进行区分以及管理。

## 动态代理

动态代理被许多优秀的框架所使用，例如我们常用和熟悉的Spring 中的AOP就是利用动态代理完成的，所以这里单独在介绍下动态代理的使用。

动态代理主要使用的还是JDK自带的动态代理和CGLib 动态代理两种。下面我结合卖车这个场景来演示相关的应用。

### JDK 动态代理

动态代理相关的3个重要的概念：

+ Proxy 类

+ InvocationHandler 接口

+ invoke 方法

#### Proxy 类

动态代理最终生成的都是Proxy 类，而实例都是通过newProxyInstance() 方法创建的。

```java
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
```

+ loader: 是代理类用来加载的类加载器。

+ interfaces: 代理类用来代理实现的接口。

+ h: 代理类用来转发内部通知的接口的具体实现。

#### InvocationHandler 接口





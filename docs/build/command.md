# Command Pattern 命令模式


## 定义

> **命令模式：** 将一个请求封装成一个对象，从而使你可用不同的请求对客户进行参数化：对请求排队或记录日志，以及支持可撤销的操作。

简单的来说，**命令模式** 就是将请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，让该对象执行命令。

## 角色分析

![命令模式UML 类图](../../static/command.png)

从图1的命令模式UML 类图中可以看出，命令模式包含下面几种角色：

+ **Command 抽象命令：** 用来声明执行请求的接口或抽象类。

+ **ConcreteCommand 具体命令：** 处理某种具体请求，含有以一个请求接受者的引用用处处理具体请求。

+ **Invoker 调用者：** 用于将具体请求当成命令发送给请求接受者，使的请求能够正确处理。

+ **Receiver 接收者：** 请求的实际处理者

## 示例

下面以去餐厅点餐为栗子演示命令模式的应用：

### Command 抽象命令

```java
public interface Meal {

    /**
     * 点餐命令
     * @param meal
     */
    void orderMeal(String meal);
}
```

### ConcreteCommand 具体命令

```java
public class ChineseMeal implements Meal {

    /**
     * 大厨
     */
    private Chef chef;

    public ChineseMeal(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderMeal(String meal) {
        chef.cookMeal(meal);
    }
}
```

### Invoker 调用者




### Receiver 接收者

```java
public interface Chef {

    /**
     * 炒菜方法
     * @param meal
     */
    void cookMeal(String meal);
}

public class ChineseChef implements Chef {

    @Override
    public void cookMeal(String meal) {
        System.out.println("中餐大厨炒" + meal);
    }
}
```
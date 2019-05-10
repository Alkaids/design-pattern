# Flyweight Pattern 享元模式


## 定义

[享元模式](https://zh.wikipedia.org/wiki/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F) 在维基百科上的定义是这样的：

> **享元模式（英语：Flyweight Pattern）** 是一种软件设计模式。它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；它适合用于当大量物件只是重复因而导致无法令人接受的使用大量内存。通常物件中的部分状态是可以分享。常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。

简单来说：**享元模式（FlyWeight）**，运用共享技术有效的支持大量细粒度的对象。

## 角色分析

![享元模式UML类图](../../static/flyweight.png)

从图1的享元模式UML 类图中，可以看出享元模式有下面几种角色：

+ **FlyWeight 抽象享元：** 共享资源的抽象接口或抽象类。

+ **ConcreteFlyWeight 具体享元类：** 具体的某类共享资源类。

+ **UnSharedConcreteFlyWeight 非共享享元实现类：** 因为享元模式的应用把资源共享概念提取出来了，但是实际上肯定有些资源是不需要共享的，这些就用非共享实现类表示。

+ **FlyWeightFactory 享元工厂类：** 统一管理资源数据的使用。

## 示例

下面以为栗子演示享元模式的应用：

### FlyWeight 抽象享元

### ConcreteFlyWeight 具体享元类

### UnSharedConcreteFlyWeight 非共享享元实现类

### FlyWeightFactory 享元工厂类

### 测试

### 结果

## 应用场景
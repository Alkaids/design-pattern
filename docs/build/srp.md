# Single Responsibility Principle单一职责原则

## 定义

**单一职责原则：** 就一个类而言，应该仅有一个引起它内部变化的原因。

## 解决的问题

一个类，只有一个引起它变化的原因。应该只有一个职责。每一个职责都是变化的一个轴线，如果一个类有一个以上的职责，这些职责就耦合在了一起。这会导致脆弱的设计。当一个职责发生变化时，可能会影响其它的职责。另外，多个职责耦合在一起，会影响复用性。

## 优点

+ 降低类的复杂性。

+ 提高了类的复用性以及系统的可维护性。

+ 降低需求变更带来的风险，以及对其他功能的影响。

## 示例

下面用栗子演示单一职责的应用：

### 非单一职责

```java
public interface Sing {

    void sing();
}

public interface Performance {

    void performance();
}

public class Genius implements Sing, Performance{

    @Override
    public void performance() {
        System.out.println("我是天才，我会表演");
    }

    @Override
    public void sing() {
        System.out.println("我是天才，我会唱歌");
    }
}

public class NormalTest {

    public static void main(String[] args) {
        Genius genius = new Genius();
        
        genius.sing();
        genius.performance();
    }
}
```

上面演示的是天才既会唱歌又会表演，我们可以通过一个Genius 类就可以完成唱歌和表演两件事，但是存在问题当我们对表演或者对唱歌进行修改的时候，Genius 类无法正常使用必须等待修改完成，显然这样是不合理的，因为表演和唱歌本来就是两件事，互不干涉，这就是一个类赋予多个这能导致的问题。

### 单一职责改造

```java
public class Singer implements Sing {

    @Override
    public void sing() {
        System.out.println("我是歌手，专注唱歌。");
    }
}

public class Actor implements Performance {

    @Override
    public void performance() {
        System.out.println("我是演员，专注表演。");
    }
}

public class SrpTest {

    public static void main(String[] args) {
        Singer singer = new Singer();
        singer.sing();
        
        Actor actor = new Actor();
        actor.performance();
    }
}
```

这样将表演和唱歌拆分之后，就减少了它们之间的耦合，系统变得更加灵活。

## 总结

针对唱歌和表演两件事，其实第一种方式也能达到目的，至于为什么还要提出单一职责原则改造成第二种方式，我个人的理解是为了后期系统开发的灵活性和可扩展性的一种考虑，也是项目开发经验的一种总结，但是其实对于设计而言并不一定是考虑的越多越好，往往提倡的是恰好的设计，因为系统开发过程中需求变更频繁过度设计会导致很多无用功，所以具体的使用还是要分具体场景，如果系统很小场景有限，我觉得在有限的时间进行开发选择第一种反而会是更好的设计。
# 建造者模式

## 定义: 将一个复杂对应的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示

- 用户只需要指定需要的建造者类型就可以得到他们，建造的过程与细节不需要知道

## 适用场景 

- 一个对象有非常复杂的内部结构（很多属性）
- 把复杂对象的创建与使用分离

## 优点

- 封装性好,创建和使用分离
- 扩展性好，建造了之间独立，一定程度上解耦

## 缺点

- 产生多余的builder对象
- 产品内部发生变化，建造者都要修改, 成本比较大

## 案例
- JDK中, StringBuilder, StringBuffer中例如append就使用了建造者模式
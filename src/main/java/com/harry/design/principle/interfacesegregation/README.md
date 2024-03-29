# 接口隔离原则
## 定义: 用多个专门的接口，而不使用一个单一的总接口客户端不应该依赖它不需要的接口

- 一个类对一个类的依赖应该建立在最小的接口上
- 建立单一的接口，不要建立庞大臃肿的接口
- 细粒度的接口可以非常灵活的进行组装，粗粒度的接口不能够进行拆分

## 注意 
- 接口的拆分要适度,否则会造成接口数量过多，降低程序的可维护性
## 接口隔离原则与单一职责原则的区别

- 接口隔离原则注重接口的设与隔离
- 单一职责原则注重类，方法，接口的职责划分，即只要是相同职责的功能，都可放在同一个方法/类/接口中
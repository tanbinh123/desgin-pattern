package com.harry.design.review.structural.decorator;

/**
 * 装饰模式：现在足球服上的广告越来越多了，
 * 2012年欧洲杯夺冠热门之一（赛前预测）德国队队服胸前右边一个奔驰，
 * 左边一个阿迪，当然还可以继续增加，广告既没有改变球衣的用途和性能，
 * 还能起到装饰效果，增加收入，何乐而不为呢？就是半决赛没能够让巴神继续“思考人生”，
 * 悲催的德国队！增加新的广告，只需对原有球服继续装饰即可。
 *
 * 装饰模式(Decorator): 动态地给一个对象添加一些额外的职责，就扩展功能而言， 它比生成子类的方式更为灵活。
 * create by： harry
 * date:  2019/8/24 0024 下午 6:10
 **/
public class Test {

    public static void main(String[] args) {
        FootballUniform footballUniform = new UniformImpl("中国队球服");
        UniformDecorator uniformDecorator = new BenzAdvertisement();
        uniformDecorator.setFootballUniform(footballUniform);
        UniformDecorator uniformDecorator1 = new AdidasAdvertisement();
        uniformDecorator1.setFootballUniform(uniformDecorator);

        uniformDecorator1.display();
    }
}

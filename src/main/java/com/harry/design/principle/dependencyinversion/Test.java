package com.harry.design.principle.dependencyinversion;

/**
 *  依赖倒置原则测试
 * create by： 徐齐斌
 * date:  2019/7/15 0015
 **/
public class Test {

    // v1: 面向实现编程: 所有的修改都必须操作原有类，高层严重依赖低层模块
  /*  public static void main(String[] args) {
        Harry harry = new Harry();
        harry.studyJavaCourse();
        harry.studyCPlusPlus();
    }*/

    //v2: 面向接口编程: 所有修改通过新增一个实现类，在方法中传入实现类，只与接口产生依赖，不与具体实现依赖
  /*  public static void main(String[] args) {
        Harry harry = new Harry();
        harry.studyCourse(new JavaCourse());
        harry.studyCourse(new CPlusPlusCourse());
    }*/

  //v3: 在v2的基础上，通过在构造器中注入具体的实现类来完成操作
  /*  public static void main(String[] args) {
        Harry harry = new Harry(new JavaCourse());
        harry.studyCourse();
    }*/

      //v4: 在v3的基础上，不使用构造器的方式注入依赖，而是通过set的方式来注入依赖，保证对象的单例
      public static void main(String[] args) {
          Harry harry = new Harry();
          harry.setiCourse(new JavaCourse());
          harry.studyCourse();

          harry.setiCourse(new CPlusPlusCourse());
          harry.studyCourse();

          harry.setiCourse(new PythonCourse());
          harry.studyCourse();
      }
}

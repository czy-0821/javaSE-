package com.itheima.test6;

/**
 * @Author:gy
 * @Date: 2025/08/19 16:05
 * @Description:
 */
public enum Season {

    /*
    所有枚举类都是Enum的子类
    我们可以通过枚举类名.枚举项名称去访问指定的枚举项
    我们每一个枚举项就是都是该枚举的一个对象
    枚举类也是一个类,是类我们就可以定义成员变量
    枚举类的第一行必须是枚举项,最后一个枚举项的分号是可以省略的,如果有其他东西,这个分号不建议省略
    枚举类也有构造器,但是必须默认是private,他默认也是私有的
    枚举项的用法比较特殊  枚举("");
    枚举类也可以有抽象方法,但是枚举项必须重写该访问
     */
    SPRING("春"){
        @Override
        public void a() {

        }
    },
    SUMMER("夏"){
        @Override
        public void a() {

        }
    },
    AUTUMN ("秋"){
        @Override
        public void a() {

        }
    },
    WINTER ("冬"){
        @Override
        public void a() {

        }
    };
    private Season(String name){
       // System.out.println("我是枚举类的空参构造");
    }
    int num = 10;
    public abstract  void a();
}

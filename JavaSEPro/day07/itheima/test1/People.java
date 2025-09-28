package com.itheima.test1;

/**
 * @Author:gy
 * @Date: 2025/08/24 10:29
 * @Description:
 */
public class People implements Comparable<People> {
    private String name;
    private int age;
    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    比较两个对象的大小
     o:表示集合中已经存在的对象
     返回值:如果是正值,表示要存入的比当前对象大,放右边
     返回值:如果是负值,表示要存入的比当前对象小,放左边
     返回值:如果是0,表示要存入的和当前对象相等,不存
     this:谁调用我 我就表示谁  即将需要存入的元素
    * */
    @Override
    public int compareTo(People o) {
        /*排序规则
       1.主要排序规则
       2.如果年龄相等  次要排序条件  根据姓名去比较
        * */
     /*   int result = this.age - o.age;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }*/
         int result = this.age - o.age;
         result = this.age - o.age == 0?this.name.compareTo(o.name):result;
         return result;
    }
}

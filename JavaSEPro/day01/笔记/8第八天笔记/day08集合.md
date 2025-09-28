## 1.HashSet集合

### 1.1HashSet集合概述和特点【应用】

- 底层数据结构是哈希表
- 存取无序
- 不可以存储重复元素
- 没有索引,不能使用普通for循环遍历

### 1.2HashSet集合的基本应用【应用】

存储字符串并遍历

```java
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");

        //遍历
        for(String s : set) {
            System.out.println(s);
        }
    }
}
```

### 1.3哈希值【理解】

- 哈希值简介

  ​	是JDK根据对象的地址或者属性值算出来的int类型的数值

- 如何获取哈希值

  ​	Object类中的public int hashCode()：返回对象的哈希码值

- 哈希值的特点

  - 同一个对象多次调用hashCode()方法返回的哈希值是相同的
  - 默认情况下，不同对象的哈希值是不同的。而重写hashCode()方法，可以实现让不同对象的哈希值相同

### 1.4哈希表结构【理解】

- JDK1.8以前

  ​	数组 + 链表

  ![14_JKD8以前哈希表](.\img\14_JKD8以前哈希表.png)

- JDK1.8以后

  - 节点个数少于等于8个

    ​	数组 + 链表

  - 节点个数多于8个

    ​	数组 + 红黑树

  ![15_JKD8以后哈希表](.\img\15_JKD8以后哈希表.png)

### 1.5HashSet集合存储学生对象并遍历【应用】

- 案例需求

  - 创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
  - 要求：学生对象的成员变量值相同，我们就认为是同一个对象

- 代码实现

  学生类

  ```java
  public class Student {
      private String name;
      private int age;

      public Student() {
      }

      public Student(String name, int age) {
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
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Student student = (Student) o;

          if (age != student.age) return false;
          return name != null ? name.equals(student.name) : student.name == null;
      }

      @Override
      public int hashCode() {
          int result = name != null ? name.hashCode() : 0;
          result = 31 * result + age;
          return result;
      }
  }
  ```

  测试类

  ```java
  public class HashSetDemo02 {
      public static void main(String[] args) {
          //创建HashSet集合对象
          HashSet<Student> hs = new HashSet<Student>();

          //创建学生对象
          Student s1 = new Student("林青霞", 30);
          Student s2 = new Student("张曼玉", 35);
          Student s3 = new Student("王祖贤", 33);

          Student s4 = new Student("王祖贤", 33);

          //把学生添加到集合
          hs.add(s1);
          hs.add(s2);
          hs.add(s3);
          hs.add(s4);

          //遍历集合(增强for)
          for (Student s : hs) {
              System.out.println(s.getName() + "," + s.getAge());
          }
      }
  }
  ```

- 总结

  ​	HashSet集合存储自定义类型元素,要想实现元素的唯一,要求必须重写hashCode方法和equals方法


## 2.Map集合

### 2.1Map集合概述和特点【理解】

- Map集合概述

  ```java
  interface Map<K,V>  K：键的类型；V：值的类型
  ```

- Map集合的特点

  - 双列集合,一个键对应一个值
  - 键不可以重复,值可以重复

- Map集合的基本使用

  ```java
  public class MapDemo01 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String,String> map = new HashMap<String,String>();

          //V put(K key, V value) 将指定的值与该映射中的指定键相关联
          map.put("itheima001","林青霞");
          map.put("itheima002","张曼玉");
          map.put("itheima003","王祖贤");
          map.put("itheima003","柳岩");

          //输出集合对象
          System.out.println(map);
      }
  }
  ```

### 2.2Map集合的基本功能【应用】

- 方法介绍

  | 方法名                                 | 说明                 |
  | ----------------------------------- | ------------------ |
  | V   put(K key,V   value)            | 添加元素               |
  | V   remove(Object key)              | 根据键删除键值对元素         |
  | void   clear()                      | 移除所有的键值对元素         |
  | boolean containsKey(Object key)     | 判断集合是否包含指定的键       |
  | boolean containsValue(Object value) | 判断集合是否包含指定的值       |
  | boolean isEmpty()                   | 判断集合是否为空           |
  | int size()                          | 集合的长度，也就是集合中键值对的个数 |

- 示例代码

  ```java
  public class MapDemo02 {
      public static void main(String[] args) {
          //创建集合对象
          Map<String,String> map = new HashMap<String,String>();

          //V put(K key,V value)：添加元素
          map.put("张无忌","赵敏");
          map.put("郭靖","黄蓉");
          map.put("杨过","小龙女");

          //V remove(Object key)：根据键删除键值对元素
  //        System.out.println(map.remove("郭靖"));
  //        System.out.println(map.remove("郭襄"));

          //void clear()：移除所有的键值对元素
  //        map.clear();

          //boolean containsKey(Object key)：判断集合是否包含指定的键
  //        System.out.println(map.containsKey("郭靖"));
  //        System.out.println(map.containsKey("郭襄"));

          //boolean isEmpty()：判断集合是否为空
  //        System.out.println(map.isEmpty());

          //int size()：集合的长度，也就是集合中键值对的个数
          System.out.println(map.size());

          //输出集合对象
          System.out.println(map);
      }
  }
  ```

### 2.3Map-第一种遍历方式【重点】

方法介绍

| 方法名                 | 说明       |
| ------------------- | -------- |
| Set<K>   keySet()   | 获取所有键的集合 |
| V   get(Object key) | 根据键获取值   |

![1597058641952](img\1597058641952.png)

示例代码

```java
package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Map的第一种遍历方式
 */
public class MyMap3 {
  public static void main(String[] args) {
        //创建集合并添加元素
        Map<String,String> map = new HashMap<>();
        map.put("1号丈夫","1号妻子");
      map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");
        map.put("5号丈夫","5号妻子");

        //获取到所有的键
      Set<String> keys = map.keySet();
        //遍历Set集合得到每一个键
        for (String key : keys) {
            //通过每一个键key，来获取到对应的值
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
```

### 2.4Map-第二种遍历方式【重点】

 方法介绍

| 方法名                           | 说明          |
| ----------------------------- | ----------- |
| Set<Map.Entry<K,V>>entrySet() | 获取所有键值对对象集合 |
| K getKey()                    | 获得键值        |
| V getValue()                  | 获得值         |

![](img\entrySet01.jpg)

示例代码

```java
package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的第二种遍历方式
 */
public class MyMap4 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Map<String,String> map = new HashMap<>();
        map.put("1号丈夫","1号妻子");
        map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");
        map.put("5号丈夫","5号妻子");

        //首先要获取到所有的键值对对象。
        //Set集合中装的是键值对对象（Entry对象）
        //而Entry里面装的是键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //得到每一个键值对对象
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
```

#### 

## 3.HashMap集合

### 3.1HashMap-原理解析【难点】

​	1.HashMap小结

- HashMap底层是哈希表结构
- 依赖hashCode方法和equals方法保证键的唯一
- 如果键要存储自定义对象,需要重写hashCode和equals方法



![1596772086762](img\1596772086762.png)



### 3.2 HashMap集合-练习【重点】

1.案例需求

- 创建一个HashMap集合，键是学生对象(Student)，值是籍贯 (String)。存储三个元素，并遍历。
- 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

2.实现思路

- 定义学生类
- 创建HashMap集合对象
- 添加学生对象
- 为了保证key的一致性，重写学生类的hashCode和equals方法

3.代码实现

学生类

```java
package com.itheima.mapdemo1;

public class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

测试类

```java
package com.itheima.mapdemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的练习
 */
public class MyMap5 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("xiaohei",23);
        Student s2 = new Student("dapang",22);
        Student s3 = new Student("xiaomei",22);

        hm.put(s1,"江苏");
        hm.put(s2,"北京");
        hm.put(s3,"天津");

        //第一种：先获取到所有的键，再通过每一个键来找对应的值
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "----" + value);
        }

        System.out.println("===================================");

        //第二种：先获取到所有的键值对对象。再获取到里面的每一个键和每一个值
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "----" + value);
        }
        System.out.println("===================================");
        //第三种：
        hm.forEach(
                (Student key, String value)->{
                    System.out.println(key + "----" + value);
                }
        );

    }
}
```

4.forEach方法解析

![](img\forEach02.png)

## 4.TreeMap集合 

### 4.1TreeMap-原理解析【了解】

1.TreeMap-小结

- TreeMap底层是红黑树结构
- 依赖自然排序或者比较器排序,对键进行排序
- 如果**键存储**的是自定义对象,需要实现Comparable接口或者在创建TreeMap对象时候给出比较器排序规则

### 4.2TreeMap集合应用案例【重点】

- 案例需求

  + 创建一个TreeMap集合,键是学生对象(Student),值是籍贯(String),学生属性姓名和年龄,按照年龄进行排序并遍历
  + 要求按照学生的年龄进行排序,如果年龄相同则按照姓名进行排序

- 实现思路

  1.创建学生类

  2.创建TreeMap集合对象

  3.创建学生对象

  4.添加学生对象

  5.遍历输出

+ 代码实现

  学生类

  ```java
  package com.itheima.maptest;

  public class Student/* implements Comparable<Student>*/{
    private String name;
      private int age;

    public Student() {
      }

      public Student(String name, int age) {
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
          return "Student{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                '}';
      }

     /* @Override
      public int compareTo(Student o) {
          //按照年龄进行排序
          int result = o.getAge() - this.getAge();
          //次要条件，按照姓名排序。
          result = result == 0 ? o.getName().compareTo(this.getName()) : result;
          return result;
      }*/
  }
  ```

  测试类

  ```java
  package com.itheima.maptest;

  import java.util.Comparator;
  import java.util.TreeMap;

  /**
   * 需求：创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(String)。
   *           学生属性姓名和年龄，按照年龄进行排序并遍历。
   */
  public class Test1 {
      public static void main(String[] args) {
          TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
              @Override
              public int compare(Student o1, Student o2) {
                  int result = o1.getAge() - o2.getAge();
                  result = result== 0 ? o1.getName().compareTo(o2.getName()) : result;
                  return result;
              }
          });

          Student s1 = new Student("xiaohei",23);
          Student s2 = new Student("dapang",22);
          Student s3 = new Student("xiaomei",22);

          tm.put(s1,"江苏");
          tm.put(s2,"北京");
          tm.put(s3,"天津");

          tm.forEach(
                  (Student key, String value)->{
                      System.out.println(key + "---" + value);
                  }
          );
      }
  }
  ```

## 5.可变参数

- 可变参数介绍

  - 可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
  - 方法的参数类型已经确定,个数不确定,我们可以使用可变参数

- 可变参数定义格式

  ```java
  修饰符 static 返回值类型 方法名(数据类型… 变量名) {  }
  ```

- 可变参数的注意事项

  - 这里的变量其实是一个数组
  - 如果一个方法有多个参数，包含可变参数，可变参数要放在最后

- 可变参数的基本使用

  ```java
  public class ArgsDemo01 {
      public static void main(String[] args) {
          System.out.println(sum(10, 20));
          System.out.println(sum(10, 20, 30));
          System.out.println(sum(10, 20, 30, 40));

          System.out.println(sum(10,20,30,40,50));
          System.out.println(sum(10,20,30,40,50,60));
          System.out.println(sum(10,20,30,40,50,60,70));
          System.out.println(sum(10,20,30,40,50,60,70,80,90,100));
      }

  //    public static int sum(int b,int... a) {
  //        return 0;
  //    }

      public static int sum(int... a) {
          int sum = 0;
          for(int i : a) {
              sum += i;
          }
          return sum;
      }
  }
  ```

## 6.创建不可变集合

- 方法介绍

  - 在List、Set、Map接口中,都存在of方法,可以创建一个不可变的集合
    - 这个集合不能添加,不能删除,不能修改
    - 但是可以结合集合的带参构造,实现集合的批量添加
  - 在Map接口中,还有一个ofEntries方法可以提高代码的阅读性
    - 首先会把键值对封装成一个Entry对象,再把这个Entry对象添加到集合当中

- 示例代码

  ```java
  public class MyVariableParameter4 {
      public static void main(String[] args) {
          // static <E>  List<E>  of(E…elements)  创建一个具有指定元素的List集合对象
          //static <E>  Set<E>  of(E…elements)    创建一个具有指定元素的Set集合对象
          //static <K , V>   Map<K，V>  of(E…elements) 创建一个具有指定元素的Map集合对象

          //method1();
          //method2();
          //method3();
          //method4();

      }

      private static void method4() {
          Map<String, String> map = Map.ofEntries(
                  Map.entry("zhangsan", "江苏"),
                  Map.entry("lisi", "北京"));
          System.out.println(map);
      }

      private static void method3() {
          Map<String, String> map = Map.of("zhangsan", "江苏", "lisi", "北京", "wangwu", "天津");
          System.out.println(map);
      }

      private static void method2() {
          //传递的参数当中，不能存在重复的元素。
          Set<String> set = Set.of("a", "b", "c", "d","a");
          System.out.println(set);
      }

      private static void method1() {
          List<String> list = List.of("a", "b", "c", "d");
          System.out.println(list);
          //list.add("Q");
          //list.remove("a");
          //list.set(0,"A");
          //System.out.println(list);

  //        ArrayList<String> list2 = new ArrayList<>();
  //        list2.add("aaa");
  //        list2.add("aaa");
  //        list2.add("aaa");
  //        list2.add("aaa");

          //集合的批量添加。
          //首先是通过调用List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数。
          //再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。
          ArrayList<String> list3 = new ArrayList<>(List.of("a", "b", "c", "d"));
          System.out.println(list3);
      }
  }
  ```
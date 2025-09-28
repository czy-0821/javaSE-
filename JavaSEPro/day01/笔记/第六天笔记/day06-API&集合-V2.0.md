## ==知识点==

1. Date
2. SimpleDateFormat
3. 集合概述
4. Collection
5. List
6. 数据结构
7. ArrayList
8. LinkedList

## 1.时间日期类

### 1.1 时间概述【了解】

1. 北京时间需要在世界标准时间加上8小时

2. 计算机中时间原点（UNIX操作系统,C语言的诞生日）

   ![image-20201015005659191](img\time-c.png)

​      1970年1月1日 00:00:00

  3.时间换算单位

​    1秒 = 1000毫秒

​	1毫秒 = 1000微秒

​    1微秒 = 1000 纳秒

### 1.2 时间日期类-Date构造方法【重点】

1. 什么是Date类

   Date 代表了一个特定的时间，精确到毫秒

  2.Date类构造方法

| 方法名                    | 说明                                    |
| ---------------------- | ------------------------------------- |
| public Date()          | 创建 Date对象，默认存储当前时间，单位毫秒               |
| public Date(long date) | 创建 Date对象，并将其初始化为表示从**标准基准时间**起指定的毫秒数 |

示例代码

```java
package com.itheima.mydate;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
//        public Date()		创建一个Date对象，表示默认时间
//public Date(long date)	创建一个Date对象，表示指定时间

        //那么这个时间就表示电脑中的当前时间。
        Date date1 = new Date();
        System.out.println(date1);

        //从计算机的时间原点开始，过了指定毫秒的那个时间。
        Date date2 = new Date(0L);
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970
        //从时间原点开始，过了0毫秒。
        //因为我们是在中国，我们是在东八区需要+8小时。

        //1970年1月1日 上午的10点
        Date date3 = new Date(2*3600L * 1000);
        System.out.println(date3);
    }
}
```

### 1.3 时间日期类-Date成员方法（重点）

- 常用方法

  | 方法名                            | 说明                                 |
  | ------------------------------ | ---------------------------------- |
  | public long getTime()          | 获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值 |
  | public void setTime(long time) | 设置时间，给的是毫秒值                        |

- 示例代码

  ```java
  package com.itheima.mydate;

  import java.text.SimpleDateFormat;
  import java.util.Date;

  public class DateDemo2 {
      public static void main(String[] args) {
  //        public long getTime()			获取时间对象的毫秒值
  //        public void setTime(long time)		设置时间，传递毫秒值

          //method1();
          //method2();

    }

      private static void method2() {
          Date date1 = new Date();
          date1.setTime(0L);
          System.out.println(date1);
      }

      private static void method1() {
          //把当前时间封装成一个date对象
          Date date1 = new Date();
          //获取这个date对象的毫秒值 --- 获取当前时间的毫秒值
          long time = date1.getTime();
          System.out.println(time);
  		
          long time2 = System.currentTimeMillis();
          System.out.println(time2);
      }
  }
  ```

### 1.4 SimpleDateFormat类（重点、难点）

(共2点)

1.SimpleDateFormat类有什么作用？

​	SimpleDateFormat可以对Date对象和日期字符串,进行格式化和解析

2.如何使用？

1.常用的模式字母及应对关系如下:

 HH：24小制,hh:12小时制

![1595820776762](img\1595820776762.png)

2.SimpleDateFormat类构造方法

| 方法名                                      | 说明                               |
| ---------------------------------------- | -------------------------------- |
| public   SimpleDateFormat()              | 构造一个SimpleDateFormat，使用默认模式和日期格式 |
| public  SimpleDateFormat(String pattern) | 构造一个SimpleDateFormat使用给定的模式      |

3.SimpleDateFormat类的常用方法

- 格式化(从Date到String)

  ​	public final String format(Date date)：将日期格式化成日期/时间字符串

- 解析(从日期/时间字符串String到Date)

  ​	public Date parse(String source)：从给定字符串的开始解析文本以生成日期      

示例代码（公历日期标准格式为；2007年2月6日；或：2007-02-06）

```java
package com.itheima.mydate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String s = "2048-01-01";

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(s);

        System.out.println(date);
    }
}
```



### 1.5 时间日期类练习 (重点) 

+ 需求

  秒杀开始时间是2020年11月11日 00:00:00,结束时间是2020年11月11日 00:10:00,用户小贾下单时间是2020年11月11日 00:03:47,用户小皮下单时间是2020年11月11日 00:10:11,判断用户有没有成功参与秒杀活动

+ 实现步骤

  1. 判断下单时间是否在开始到结束的范围内
  2. 把字符串形式的时间变成毫秒值

+ 代码实现

  ```java
  package com.itheima.mydate;

  import java.text.ParseException;
  import java.text.SimpleDateFormat;
  import java.util.Date;

  public class DateDemo5 {
    public static void main(String[] args) throws ParseException {
          //开始时间：2020年11月11日 0:0:0
        //结束时间：2020年11月11日 0:10:0

        //小贾2020年11月11日 0:03:47
          //小皮2020年11月11日 0:10:11
  ```


          //1.判断两位同学的下单时间是否在范围之内就可以了。

        //2.要把每一个时间都换算成毫秒值。

          String start = "2020年11月11日 0:0:0";
          String end = "2020年11月11日 0:10:0";
    
          String jia = "2020年11月11日 0:03:47";
          String pi = "2020年11月11日 0:10:11";
    
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
          long endTime = sdf.parse(end).getTime();

  //        System.out.println(startTime);
  //        System.out.println(endTime);
          long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
    
        if(jiaTime >= startTime && jiaTime <= endTime){
              System.out.println("小贾同学参加上了秒杀活动");
          }else{
              System.out.println("小贾同学没有参加上秒杀活动");
          }
    
        System.out.println("------------------------");
    
          if(piTime >= startTime && piTime <= endTime){
              System.out.println("小皮同学参加上了秒杀活动");
          }else{
              System.out.println("小皮同学没有参加上秒杀活动");
          }
      }
  }
  ```

##总结

1. 北京时间需要在世界标准时间加上8小时
2. 计算机中时间原点

      1970年1月1日 00:00:00

  3.时间换算单位

    1秒 = 1000毫秒

  4.Date类概述

     Date 代表了一个特定的时间，精确到**毫秒**

  5.如何创建时间对象?

    通过Date的构造方法，空参构造和带参构造，带参构造参数：是自1970年1月1日00:00:00经过的毫秒数

6.如何格式化和解析日期

   通过SimpleDateFormat，创建SimpleDateFormat类:new SimpleDateFormat("日期模式")

   格式化:format(Date string)

   解析: parse(String date)

---

Calendar日历类
Calendar类提供了方法可以直接对日历中的年、月、日、时、分、秒等进行运算。

​```java
public class Test4Calendar {
    public static void main(String[] args) {
        // 目标：掌握Calendar的使用和特点。
        // 1、得到系统此刻时间对应的日历对象。
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2、获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // 3、拿到日历中记录的日期对象。
        Date d = now.getTime();
        System.out.println(d);

        // 4、拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 5、修改日历中的某个信息
        now.set(Calendar.MONTH, 9); // 修改月份成为10月份。
        now.set(Calendar.DAY_OF_YEAR, 125); // 修改成一年中的第125天。
        System.out.println(now);

        // 6、为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        now.add(Calendar.DAY_OF_MONTH, 6);
        now.add(Calendar.HOUR, 12);
        now.set(2026, 11, 22);
        System.out.println(now);
    }
}
  ```



## 为什么JDK8要新增日期类

```java
/**
 *  目标：搞清楚为什么要用JDK 8开始新增的时间类。
 */
public class Test {
    public static void main(String[] args) {
        // 传统的时间类（Date、SimpleDateFormat、Calendar）存在如下问题：
        // 1、设计不合理，使用不方便，很多都被淘汰了。
        Date d = new Date();
        //System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 2、都是可变对象，修改后会丢失最开始的时间信息。

        // 3、线程不安全。

        // 4、不能精确到纳秒，只能精确到毫秒。
        // 1秒 = 1000毫秒
        // 1毫秒 = 1000微秒
        // 1微秒 = 1000纳秒
    }
}
```





## JDK8日期、时间、日期时间

为什么以前的Date类就可以表示日期，为什么要有新增的日期类呢？原因如下

![1667400465054](img\1667400465054.png)

JDK8新增的日期类分得更细致一些，比如表示年月日用LocalDate类、表示时间秒用LocalTime类、而表示年月日时分秒用LocalDateTime类等；除了这些类还提供了对时区、时间间隔进行操作的类等。它们几乎把对日期/时间的所有操作都通过了API方法，用起来特别方便。

![1667400655334](img\1667400655334.png)



- LocalDate类的基本使用

```java
public class Test1_LocalDate {
    public static void main(String[] args) {
        // 0、获取本地日期对象(不可变对象)
        LocalDate ld = LocalDate.now(); // 年 月 日
        System.out.println(ld);

        // 1、获取日期对象中的信息
        int year = ld.getYear(); // 年
        int month = ld.getMonthValue(); // 月(1-12)
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue(); // 星期几
        System.out.println(year);
        System.out.println(day);
        System.out.println(dayOfWeek);

        // 2、直接修改某个信息: withYear、withMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 5、获取指定日期的LocalDate对象： public static LocalDate of(int year, int month, int dayOfMonth)
        LocalDate ld8 = LocalDate.of(2099, 12, 12);
        LocalDate ld9 = LocalDate.of(2099, 12, 12);

        // 6、判断2个日期对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ld8.equals(ld9));// true
        System.out.println(ld8.isAfter(ld)); // true
        System.out.println(ld8.isBefore(ld)); // false
    }
}
```

- LocalTime类的基本使用

```java
public class Test2_LocalTime {
    public static void main(String[] args) {
        // 0、获取本地时间对象
        LocalTime lt = LocalTime.now(); // 时 分 秒 纳秒 不可变的
        System.out.println(lt);

        // 1、获取时间中的信息
        int hour = lt.getHour(); //时
        int minute = lt.getMinute(); //分
        int second = lt.getSecond(); //秒
        int nano = lt.getNano(); //纳秒

        // 2、修改时间：withHour、withMinute、withSecond、withNano
        LocalTime lt3 = lt.withHour(10);
        LocalTime lt4 = lt.withMinute(10);
        LocalTime lt5 = lt.withSecond(10);
        LocalTime lt6 = lt.withNano(10);

        // 3、加多少：plusHours、plusMinutes、plusSeconds、plusNanos
        LocalTime lt7 = lt.plusHours(10);
        LocalTime lt8 = lt.plusMinutes(10);
        LocalTime lt9 = lt.plusSeconds(10);
        LocalTime lt10 = lt.plusNanos(10);

        // 4、减多少：minusHours、minusMinutes、minusSeconds、minusNanos
        LocalTime lt11 = lt.minusHours(10);
        LocalTime lt12 = lt.minusMinutes(10);
        LocalTime lt13 = lt.minusSeconds(10);
        LocalTime lt14 = lt.minusNanos(10);

        // 5、获取指定时间的LocalTime对象：
        // public static LocalTime of(int hour, int minute, int second)
        LocalTime lt15 = LocalTime.of(12, 12, 12);
        LocalTime lt16 = LocalTime.of(12, 12, 12);

        // 6、判断2个时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(lt15.equals(lt16)); // true
        System.out.println(lt15.isAfter(lt)); // false
        System.out.println(lt15.isBefore(lt)); // true

    }
}
```

- LocalDateTime类的基本使用

```java
public class Test3_LocalDateTime {
    public static void main(String[] args) {
        // 0、获取本地日期和时间对象。
        LocalDateTime ldt = LocalDateTime.now(); // 年 月 日 时 分 秒 纳秒
        System.out.println(ldt);

        // 1、可以获取日期和时间的全部信息
        int year = ldt.getYear(); // 年
        int month = ldt.getMonthValue(); // 月
        int day = ldt.getDayOfMonth(); // 日
        int dayOfYear = ldt.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue();  // 获取是周几
        int hour = ldt.getHour(); //时
        int minute = ldt.getMinute(); //分
        int second = ldt.getSecond(); //秒
        int nano = ldt.getNano(); //纳秒

        // 2、修改时间信息：
        // withYear withMonth withDayOfMonth withDayOfYear withHour
        // withMinute withSecond withNano
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(59);

        // 3、加多少:
        // plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMinutes(3);

        // 4、减多少：
        // minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
        LocalDateTime ldt6 = ldt.minusYears(2);
        LocalDateTime ldt7 = ldt.minusMinutes(3);


        // 5、获取指定日期和时间的LocalDateTime对象：
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour,
        //                                  int minute, int second, int nanoOfSecond)
        LocalDateTime ldt8 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 1222);
        LocalDateTime ldt9 = LocalDateTime.of(2029, 12, 12, 12, 12, 12, 1222);

        // 6、 判断2个日期、时间对象，是否相等，在前还是在后： equals、isBefore、isAfter
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt9.isAfter(ldt));
        System.out.println(ldt9.isBefore(ldt));

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime time)
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        LocalDateTime ldt10 = LocalDateTime.of(ld, lt);

    }
}
```

## 1.Collection集合

### 1.1数组和集合的对比【记忆】

+ 相同点

  都是容器,可以存储多个数据

+ 不同点

  + 数组的长度是不可变的,集合的长度是可变的

  + 数组可以存基本数据类型和引用数据类型

    集合只能存引用数据类型,如果要存基本数据类型,需要存对应的包装类

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollectonDemo1 {
    public static void main(String[] args) {
        //数组可以存储基本数据类型也可以存储引用数据类型
        int [] arr1 = {1,2,3};
        String [] arr2 = {"a","b","c"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);

        //如果集合要存储基本数据类型,那么实际存储的是他们的包装类
        //ArrayList<int> list2 = new ArrayList<int>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);//
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}
```

### 1.2集合类体系结构【熟悉】

![](img\01_集合类体系结构图.jpg)

### 1.3Collection 常用方法【重点】

1.什么是Collection集合(顶级接口和特点单列)

   Collection是单列集合的顶级接口，它没有直接的具体实现类，有两个子接口List和Set

2.如何创建Collection集合对象（Collection和ArrayList的**关系**）

+ 多态的方式
+ 具体的实现类ArrayList

3.Collection集合常用方法

| 方法名                        | 说明                |
| :------------------------- | :---------------- |
| boolean add(E e)           | 添加元素              |
| boolean remove(Object o)   | 从集合中移除指定的元素       |
| boolean removeIf(Object o) | 根据条件进行移除          |
| void   clear()             | 清空集合中的元素          |
| boolean contains(Object o) | 判断集合中是否存在指定的元素    |
| boolean isEmpty()          | 判断集合是否为空          |
| int   size()               | 集合的长度，也就是集合中元素的个数 |

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectonDemo2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
//        boolean add(E e)		添加元素
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        //System.out.println(collection);
        //method1(collection);
        //method2(collection);
        //method3(collection);
        //method4(collection);
        //method5(collection);
        //method6(collection);


    }

    private static void method6(Collection<String> collection) {
        //        int size()			集合的长度，也就是集合中元素的个数
        int size = collection.size();
        System.out.println(size);
    }

    private static void method5(Collection<String> collection) {
        //        boolean isEmpty()		判断集合是否为空
        collection.clear();
        boolean result = collection.isEmpty();
        System.out.println(result);
    }

    private static void method4(Collection<String> collection) {
        //        boolean contains(Object o)	判断集合中是否存在指定的元素
        boolean result = collection.contains("a");
        System.out.println(result);


        boolean result2 = collection.contains("aaa");
        System.out.println(result2);
    }

    private static void method3(Collection<String> collection) {
        //        void clear()			清空集合
        //就是将集合中所有的元素全部删除.
        collection.clear();
        System.out.println(collection);
    }

    private static void method2(Collection<String> collection) {
        //        boolean removeif(Object o)	根据条件进行删除
        //removeif底层会遍历集合,得到集合中的每一个元素
        //s依次表示集合中的每一个元素
        //就会把这每一个元素都到lambda表达式中去判断一下
        //如果返回的是true,则删除
        //如果返回的是false,则保留不删除.


        //boolean test(String t);
        collection.removeIf(
                (String s)->{
                    return s.length() == 3;
                }

        );
        System.out.println(collection);
    }

    private static void method1(Collection<String> collection) {
        //        boolean remove(Object o)	    从集合中移除指定的元素
        //如果删除成功了,则返回true
        //如果删除失败了,则返回false
        boolean result1 = collection.remove("aaa");
        boolean result2 = collection.remove("ddd");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(collection);
    }
}
```

### 1.4Collection-迭代器的基本使用【重点】

1. **迭代**器 的作用

​       用于集合的遍历（迭代器就是一个对象）

   2.如何创建迭代器

​     Iterator<E> iterator(): 返回此集合中元素的迭代器,该迭代器器对象默认指向当前集合0索引

   3.Iterator中的常用方法

​	boolean hasNext(): 判断当前位置是否有元素可以被取出
​	E next(): 获取当前位置的元素,同时将迭代器对象移向下一个索引位置 

   4.Collection集合的遍历

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectonDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");


        //1,获得迭代器的对象
        //迭代器对象一旦被创建出来,默认指向集合的0索引处
        Iterator<String> it = list.iterator();


        //利用迭代器里面的方法进行遍历
        //当前位置是否有元素可以被取出
//        System.out.println(it.hasNext());
//        //取出当前位置的元素  + 将迭代器往后移动一个索引的位置
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());


        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
}
```

### 1.5 迭代器的原理分析【重点、难点】

**迭代器原理**(**三个方法**)
 ①. Iterator<E> iterator(): 获取迭代器对象,默认指向0索引
 ②. boolean hasNext():判断当前位置是否有元素可以被取出
 ③. E next(): 获取当前位置的元素,将迭代器对象移向下一个索引位置

![1596532947471](img\1596532947471.png)

```java
        while(it.hasNext()){
            System.out.println(it.next());
        }
```

#### ==1.5.1 迭代器的注意事项==

一个迭代器只能使用一次

### 1.6 迭代器中删除的方法【重点】

​	void remove(): 删除迭代器对象当前指向的元素

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectonDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                //指向谁,那么此时就删除谁.
                it.remove();
            }
        }
        System.out.println(list);
    }
}
```

#### 1.6.1 ==迭代器的应用场景==

遍历时删除集合中的元素

### 1.7 增强for循环-基本应用【重点】

1.增强for的作用

简化**数组**和Collection**集合**的遍历,比迭代器简单也比for循环也简单

2.如何使用？

​	for(集合/数组中元素的数据类型 变量名 :  集合/数组名) {

​		// 已经将当前遍历到的元素封装到变量中了,直接使用变量即可

​	}

3.增强for的原理

它是JDK5之后出现的,其内部原理是一个Iterator迭代器**(数组是for，集合为Iterator)**

4.增强for的应用场景 

实现Iterable接口的类才可以使用迭代器和增强for(**数组**)

![image-20201214215242894](img\image-20201214215242894.png)

代码

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectonDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        //1,数据类型一定是集合或者数组中元素的类型
        //2,str仅仅是一个变量名而已,在循环的过程中,依次表示集合或者数组中的每一个元素
        //3,list就是要遍历的集合或者数组.
        for(String str : list){
            System.out.println(str);
        }
    }
}
```

### 1.8 增强for-注意事项和三种遍历的应用场景【记忆】

1.注意事项

在增强for循环中无法改变数组或集合中的元素（iterator）

2.三种遍历方式使用场景
 增强for:
     对集合进行只要简单遍历时使用
 普通for:
     遍历过程中需要操作索引时使用
 迭代器:
     遍历过程中需要删除元素时使用

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectonDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//
//        for(String str : list){
//            str = "q";
//            System.out.println(str);
//        }
        for (String s : list) {
            System.out.println(s);
        }

        //System.out.println(list);
    }
}

```

### 1.9 Collection练习【重点】

**注意**：增强for可以操作数组和集合，而迭代器只能操作集合

```java
package com.itheima.mycollectiondemo1;

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

```java
package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectonDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("小皮同学",23);
        Student s2 = new Student("小路同学",31);
        Student s3 = new Student("小贾同学",33);

        list.add(s1);
        list.add(s2);
        list.add(s3);


        //迭代器的方式进行遍历
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("-------------------------");
        //增强for
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
```

## 2.List集合 

### 2.1List集合的概述和特点【记忆】

+ List集合的特点
  + 存取有序
  + 可以重复
  + 有索引

```java
package com.itheima.mylistdemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");




        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("---------------------");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
```

### 2.2List集合的特有方法【重点】

+ 方法介绍

  | 方法名                             | 描述                  |
  | ------------------------------- | ------------------- |
  | void add(int index,E   element) | 在此集合中的指定位置插入指定的元素   |
  | E remove(int   index)           | 删除指定索引处的元素，返回被删除的元素 |
  | E set(int index,E   element)    | 修改指定索引处的元素，返回被修改的元素 |
  | E get(int   index)              | 返回指定索引处的元素          |

+ 示例代码

  ```java
  package com.itheima.mylistdemo1;

  import java.util.ArrayList;
  import java.util.List;

  public class MyListDemo2 {
      public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          list.add("aaa");
          list.add("bbb");
          list.add("ccc");
        //method1(list);
          //method2(list);
          //method3(list);
          //method4(list);
      }

    private static void method4(List<String> list) {
          //        E get(int index)		返回指定索引处的元素
          String s = list.get(0);
          System.out.println(s);
      }

      private static void method3(List<String> list) {
          //        E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        //被替换的那个元素,在集合中就不存在了.
          String result = list.set(0, "qqq");
          System.out.println(result);
          System.out.println(list);
      }

      private static void method2(List<String> list) {
          //        E remove(int index)		删除指定索引处的元素，返回被删除的元素
          //在List集合中有两个删除的方法
          //第一个 删除指定的元素,返回值表示当前元素是否删除成功
        //第二个 删除指定索引的元素,返回值表示实际删除的元素
          String s = list.remove(0);
          System.out.println(s);
          System.out.println(list);
      }

      private static void method1(List<String> list) {
          //        void add(int index,E element)	在此集合中的指定位置插入指定的元素
          //原来位置上的元素往后挪一个索引.
          list.add(0,"qqq");
          System.out.println(list);
      }
  }
  ```

## 3.数据结构

### 3.1数据结构之栈和队列【记忆】

- 栈结构

  ![1599301003669](img\1599301003669.png)

  ![](img\viQV7f.png)

  ​	先进后出

- 队列结构

  ![1599302416105](img\1599302416105.png)

  ![](img\4003936-25a8643454e46bd4.jpg)

  ​	先进先出

### 3.2数据结构之数组和链表【记忆】

- 数组结构（内存，下标）

  数组的特点

     查询快、增删慢

- 链表结构（内存,下标）

  1. 什么是链表

   ![1596035919109](img\1596035919109.png)

  ​	![1596035986111](img\1596035986111.png)

  1. 链表的特点

     查询慢、增删快

## 4.ArrayList源码解析【了解】

```java
/**
 *默认的初始容量 10
 */
private static final int DEFAULT_CAPACITY = 10;

/**
 * 空数组实例
 */
private static final Object[] EMPTY_ELEMENTDATA = {};

/**
 * 默认的空数组实例
 */
private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

/**
 * 如果利用的是集合的空参构造创建集合对象,则会把默认的空数组实例DEFAULTCAPACITY_EMPTY_ELEMENTDATA赋值给elementData,
 并且在第一次添加元素的时候,把数组的容量设置为10
 */
transient Object[] elementData; // non-private to simplify nested class access

/**
 * 集合中实际存储的元素个数
 */
private int size;
```

![1596037395914](img\1596037395914.png)

1.ArrayList底层是一个数组

2.当初始化ArrayList，数组的长度为0

3.当第一次添加的时候，数组的长度为10

4.以后添加时，如果数组的长度不满足时，进行扩容 ，按1.5来进行扩容

5.扩容之后，将原数组中的元素拷贝到新的数组中

## 5.List集合的实现类

### 5.1LinkedList-基本应用【了解】

- ArrayList集合的特点

  ​	底层是**数组结构**实现，查询快、增删慢

- LinkedList集合特点

  ​	底层是**链表结构**实现，查询慢、增删快

比较添加

```java
package com.itheima.mylistdemo1;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<String>  list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------------------------");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
```

### 5.2LinkedList集合的特有功能【了解】

- 特有方法

  | 方法名                       | 说明               |
  | ------------------------- | ---------------- |
  | public void addFirst(E e) | 在该列表开头插入指定的元素    |
  | public void addLast(E e)  | 将指定的元素追加到此列表的末尾  |
  | public E getFirst()       | 返回此列表中的第一个元素     |
  | public   E getLast()      | 返回此列表中的最后一个元素    |
  | public E removeFirst()    | 从此列表中删除并返回第一个元素  |
  | public   E removeLast()   | 从此列表中删除并返回最后一个元素 |

- 示例代码

  ```java
  package com.itheima.mylistdemo1;

  import java.util.LinkedList;

  public class MyLinkedListDemo4 {
      public static void main(String[] args) {
          LinkedList<String> list = new LinkedList<>();
          list.add("aaa");
        list.add("bbb");
          list.add("ccc");
  //        public void addFirst​(E e)	在该列表开头插入指定的元素
        //method1(list);

  //        public void addLast​(E e)	将指定的元素追加到此列表的末尾
          //method2(list);
  ```


  //        public E getFirst​()		返回此列表中的第一个元素
  //        public E getLast​()		返回此列表中的最后一个元素
          //method3(list);


  //        public E removeFirst​()		从此列表中删除并返回第一个元素
  //        public E removeLast​()		从此列表中删除并返回最后一个元素
          //method4(list);


      }

      private static void method4(LinkedList<String> list) {
          String first = list.removeFirst();
        System.out.println(first);
    
          String last = list.removeLast();
          System.out.println(last);
    
          System.out.println(list);
      }
    
      private static void method3(LinkedList<String> list) {
          String first = list.getFirst();
          String last = list.getLast();
          System.out.println(first);
        System.out.println(last);
      }
    
      private static void method2(LinkedList<String> list) {
          list.addLast("www");
          System.out.println(list);
      }
    
      private static void method1(LinkedList<String> list) {
          list.addFirst("qqq");
          System.out.println(list);
      }
  }


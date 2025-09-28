## 1.包装类

### 1.1 基本类型包装类（记忆）

- 基本类型包装类的作用

   将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据

   常用的操作之一：用于基本数据类型与字符串之间的转换

- 基本类型对应的包装类

  | 基本数据类型  | 包装类       |
  | ------- | --------- |
  | byte    | Byte      |
  | short   | Short     |
  | int     | Integer   |
  | long    | Long      |
  | float   | Float     |
  | double  | Double    |
  | char    | Character |
  | boolean | Boolean   |

### 1.2 Integer类（应用）

- Integer类概述

   包装一个对象中的原始类型 int 的值

- Integer类构造方法

  | 方法名                                     | 说明                           |
  | --------------------------------------- | ---------------------------- |
  | public Integer(int   value)             | 根据 int 值创建 Integer 对象(过时)    |
  | public Integer(String s)                | 根据 String 值创建 Integer 对象(过时) |
  | public static Integer valueOf(int i)    | 返回表示指定的 int 值的 Integer   实例  |
  | public static Integer valueOf(String s) | 返回一个保存指定值的 Integer 对象 String |

- 示例代码

  ```java
  public class IntegerDemo {
      public static void main(String[] args) {
          //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
          Integer i1 = new Integer(100);
          System.out.println(i1);

          //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
          Integer i2 = new Integer("100");
  //        Integer i2 = new Integer("abc"); //NumberFormatException
          System.out.println(i2);
          System.out.println("--------");

          //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
          Integer i3 = Integer.valueOf(100);
          System.out.println(i3);

          //public static Integer valueOf(String s)：返回一个保存指定值的Integer对象 String
          Integer i4 = Integer.valueOf("100");
          System.out.println(i4);
      }
  }
  ```

### 1.3 自动拆箱和自动装箱（理解）

- 自动装箱

  ​	把基本数据类型转换为对应的包装类类型

- 自动拆箱

  ​	把包装类类型转换为对应的基本数据类型

- 示例代码

  ```java
  Integer i = 100;  // 自动装箱
  i += 200;         // i = i + 200;  i + 200 自动拆箱；i = i + 200; 是自动装箱
  ```

### 1.4 int和String类型的相互转换（记忆）

- int转换为String

  - 转换方式

    - 方式一：直接在数字后加一个空字符串
    - 方式二：通过String类静态方法valueOf()

  - 示例代码

    ```java
    public class IntegerDemo {
        public static void main(String[] args) {
            //int --- String
            int number = 100;
            //方式1
            String s1 = number + "";
            System.out.println(s1);
            //方式2
            //public static String valueOf(int i)
            String s2 = String.valueOf(number);
            System.out.println(s2);
            System.out.println("--------");
        }
    }
    ```

- String转换为int

  - 转换方式

    - 方式一：先将字符串数字转成Integer，再调用valueOf()方法
    - 方式二：通过Integer静态方法parseInt()进行转换

  - 示例代码

    ```java
    public class IntegerDemo {
        public static void main(String[] args) {
            //String --- int
            String s = "100";
            //方式1：String --- Integer --- int
            Integer i = Integer.valueOf(s);
            //public int intValue()
            int x = i.intValue();
            System.out.println(x);
            //方式2
            //public static int parseInt(String s)
            int y = Integer.parseInt(s);
            System.out.println(y);
        }
    }
    ```

### 1.5 字符串数据排序案例（应用）

- 案例需求

  ​	有一个字符串：“91 27 46 38 50”，把其中的每一个数取出来存到int类型的数组中

- 代码实现

  ```java
  public class IntegerTest {
      public static void main(String[] args) {
          //定义一个字符串
          String s = "91 27 46 38 50";

          //把字符串中的数字数据存储到一个int类型的数组中
          String[] strArray = s.split(" ");
  //        for(int i=0; i<strArray.length; i++) {
  //            System.out.println(strArray[i]);
  //        }

          //定义一个int数组，把 String[] 数组中的每一个元素存储到 int 数组中
          int[] arr = new int[strArray.length];
          for(int i=0; i<arr.length; i++) {
              arr[i] = Integer.parseInt(strArray[i]);
          }

        	for(int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
      	}
  }
  ```

## 2.数组的高级操作 

### 2.1 二分查找 (理解)

+ 二分查找概述

  查找指定元素在数组中的位置时,以前的方式是通过遍历,逐个获取每个元素,看是否是要查找的元素,这种方式当数组元素较多时,查找的效率很低

  二分查找也叫折半查找,每次可以去掉一半的查找范围,从而提高查找的效率

  二分查找使用的前提是必须要求数组是有序的.


+ 需求

  在数组{1,2,3,4,5,6,7,8,9,10}中,查找某个元素的位置

+ 实现步骤

  1. 定义两个变量，表示要查找的范围。默认min = 0 ，max = 最大索引
  2. 循环查找，但是min <= max
  3. 计算出mid的值
  4. 判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引
  5. 如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找
  6. 如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找
  7. 当min > max 时，表示要查找的元素在数组中不存在，返回-1.

+ 代码实现

  ```java
  public class MyBinarySearchDemo {
      public static void main(String[] args) {
          int [] arr = {1,2,3,4,5,6,7,8,9,10};
          int number = 11;

          //1,我现在要干嘛? --- 二分查找
          //2.我干这件事情需要什么? --- 数组 元素
          //3,我干完了,要不要把结果返回调用者 --- 把索引返回给调用者
          int index = binarySearchForIndex(arr,number);
          System.out.println(index);
      }

      private static int binarySearchForIndex(int[] arr, int number) {
          //1,定义查找的范围
          int min = 0;
          int max = arr.length - 1;
          //2.循环查找 min <= max
          while(min <= max){
              //3.计算出中间位置 mid
              int mid = (min + max) >> 1;
              //mid指向的元素 > number
              if(arr[mid] > number){
                  //表示要查找的元素在左边.
                  max = mid -1;
              }else if(arr[mid] < number){
                  //mid指向的元素 < number
                  //表示要查找的元素在右边.
                  min = mid + 1;
              }else{
                  //mid指向的元素 == number
                  return mid;
              }
          }
          //如果min大于了max就表示元素不存在,返回-1.
          return -1;
      }
    
  }
  ```

+ 注意事项

  有一个前提条件，数组内的元素一定要按照大小顺序排列，如果没有大小顺序，是不能使用二分查找法的

### 2.2 冒泡排序 (理解)

+ 冒泡排序概述

  一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，依次对所有的数据进行操作，直至所有数据按要求完成排序

  如果有n个数据进行排序，总共需要比较n-1次

  每一次比较完毕，下一次的比较就会少一个数据参与

+ 代码实现

  ```java
  public class MyBubbleSortDemo2 {
      public static void main(String[] args) {
          int[] arr = {3, 5, 2, 1, 4};
          //1 2 3 4 5
          bubbleSort(arr);
      }

      private static void bubbleSort(int[] arr) {
          //外层循环控制的是次数 比数组的长度少一次.
          for (int i = 0; i < arr.length -1; i++) {
              //内存循环就是实际循环比较的
              //-1 是为了让数组不要越界
              //-i 每一轮结束之后,我们就会少比一个数字.
              for (int j = 0; j < arr.length - 1 - i; j++) {
                  if (arr[j] > arr[j + 1]) {
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }
          }

          printArr(arr);
      }

      private static void printArr(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
          }
          System.out.println();
      }
    
  }
  ```

## 3.递归

### 3.1 递归【应用】

- 递归的介绍

  - 以编程的角度来看，递归指的是方法定义中调用方法本身的现象
  - 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
  - 递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算

- 递归的基本使用

  ```java
  public class MyFactorialDemo2 {
      public static void main(String[] args) {
          int sum = getSum(100);
          System.out.println(sum);
      }

      private static int getSum(int i) {
          //1- 100之间的和
              //100 + (1-99之间的和)
                      // 99 + (1- 98之间的和)
                          //....
                              //1
          //方法的作用: 求 1- i 之间和
          if(i == 1){
              return 1;
          }else{
              return i + getSum(i -1);
          }
      }
  }    
  ```

- 递归的注意事项

  - 递归一定要有出口。否则内存溢出
  - 递归虽然有出口，但是递归的次数也不宜过多。否则内存溢出

### 3.2 递归求阶乘【应用】

- 案例需求

  ​	用递归求5的阶乘，并把结果在控制台输出

- 代码实现

  ```java
  public class DiGuiDemo01 {
      public static void main(String[] args) {
          //调用方法
          int result = jc(5);
          //输出结果
          System.out.println("5的阶乘是：" + result);
      }

      //定义一个方法，用于递归求阶乘，参数为一个int类型的变量
      public static int jc(int n) {
          //在方法内部判断该变量的值是否是1
          if(n == 1) {
              //是：返回1
              return 1;
          } else {
              //不是：返回n*(n-1)!
              return n*jc(n-1);
          }
      }
  }
  ```

- 内存图

  ![08_递归内存图](img\08_递归内存图.png)

## 

### 3.3 Arrays (应用)

- Arrays的常用方法

  | 方法名                                      | 说明                |
  | ---------------------------------------- | ----------------- |
  | public static String toString(int[] a)   | 返回指定数组的内容的字符串表示形式 |
  | public static void sort(int[] a)         | 按照数字顺序排列指定的数组     |
  | public static int binarySearch(int[] a, int key) | 利用二分查找返回指定元素的索引   |

- 示例代码

  ```java
  public class MyArraysDemo {
        public static void main(String[] args) {
    //        public static String toString(int[] a)    返回指定数组的内容的字符串表示形式
    //        int [] arr = {3,2,4,6,7};
    //        System.out.println(Arrays.toString(arr));

    //        public static void sort(int[] a)	  按照数字顺序排列指定的数组
    //        int [] arr = {3,2,4,6,7};
    //        Arrays.sort(arr);
    //        System.out.println(Arrays.toString(arr));

    //        public static int binarySearch(int[] a, int key) 利用二分查找返回指定元素的索引
            int [] arr = {1,2,3,4,5,6,7,8,9,10};
            int index = Arrays.binarySearch(arr, 0);
            System.out.println(index);
            //1,数组必须有序
            //2.如果要查找的元素存在,那么返回的是这个元素实际的索引
            //3.如果要查找的元素不存在,那么返回的是 (-插入点-1)
                //插入点:如果这个元素在数组中,他应该在哪个索引上.
        }
    }
  ```

- 工具类设计思想

  1. 构造方法用 private 修饰
  2. 成员用 public static 修饰

## 4.异常

### 4.1 异常的体系结构和分类（记忆）

1.什么是异常？

异常就是程序出现了不正常的情况

**注意：**语法错误不算在异常体系中

2.异常的体系结构

![01_异常体系结构](img\01_异常体系结构.png)

```java
//除RuntimeException之外的异常
public class ExceptionDemo1 {
    public static void main(String[] args)  {
//        int [] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException


//        String s = null;
//        System.out.println(s.equals("嘿嘿"));//NullPointerException

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        sdf.parse("2048-1月1日");//ParseException
    }
}
```

 3.编译时异常和运行时异常的区别（记忆）

- 编译时异常

  - 都是Exception类及其子类
  - 必须显式处理(手动处理)，否则程序就会发生错误，无法通过编译

- 运行时异常

  - 都是RuntimeException类及其子类
  - 无需显式处理(手动处理)，也可以和编译时异常一样处理

- 图示

  ![02_编译时异常和运行时异常](img\02_编译时异常和运行时异常.png)

### 4.2 JVM默认处理异常的方式（记忆）

1.如果程序出现了问题，我们没有做任何处理，最终JVM 会做默认的处理，处理方式有如下两个步骤：

- 把异常的名称，错误原因及异常出现的位置等信息输出在了控制台

- 程序停止执行

  ![1595944550721](img\1595944550721.png)

```java
package com.itheima.exce;


public class ExceptionDemo2 {
    public static void main(String[] args){
        //思考:控制台为什么会有这样的红色字体呢? 是谁打印的?
        int [] arr = {1,2,3,4,5};
        System.out.println(arr[10]);//当代码出现了异常,那么就在这里创建了一个异常对象.
                                    //new ArrayIndexOutOfBoundsException();
                                    //首先会看,程序中有没有自己处理异常的代码.
                                    //如果没有,交给本方法的调用者处理.
                                    //最终这个异常会交给虚拟机默认处理.
                                    //JVM默认处理异常做了哪几件事情:
                                    //1,将异常信息以红色字体展示在控制台上.
                                    //2,停止程序运行. --- 哪里出现了异常,那么程序就在哪里停止,下面的代码不执行了.
        System.out.println("嘿嘿嘿,我最帅");



    }
}
```



### 4.3throws方式处理异常（重点）

1.定义格式  声明异常->说明一下有异常

```java
public void 方法() throws 异常类名 {
    
}
```

示例代码

```java
package com.itheima.exce;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo6 {
    public static void main(String[] args) throws ParseException {
        method1(); //此时调用者也没有处理.还是会交给虚拟机处理.
        method2(); //还是继续交给调用者处理.而main方法的调用者是虚拟机还是会采取虚拟机默认处理异常的方法.
    }

    //告诉调用者,你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常,那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理.
    private static void method1() /*throws NullPointerException*/ {
        int [] arr = null;
        for (int i = 0; i < arr.length; i++) {//出现的空指针异常,还是由虚拟机创建出来的.
            System.out.println(arr[i]);
        }
    }

    //告诉调用者,你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常,那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理.
    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        sdf.parse("2048-10月10日");
    }
}
```

### 4.4 throws方式处理异常-注意事项（了解）

**简单来说:**编译时的异常，必须声明，谁调用谁处理，最后让jvm来处理，运行时异常可以不声明

```java
package com.itheima.exce;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo6 {
    public static void main(String[] args) throws ParseException {
        method1(); //此时调用者也没有处理.还是会交给虚拟机处理.
        method2(); //还是继续交给调用者处理.而main方法的调用者是虚拟机还是会采取虚拟机默认处理异常的方法.
    }

    //告诉调用者,你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常,那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理.
    //如果声明的异常是一个运行时异常,那么声明的代码可以省略
    private static void method1() /*throws NullPointerException*/ {
        int [] arr = null;
        for (int i = 0; i < arr.length; i++) {//出现的空指针异常,还是由虚拟机创建出来的.
            System.out.println(arr[i]);
        }
    }

    //告诉调用者,你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常,那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理.
    //如果声明的异常是一个编译时异常,那么声明的代码必须要手动写出.
    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        sdf.parse("2048-10月10日");
    }
}

```

### 4.5 throw抛出异常 (重点) 

  1.格式

​	throw new 异常();

  2.注意

​	这个格式是在**方法内**的，表示当前代码**手动抛出**一个异常，下面的代码无法再执行了

3.抛出处理异常的意义

   1.在方法中,当传递的参数有误时,没有继续运行的必要了，采取抛出处理,表示该方法结束

1. 告诉调用者方法中出现了问题

4.throws和throw的区别

| throws                  | throw               |
| ----------------------- | ------------------- |
| 用在方法声明后面，跟的是异常类名        | 用在方法体内，跟的是异常对象名     |
| 表示声明异常，调用该方法有可能会出现这样的异常 | 表示手动抛出异常对象(百分百抛出异常) |
| 可以声明多个异常                | 只能有一个               |

示例代码

```java
package com.itheima.exce;
public class ExceptionDemo7 {
    public static void main(String[] args) {
        System.out.println("家里有一个貌美如花的老婆");
      System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要?");
        throw new RuntimeException(); //当代码执行到这里,就创建一个异常对象
                                    //该异常创建之后,暂时没有手动处理.抛给了调用者处理
                                    //下面的代码不会再执行了.
        //System.out.println("武大郎的标准生活");
    }
}
```

```java
 package com.itheima.exce;
  public class ExceptionDemo8 {
      public static void main(String[] args) {
          //int [] arr = {1,2,3,4,5};
          int [] arr = null;
          printArr(arr);//就会 接收到一个异常.
                          //我们还需要自己处理一下异常.
      }
 private static void printArr(int[] arr) {
      if(arr == null){
          //调用者知道成功打印了吗?
          //System.out.println("参数不能为null");
          throw new NullPointerException(); //当参数为null的时候
                                              //手动创建了一个异常对象,抛给了调用者.
      }else{
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
          }
      }
  }
}
```


### 4.6 try-catch自己处理异常（重点）

- 定义格式

  ```java
  try {
  	可能出现异常的代码;
  } catch(异常类名 变量名) {
  	异常的处理代码;
  }
  ```

- 执行流程

  - 程序从 try 里面的代码开始执行
  - 出现异常，就会跳转到对应的 catch 里面去执行
  - 执行完毕之后，程序还可以继续往下执行

- 示例代码

  ```java
  package com.itheima.exce;

  public class ExceptionDemo9 {
      public static void main(String[] args) {

          //好处:为了能让代码继续往下运行.
          int [] arr = null;
          try{
              //有肯能发现异常的代码
              printArr(arr);
          }catch (NullPointerException e){
              //如果出现了这样的异常,那么我们进行的操作
              System.out.println("参数不能为null");
          }


          System.out.println("嘿嘿嘿,我最帅!!!");

      }

      private static void printArr(int[] arr) {
          if(arr == null){
              throw new NullPointerException();
          }else{
              for (int i = 0; i < arr.length; i++) {
                  System.out.println(arr[i]);
              }
          }
      }
  }
  ```

  ### 4.7 try-catch常见问题【记忆】

  1. 如果 try 中没有遇到问题，怎么执行？

     会把try中所有的代码全部执行完毕,不会执行catch里面的代码

  2. 如果 try 中遇到了问题，那么 try 下面的代码还会执行吗？

     那么直接跳转到对应的catch语句中,try下面的代码就不会再执行了
     当catch里面的语句全部执行完毕,表示整个体系全部执行完全,继续执行下面的代码

  3. 如果出现的问题没有被捕获，那么程序如何运行？

     那么try...catch就相当于没有写.那么也就是自己没有处理.
     默认交给虚拟机处理.

  4. 同时有可能出现多个异常怎么处理？

     出现多个异常,那么就写多个catch就可以了.
     注意点:如果多个异常之间存在子父类关系.那么父类一定要写在下面


```java
package com.itheima.exce;

import java.util.Scanner;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        //1.如果 try 中没有遇到问题，怎么执行？ --- 会把try中所有的代码全部执行完毕,不会执行catch里面的代码
        //2.如果 try 中遇到了问题，那么 try 下面的代码还会执行吗？
                            //那么直接跳转到对应的catch语句中,try下面的代码就不会再执行了
                            //当catch里面的语句全部执行完毕,表示整个体系全部执行完全,继续执行下面的代码
        //3.如果出现的问题没有被捕获，那么程序如何运行？
                             //那么try...catch就相当于没有写.那么也就是自己没有处理.
                             //默认交给虚拟机处理.
        //4.同时有可能出现多个异常怎么处理？
                            //出现多个异常,那么就写多个catch就可以了.
                            //注意点:如果多个异常之间存在子父类关系.那么父类一定要写在下面
        // method1();
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        String line = sc.nextLine();
        int age = Integer.parseInt(line);//格式化异常
        System.out.println(age);
        System.out.println(2 / 0); //数学异常
    } catch (Exception e) {
        //以后我们针对于每种不同的异常,有可能会有不同的处理结果.
    }
    System.out.println("测试456");
}

private static void method1() {
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        String line = sc.nextLine();
        int age = Integer.parseInt(line);//格式化异常
        System.out.println(age);
        System.out.println(2 / 0); //数学异常
    } catch (NumberFormatException e) {
        System.out.println("格式化异常出现了");
    }catch (ArithmeticException e) {
        System.out.println("数学运算异常出现了");
    }
    System.out.println("测试456");
}
```

### 4.7 Throwable中的常见方法（重点）

- 常用方法

  | 方法名                               | 说明                     |
  | --------------------------------- | ---------------------- |
  | public String getMessage()        | 返回此 throwable 的详细消息字符串 |
  | public String toString()          | 返回此可抛出的简短描述            |
  | **public void printStackTrace()** | **把异常的错误信息输出在控制台**     |

- 示例代码

  ```java
  package com.itheima.exce;


  public class ExceptionDemo11 {
      //public String getMessage​()    返回此 throwable 的详细消息字符串
      //public String toString​()      返回此可抛出的简短描述
    //public void printStackTrace​() 把异常的错误信息输出在控制台(字体为红色的)
      public static void main(String[] args) {

          try {
              int [] arr = {1,2,3,4,5};
              System.out.println(arr[10]);//虚拟机帮我们创建了一个异常对象 new ArrayIndexOutOfBoundsException();
          } catch (ArrayIndexOutOfBoundsException e) {
              /*String message = e.getMessage();
            System.out.println(message);*/
             /* String s = e.toString();
              System.out.println(s);*/
             e.printStackTrace();
        }

          System.out.println("嘿嘿嘿");

    }
  }
  ```

### 4.8 异常的练习 (重点) 

![1595865869495](img\1595865869495.png)

+ 需求

  键盘录入学生的姓名和年龄,其中年龄为18 - 25岁,超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止

+ 实现步骤

  1. 创建学生对象
  2. 键盘录入姓名和年龄，并赋值给学生对象
  3. 如果是非法数据就再次录入

+ 代码实现

  学生类

  ```java
  package com.itheima.exce;

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
          if(age >= 18 && age <= 25){
              this.age = age;
          }else{
              throw new RuntimeException("年龄超出了范围");
            
          }
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
 package com.itheima.exce;

  
import java.util.Scanner;
  
  public class ExceptionDemo12 {
      public static void main(String[] args) {
          // 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
          // 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
  
          Student s = new Student();
  
          Scanner sc = new Scanner(System.in);
          System.out.println("请输入姓名");
          String name = sc.nextLine();
          s.setName(name);
         while(true){
             System.out.println("请输入年龄");
             String ageStr = sc.nextLine();
             try {
                 int age = Integer.parseInt(ageStr);
                 s.setAge(age);
                 break;
             } catch (NumberFormatException e) {
                 System.out.println("请输入一个整数");
                 continue;
             } catch (AgeOutOfBoundsException e) {
                 System.out.println(e.toString());
                 System.out.println("请输入一个符合范围的年龄");
                 continue;
             }
             /*if(age >= 18 && age <=25){
               s.setAge(age);
                 break;
             }else{
                 System.out.println("请输入符合要求的年龄");
                 continue;
             }*/
         }
          System.out.println(s);
  
      }
  }
```

### 4.9 自定义异常（重点）

1.什么是自定义异常？

当Java中提供的异常不能满足我们的需求时,我们可以自定义异常

2.为什么要 自定义异常？

   有一个原则 ：异常类要与业务相关

3.实现步骤

1. 定义异常类
2. 写继承关系
3. 提供空参构造
4. 提供带参构造

代码实现

异常类

```java
public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
```

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
        if(age >= 18 && age <= 25){
            this.age = age;
        }else{
            //如果Java中提供的异常不能满足我们的需求,我们可以使用自定义的异常
            throw new AgeOutOfBoundsException("年龄超出了范围");
        }
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
public class ExceptionDemo12 {
    public static void main(String[] args) {
        // 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
        // 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。

        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        s.setName(name);
       while(true){
           System.out.println("请输入年龄");
           String ageStr = sc.nextLine();
           try {
               int age = Integer.parseInt(ageStr);
               s.setAge(age);
               break;
           } catch (NumberFormatException e) {
               System.out.println("请输入一个整数");
               continue;
           } catch (AgeOutOfBoundsException e) {
               System.out.println(e.toString());
               System.out.println("请输入一个符合范围的年龄");
               continue;
           }
           /*if(age >= 18 && age <=25){
               s.setAge(age);
               break;
           }else{
               System.out.println("请输入符合要求的年龄");
               continue;
           }*/
       }
        System.out.println(s);

    }
}
```

##      小结

​        **1.什么是异常**

​          程序中的不正常称为异常

​        **2.异常的分类**

​          编译期异常和运行时异常

​        **3.谁处理异常?**

​           原则上谁调用谁处理，不想处理throws声明异常

​           实际开发过程中尽量不要让jvm来处理异常

​        **4.如何捕获异常**

​           通过try...catch来捕获

​        **5.如何手动抛出异常**

​           throw new 异常类()

​        **6.为什么要自定义异常**

​          在实际开发过程中有很多异常是jdk没有帮我们定义好的，比如age负数或超出范围异常，因此我们需要根据实际的业务自定义异常

​		**7.如何自定义异常**

​          继承RuntimeException，调用父类中的带参构造方法


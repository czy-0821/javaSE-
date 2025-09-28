## 1.泛型

### 1.1泛型概述

- 泛型的介绍

  ​	泛型是JDK5中引入的特性，它提供了编译时类型安全检测机制

- 泛型的好处

  1. 把运行时期的问题提前到了编译期间
  2. 避免了强制类型转换

- 泛型的定义格式

  - <类型>: 指定一种类型的格式.尖括号里面可以任意书写,一般只写一个字母.例如: <E> <T>
  - <类型1,类型2…>: 指定多种类型的格式,多种类型之间用逗号隔开.例如: <E,T> <K,V>

## 2.Set集合

### 2.1Set集合概述和特点【应用】

+ 不可以存储重复元素
+ 没有索引,不能使用普通for循环遍历

### 2.2Set集合的使用【应用】

存储字符串并遍历

```java
public class MySet1 {
    public static void main(String[] args) {
      	//创建集合对象
        Set<String> set = new TreeSet<>();
      	//添加元素
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

//        for (int i = 0; i < set.size(); i++) {
//            //Set集合是没有索引的，所以不能使用通过索引获取元素的方法
//        }
      
      	//遍历集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
```

## 3.TreeSet集合

### 3.1TreeSet集合概述和特点【应用】

+ 不可以存储重复元素
+ 没有索引
+ 可以将元素按照规则进行排序
  + TreeSet()：根据其元素的自然排序进行排序
  + TreeSet(Comparator comparator) ：根据指定的比较器进行排序

### 3.2TreeSet集合基本使用【应用】

存储Integer类型的整数并遍历

```java
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        //遍历集合
        for(Integer i : ts) {
            System.out.println(i);
        }
    }
}
```

### 3.3自然排序Comparable的使用【应用】

- 案例需求

  - 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
  - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

- 实现步骤

  1. 使用空参构造创建TreeSet集合
     + 用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
  2. 自定义的Student类实现Comparable接口
     + 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
  3. 重写接口中的compareTo方法
     + 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写

- 代码实现

  学生类

  ```java
  public class Student implements Comparable<Student>{
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

      @Override
      public int compareTo(Student o) {
          //按照对象的年龄进行排序
          //主要判断条件: 按照年龄从小到大排序
          int result = this.age - o.age;
          //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
          result = result == 0 ? this.name.compareTo(o.getName()) : result;
          return result;
      }
  }
  ```

  测试类

  ```java
  public class MyTreeSet2 {
      public static void main(String[] args) {
          //创建集合对象
          TreeSet<Student> ts = new TreeSet<>();
  	    //创建学生对象
          Student s1 = new Student("zhangsan",28);
          Student s2 = new Student("lisi",27);
          Student s3 = new Student("wangwu",29);
          Student s4 = new Student("zhaoliu",28);
          Student s5 = new Student("qianqi",30);
  		//把学生添加到集合
          ts.add(s1);
          ts.add(s2);
          ts.add(s3);
          ts.add(s4);
          ts.add(s5);
  		//遍历集合
          for (Student student : ts) {
              System.out.println(student);
          }
      }
  }
  ```

### 3.4比较器排序Comparator的使用【应用】

- 案例需求

  - 存储老师对象并遍历，创建TreeSet集合使用带参构造方法
  - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

- 实现步骤

  - 用TreeSet集合存储自定义对象，带参构造方法使用的是比较器排序对元素进行排序的
  - 比较器排序，就是让集合构造方法接收Comparator的实现类对象，重写compare(T o1,T o2)方法
  - 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写

- 代码实现

  老师类

  ```java
  public class Teacher {
      private String name;
      private int age;

      public Teacher() {
      }

      public Teacher(String name, int age) {
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
          return "Teacher{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  '}';
      }
  }
  ```

  测试类

  ```java
  public class MyTreeSet4 {
      public static void main(String[] args) {
        	//创建集合对象
          TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
              @Override
              public int compare(Teacher o1, Teacher o2) {
                  //o1表示现在要存入的那个元素
                  //o2表示已经存入到集合中的元素
                
                  //主要条件
                  int result = o1.getAge() - o2.getAge();
                  //次要条件
                  result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                  return result;
              }
          });
  		//创建老师对象
          Teacher t1 = new Teacher("zhangsan",23);
          Teacher t2 = new Teacher("lisi",22);
          Teacher t3 = new Teacher("wangwu",24);
          Teacher t4 = new Teacher("zhaoliu",24);
  		//把老师添加到集合
          ts.add(t1);
          ts.add(t2);
          ts.add(t3);
          ts.add(t4);
  		//遍历集合
          for (Teacher teacher : ts) {
              System.out.println(teacher);
          }
      }
  }
  ```

### 3.5两种比较方式总结【理解】

+ 两种比较方式小结
  + 自然排序: 自定义类实现Comparable接口,重写compareTo方法,根据返回值进行排序
  + 比较器排序: 创建TreeSet对象的时候传递Comparator的实现类对象,重写compare方法,根据返回值进行排序
  + 在使用的时候,默认使用自然排序,当自然排序不满足现在的需求时,必须使用比较器排序
+ 两种方式中关于返回值的规则
  + 如果返回值为负数，表示当前存入的元素是较小值，存左边
  + 如果返回值为0，表示当前存入的元素跟集合中元素重复了，不存
  + 如果返回值为正数，表示当前存入的元素是较大值，存右边

## 4.数据结构

### 4.1二叉树【了解】

1.二叉树中的专业名词

   1.节点

​    ![1596608002746](img\1596608002746.png)

   2.度

  ![1596608070117](img\1596608070117.png)

  3.什么是二叉树

​    ![1596608183292](img\1596608183292.png)

  4.什么是二叉树的树高

​     二叉树的层高就是二叉树的树高

  ![1596608264567](img\1596608264567.png)

 5.二叉树中的其它专业名词

![01_二叉树结构图](img\01_二叉树结构图.png)

### 4.2二叉查找树【了解】

1.什么是二叉查找树



![1596608734792](img\1596608734792.png)

2.节点到二叉树再到二叉查找树的演进

![1596608874445](img\1596608874445.png)



3.二叉查找树结构图

![02_二叉查找树结构图](img\02_二叉查找树结构图.png)

### 4.3 数据结构-二叉查找树添加节点（了解）

1.添加规则

​	小的存左边

​	大的存右边

​	一样的不存

### 4.4平衡二叉树【了解】

+ 什么是平衡二叉树

  ![1596609990793](img\1596609990793.png)

###  4.5 平衡二叉树-左旋 【了解】

1.平衡二叉树旋转触发的时机

​    当添加一个节点之后,该树不再是一颗平衡二叉树

 2.左旋

+ 就是将根节点的右侧往左拉,原先![05_平衡二叉树左旋01](file:///D:/%E7%8F%AD%E7%BA%A7/92%E6%9C%9F/day07-%E9%9B%86%E5%90%88/day07-%E9%9B%86%E5%90%88/%E7%AC%94%E8%AE%B0/img/05_%E5%B9%B3%E8%A1%A1%E4%BA%8C%E5%8F%89%E6%A0%91%E5%B7%A6%E6%97%8B01.png?lastModify=1750558207)节点,并把多余的左子节点出让,给已经降级的根节点当右子节点

![05_平衡二叉树左旋01](img\05_平衡二叉树左旋01.png)

![](img\左旋-02.png)



### 4.6 平衡二叉树-右旋 【了解】

+ 就是将根节点的左侧往右拉,左子节点变成了新的父节点,并把多余的右子节点出让,给已经降级根节点当左子节点

  ![06_平衡二叉树右旋01](img\06_平衡二叉树右旋01.png)


![](img\右旋02.png)

### 4.7 平衡二叉树-小结(了解)

  （共3点）

​    1.二叉查找树和平衡二叉树

平衡二叉树和二叉查找树对比结构图

![07_平衡二叉树和二叉查找树对比结构图](img\07_平衡二叉树和二叉查找树对比结构图.png)

   2.左旋

![1596611483764](img\1596611483764.png)

​																									![1596611611213](img\1596611611213.png)																																														

3.右旋

![1596611652376](img\1596611652376.png)

​																									![1596611674962](img\1596611674962.png)







#### 二叉树总结：

1.左分支小于根节点

2.右分支大于根节点

3.右分支过长触发左旋

4.左分支过长触发右旋

### 4.8 平衡二叉树-左左和左右【了解】

+ 左左

  + 左左: 当根节点左子树的左子树有节点插入,导致二叉树不平衡

  + 如何旋转: 直接对整体进行右旋即可

    ![08_平衡二叉树左左](img\08_平衡二叉树左左.png)

    ​

![](\img\左左02.jpg)

+ 左右

  + 左右: 当根节点左子树的右子树有节点插入,导致二叉树不平衡
  + 如何旋转: 先在左子树对应的节点位置进行左旋,在对整体进行右旋

  ![1596613653235](img\1596613653235.png)

  ![1596613671579](img\1596613671579.png)

  ![1596613744110](img\1596613744110.png)

  ![1596613791603](img\1596613791603.png)

### 4.9 平衡二叉树-右右和右左【了解】

+ 右右

  + 右右: 当根节点右子树的右子树有节点插入,导致二叉树不平衡

  + 如何旋转: 直接对整体进行左旋即可

    ![10_平衡二叉树右右](img\10_平衡二叉树右右.png)

    ​								![1596613505093](img\1596613505093.png)	


+ 右左

  + 右左:当根节点右子树的左子树有节点插入,导致二叉树不平衡

  + 如何旋转: 先在右子树对应的节点位置进行右旋,在对整体进行左旋


    ![1596613918426](img\1596613918426.png)

![1596613936883](img\1596613936883.png)

![1596613970077](img\1596613970077.png)

![1596613991376](img\1596613991376.png)

### 4.10 小结【了解】

![1596614127066](img\1596614127066.png)

树里面每一个元素称之为节点,当每一个子节点的数量小于等于2的时候,这样的树就是二叉树.

其中,子节点的数量有个专业名词,叫 度,每一个子节点中,它的度,是小于等于2的.

二叉树在添加节点的时候是没有规律的,所以在查找的时候,需要一个一个的遍历查找,效率很低,所以为了提高效率,就有了二叉查找树.

那么在二叉查找树添加节点的时候,需要从根节点开始判断,小的存左边,大的存右边,一样就不存,这样就会提高效率.

但是呢,二叉查找树它不能保持平衡,一旦左右两个子树高度差太大,也是会影响效率的,所以就有了第三种树,平衡二叉树.

平衡二叉树在添加节点的时候,他多做了一件事,除了要在根节点判断之外,每一次添加节点之后,他还要看是否破坏了二叉树的平衡,如果破坏平衡了,就会触发旋转机制来保持平衡.

## 5.红黑树 

### 5.1红黑树-概述【了解】

  1.什么是红黑树

​     平衡二叉B树，每一个节点可以是红或者黑，红黑树不是**高度平衡**的,它的平衡是通过"自己的红黑规则"进行实现的。

![](img\红黑树概述.png)



### 5.2 红黑树-红黑规则 (了解) 

- 红黑树的红黑规则有哪些

  1. 每一个节点或是红色的,或者是黑色的

  2. 根节点必须是黑色

  3. 所有叶子节点（空的节点被称作叶子节点）都是黑色的

  4. 不能出现两个红色节点相连 的情况

  5. 对每一个节点,从该节点到其所有后代叶节点的简单路径上,均包含相同数目的黑色节点

     ![12_红黑树结构图](img\12_红黑树结构图.png)

###  5.3 红黑树-添加节点的默认颜色（了解)

​			添加节点时,默认为红色,效率高

###   5.4   红黑树-添加节点后，如何保证红黑规则1 【了解】

  ![1596700061293](img\1596700061293.png)



### 5.5 红黑树-添加节点后，如何保证红黑规则2 【了解】

​				（旋转之后，根据规则验证是否是红黑树，总结红黑树添加节点的规则）

![1596700977727](img\1596700977727.png)

### 
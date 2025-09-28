## 1.字符流

### 1.6字符流写数据【重点】（视频06）（2''）

1.字符输出流介绍

Writer: 用于写入字符流的抽象父类

FileWriter: 用于写入字符流的常用子类

2.构造方法

| 方法名                                      | 说明                                    |
| ---------------------------------------- | ------------------------------------- |
| FileWriter(File file)                    | 根据给定的 File 对象构造一个 FileWriter 对象       |
| FileWriter(File file, boolean append)    | 根据给定的 File 对象构造一个 FileWriter 对象,可追加数据 |
| FileWriter(String fileName)              | 根据给定的文件名构造一个 FileWriter 对象            |
| FileWriter(String fileName, boolean append) | 根据给定的文件名构造一个 FileWriter 对象,可追加数据      |

3.成员方法

| 方法名                                      | 说明         |
| ---------------------------------------- | ---------- |
| void   write(int c)                      | 写一个字符      |
| void   write(char[] cbuf)                | 写入一个字符数组   |
| void write(char[] cbuf, int off, int len) | 写入字符数组的一部分 |
| **void write(String str)**               | **写一个字符串** |
| void write(String str, int off, int len) | 写一个字符串的一部分 |

4.字符流写数据的步骤

 ![1597821606647](img\1597821606647.png)

```java
package com.itheima.charstream1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流的对象
        //FileWriter fw = new FileWriter(new File("charstream\\a.txt"));
        FileWriter fw = new FileWriter("charstream\\a.txt");


        /*//写出数据
        //void write​(int c)            写一个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);*/


        //void write​(char[] cbuf)      写出一个字符数组
       /* char [] chars = {97,98,99,100,101};
        fw.write(chars);*/


        //void write​(char[] cbuf, int off, int len)    写出字符数组的一部分
        /*char [] chars = {97,98,99,100,101};
        fw.write(chars,0,3);*/


        //void write​(String str)       写一个字符串
       /* String line = "黑马程序员abc";
        fw.write(line);*/


        //void write​(String str, int off, int len)     写一个字符串的一部分
        String line = "黑马程序员abc";
        fw.write(line,0,2);

        //释放资源
        fw.close();


    }
}
```

### 1.7 字符流写数据注意事项【了解】（（视频07））(4'')

 ![1597821847408](img\1597821847408.png)

```java
package com.itheima.charstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("charstream\\a.txt");
        //fw.write("黑马程序员");
        //fw.write(97);
        fw.write("97");
        fw.close();
    }
}
```

### 1.8 字符流-flush和close()方法 【重点】（视频08）(5'')

刷新和关闭的方法

| 方法名     | 说明                                  |
| ------- | ----------------------------------- |
| flush() | 刷新流，之后还可以继续写数据                      |
| close() | 关闭流，释放资源，但是在关闭之前会先写出数据。一旦关闭，就不能再写数据 |

代码演示

```java
package com.itheima.charstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        //flush()刷新流。刷新完毕之后，还可以继续写数据
        //close()关闭流。释放资源。一旦关闭，就不能写数据

        FileWriter fw = new FileWriter("charstream\\a.txt");

        fw.write("黑马程序员");
        //fw.flush();
        fw.write("666");
        //fw.flush();

        fw.close();

        fw.write("aaa");//Stream closed
    }
}
```

### 1.9字符流读数据【重点】 (视频09) （8‘’）

1.字符输入流介绍

Reader: 用于读取字符流的抽象父类

FileReader: 用于读取字符流的常用子类

2.构造方法

| 方法名                         | 说明                                   |
| --------------------------- | ------------------------------------ |
| FileReader(File file)       | 在给定从中读取数据的 File 的情况下创建一个新 FileReader |
| FileReader(String fileName) | 在给定从中读取数据的文件名的情况下创建一个新 FileReader    |

3.成员方法

| 方法名                   | 说明          |
| --------------------- | ----------- |
| int read()            | 一次读一个字符数据   |
| int read(char[] cbuf) | 一次读一个字符数组数据 |

4.字符流读数据的步骤

   1.创建字符输入流对象

​    2.调用读数据方法

   3.释放资源

5.字符流读数据注意事项

- 创建对象

  文件必须存在

- 释放资源

  必须关闭流

代码演示

```java
package com.itheima.charstream1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流的对象
       // FileReader fr = new FileReader(new File("charstream\\a.txt"));
        FileReader fr = new FileReader("charstream\\a.txt");


        //读取数据
        //一次读取一个字符
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char) ch);
        }

        //释放资源
        fr.close();
    }
}
```

```java
package com.itheima.charstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo7 {
    public static void main(String[] args) throws IOException {
        //一次读取多个字符。

        //创建对象
        FileReader fr = new FileReader("charstream\\a.txt");

        //创建一个数组
        char [] chars = new char[1024];
        int len;

        //read方法还是读取，但是是一次读取多个字符
        //他把读到的字符都存入到chars数组。
        //返回值：表示本次读到了多少个字符。
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        fr.close();
    }
}
```

### 1.10字符流用户注册案例【重点】（视频10）（6‘’）

- 案例需求

  将键盘录入的用户名和密码保存到本地实现永久化存储

  要求用户名独占一行，密码独占一行

- 实现步骤

  - 获取用户输入的用户名和密码
  - 将用户输入的用户名和密码写入到本地文件中
  - 关流,释放资源

- 代码实现

  ```java
  package com.itheima.charstream1;

  import java.io.FileWriter;
  import java.io.IOException;
  import java.util.Scanner;

  public class CharStreamDemo8 {
      public static void main(String[] args) throws IOException {
          //将键盘录入的用户名和密码保存到本地实现永久化存储
          //要求：用户名独占一行，密码独占一行
          //分析：
        //1，实现键盘录入，把用户名和密码录入进来
          Scanner sc = new Scanner(System.in);
          System.out.println("请录入用户名");
          String username = sc.next();
          System.out.println("请录入密码");
          String password = sc.next();

          //2.分别把用户名和密码写到本地文件。
          FileWriter fw = new FileWriter("charstream\\a.txt");
          //将用户名和密码写到文件中
          fw.write(username);
          //表示写出一个回车换行符 windows \r\n  MacOS \r  Linux \n
          fw.write("\r\n");
          fw.write(password);
          //刷新流
          fw.flush();
          //释放资源
          fw.close();
      }
  }
  ```

### 1.11字符缓冲输入流-读取数据【重点】（视频11）（5‘’）

1.字符缓冲流介绍

​	BufferedReader：从字符输入流读取文本，缓冲字符,以提供字符，数组和行的高效读取

2.构造方法

| 方法名                       | 说明          |
| ------------------------- | ----------- |
| BufferedReader(Reader in) | 创建字符缓冲输入流对象 |

代码演示

```java
package com.itheima.charstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo9 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));

        //读取数据
        char [] chars = new char[1024];
        int len;
        while((len = br.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        br.close();
    }
}
```

### 1.12 字符缓冲输出流 【重点】(视频12) （6‘’）

1.字符缓冲输出流介绍：

​	BufferedWriter：  将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入

2.构造方法

| 方法名                        | 说明          |
| -------------------------- | ----------- |
| BufferedWriter(Writer out) | 创建字符缓冲输出流对象 |

3.常用方法

| 方法名                                      | 说明         |
| ---------------------------------------- | ---------- |
| public void write(int c)                 | 写一个字符      |
| public void write(char[] cbuf,  int off,  int len) | 写入字符数组的一部分 |
| public void write(String s,   int off,  int len) | 写一个字符串的一部分 |
| public void flush()                      | 刷新流        |

```java
package com.itheima.charstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo10 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\a.txt"));

        //写出数据
        //实际写出的是97对应的字符a
        bw.write(97);
        bw.write("\r\n");

        //实际写出的是97 - 101 对应的字符 abcde
        char [] chars = {97,98,99,100,101};
        bw.write(chars);
        bw.write("\r\n");

        //实际写的是abc
        bw.write(chars,0,3);
        bw.write("\r\n");

        //会把字符串的内容原样写出
        bw.write("黑马程序员");
        bw.write("\r\n");

        //会把字符串的一部分写出 abcde
        String line = "abcdefg";
        bw.write(line,0,5);

        bw.flush();

        bw.close();

    }
}
```

### 1.13字符缓冲流特有功能【重点】(视频13) （9''）

1.方法介绍

BufferedWriter：

| 方法名            | 说明                     |
| -------------- | ---------------------- |
| void newLine() | 写一行行分隔符，行分隔符字符串由系统属性定义 |

BufferedReader:

| 方法名               | 说明                                       |
| ----------------- | ---------------------------------------- |
| String readLine() | 读一行文字。 结果包含行的内容的字符串，不包括任何行终止字符如果流的结尾已经到达，则为null |

代码演示

```java
package com.itheima.charstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo11 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的特有功能
        //字符缓冲输出流BufferedWrite ： newLine  跨平台的换行符

        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\a.txt"));

        //写出数据
        bw.write("黑马程序员666");
        //跨平台的回车换行
        bw.newLine();
        bw.write("abcdef");
        //跨平台的回车换行
        bw.newLine();
        bw.write("-------------");

        //刷新流
        bw.flush();
        //释放资源
        bw.close();
    }
}
```

```java
package com.itheima.charstream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo12 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的特有功能
        //字符缓冲输入流BufferedReader： readLine 读一整行

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));

        //读取数据
        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();

        //在之前，如果读不到数据，返回-1
        //但是readLine如果读不到数据返回null
        String line4 = br.readLine();
        String line5 = br.readLine();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        
        // 释放资源
        br.close();
    }
}
```

```java
package com.itheima.charstream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo13 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的特有功能
        //字符缓冲输入流BufferedReader： readLine 读一整行

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));


        //使用循环来进行改进
        String line;
        //可以读取一整行数据。一直读，读到回车换行为止。
        //但是他不会读取回车换行符。
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //释放资源
        br.close();

    }
}
```

### 1.14字符缓冲流操作文件中数据排序案例【重点】(视频14) （10‘’）

- 案例需求

  使用字符缓冲流读取文件中的数据，排序后再次写到本地文件

- 实现步骤

  - 将文件中的数据读取到程序中
  - 对读取到的数据进行处理
  - 将处理后的数据添加到集合中
  - 对集合中的数据进行排序
  - 将排序后的集合中的数据写入到文件中

- 代码实现

  ```java
  package com.itheima.charstream1;

  import java.io.*;
  import java.util.Arrays;

  public class CharStreamDemo14 {
      public static void main(String[] args) throws IOException {
          //需求：读取文件中的数据，排序后再次写到本地文件
        //分析：
          //1.要把文件中的数据读取进来。
          BufferedReader br = new BufferedReader(new FileReader("charstream\\sort.txt"));
          //输出流一定不能写在这里，因为会清空文件中的内容
        //BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\sort.txt"));

          String line = br.readLine();
          System.out.println("读取到的数据为" + line);
          br.close();

          //2.按照空格进行切换
          String[] split = line.split(" ");//9 1 2 5 3 10 4 6 7 8
          //3.把字符串类型的数组变成int类型
          int [] arr = new int[split.length];
          //遍历split数组，可以进行类型转换。
          for (int i = 0; i < split.length; i++) {
              String smallStr = split[i];
              //类型转换
              int number = Integer.parseInt(smallStr);
              //把转换后的结果存入到arr中
            arr[i] = number;
          }
          //4.排序
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));
  ```


          //5.把排序之后结果写回到本地 1 2 3 4...
          BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\sort.txt"));
          //写出
        for (int i = 0; i < arr.length; i++) {
              bw.write(arr[i] + " ");
              bw.flush();
          }
          //释放资源
          bw.close();


      }
  }
  ```

### 1.15 IO流小结【了解】（视频15）（3‘’）

+ IO流小结

  ![](.\img\IO流小结.png)


2.转换流

2.1转换流概念【了解】(视频16)（5‘’）

（共2点）

1.什么是转换流？	

- InputStreamReader： 用于将字节输入流转换为字符输入流,父类是Reader

- OutputStreamWriter：用于将字节输出流转换为字符输出流,父类是Writer

![1597844788396](.\img\1597844788396.png)


### 2.2转换流指定编码读写数据【了解】(视频17) （13‘’）

1.为什么会乱码？

​```java
    private static void method1() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\apple\\Desktop\\a.txt");
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.println((char) ch);
        }
        fr.close();
    }
  ```

   读写的编码不一致

2.如何解决呢？

   1.在jdk11之前，使用转换流

   2.在jdk11之后，可以直接使用FileReader

3.使用转换流解决

1.构造方法

| 方法名                                      | 说明                              |
| ---------------------------------------- | ------------------------------- |
| InputStreamReader(InputStream in)        | 使用默认字符编码创建InputStreamReader对象   |
| InputStreamReader(InputStream in,String chatset) | 使用指定的字符编码创建InputStreamReader对象  |
| OutputStreamWriter(OutputStream out)     | 使用默认字符编码创建OutputStreamWriter对象  |
| OutputStreamWriter(OutputStream out,String charset) | 使用指定的字符编码创建OutputStreamWriter对象 |

代码演示

```java
    private static void method2() throws IOException {
        //如何解决乱码现象
        //文件是什么码表,那么咱们就必须使用什么码表去读取.
        //我们就要指定使用GBK码表去读取文件.
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\apple\\Desktop\\a.txt"),"gbk");
        int ch;
        while((ch = isr.read())!=-1){
            System.out.println((char) ch);
        }
        isr.close();


        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\apple\\Desktop\\b.txt"),"UTF-8");
        osw.write("我爱学习,谁也别打扰我");
        osw.close();
    }
```

4.在jkd11之后，使用FileReader

```java
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();

        //在JDK11之后,字符流新推出了一个构造,也可以指定编码表
        FileReader fr = new FileReader("C:\\Users\\apple\\Desktop\\a.txt", Charset.forName("gbk"));
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.println((char) ch);
        }
        fr.close();
    }
```



## 3.对象操作流

### 3.1 对象流的基本特点 【了解】（视频18）（3‘’）

1.对象流的基本特点？

   对象操作流可以将对象以字节的形式写到本地文件中，需要时可以再次用对象操作流读到内存中,直接变成对象

2.为什么要使用对象流？

   **对象的信息保存到磁盘中，如果使用前面所学的知识来实现，会非常的繁琐。使用对象流就非常的方便**

### 3.2对象操作流-序列化【了解】（视频19）（7‘’）

1.对象操作流介绍

![1597851259406](img\1597851259406.png)

- 对象操作输出流（对象序列化流）：ObjectOutputStream

  就是将对象保存到磁盘(本地文件)中，或者在网络中传输对象

- 对象操作输入流（对象反序列化流）： ObjectInputStream

  把写到本地文件中的对象读到内存中，或者接收网络中传输的对象

2.什么是序列化?

   序列化就是将对象转换为字节流，以便存储到特定的存储介质（例如磁盘）的过程

3.什么是反序列化?

   反序列化就是将字节流，转换为对象的过程

4.如何使用对象输出流（对象序化流）

(共3点)

1.构造方法

| 方法名                                  | 说明                                       |
| ------------------------------------ | ---------------------------------------- |
| ObjectOutputStream(OutputStream out) | 创建一个写入指定的OutputStream的ObjectOutputStream |

2.序列化对象的方法

| 方法名                          | 说明                         |
| ---------------------------- | -------------------------- |
| void writeObject(Object obj) | 将指定的对象写入ObjectOutputStream |

示例代码

学生类

```java
package com.itheima.convertedio;

import java.io.Serializable;

//如果想要这个类的对象能被序列化,那么这个类必须要实现一个接口.Serializable

//Serializable 接口的意义
//称之为是一个标记性接口,里面没有任何的抽象方法
//只要一个类实现了这个Serializable接口,那么就表示这个类的对象可以被序列化.
public class User implements Serializable {
    .
    private String username;
    private transient String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
```

测试类

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ConvertedDemo3 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","qwer");
//参数为一个新的字节输出流对象 必须实现Serializable接口，没有必须需要实现的接口。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user);
        oos.close();
    }
}
```

3.注意事项

- 一个对象要想被序列化，该对象所属的类必须必须实现Serializable 接口
- Serializable是一个标记接口，实现该接口，不需要重写任何方法

```java
package cn.itheima.domain;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    public  String password;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```



```java
package cn.itheima;

import cn.itheima.domain.Student;

import java.io.*;

public class TestTransient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //writeStudent();
       readStudent();
    }

    public static void writeStudent() throws IOException {
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("1.txt"));
        Student.password="123";
        Student student = new Student("aaa");
        oos.writeObject(student);
    }
}
```



### 3.2对象反序列化流-反序化【了解】(视频20) （3‘’）

(共2点)

1.回顾什么是对象操作输入流？

​	对象反序列化流： ObjectInputStream

​	ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象

2.如何使用？

1.构造方法

| 方法名                               | 说明                                    |
| --------------------------------- | ------------------------------------- |
| ObjectInputStream(InputStream in) | 创建从指定的InputStream读取的ObjectInputStream |

2.反序列化对象的方法

| 方法名                 | 说明                       |
| ------------------- | ------------------------ |
| Object readObject() | 从ObjectInputStream读取一个对象 |

示例代码

```java
package com.itheima.convertedio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ConvertedDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        User o = (User) ois.readObject();//强转一下
        System.out.println(o);
        ois.close();//随时记得关流

    }
}
```

### 3.3对象操作流-两个注意点（serialVersionUID&transient）【了解】（视频21 视频22）（12‘’）

1.serialVersionUID

- 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？

  - 会出问题，会抛出InvalidClassException异常

    ![](img\serialUID.png)

- 如果出问题了，如何解决呢？

  - 重新序列化
  - 给对象所属的类加一个serialVersionUID 
    - private static final long serialVersionUID = 42L;

2.transient[ˈtrænziənt]

如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？

- 给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程

示例代码

学生类

```java
package com.itheima.convertedio;

import java.io.Serializable;

//如果想要这个类的对象能被序列化,那么这个类必须要实现一个接口.Serializable

//Serializable 接口的意义
//称之为是一个标记性接口,里面没有任何的抽象方法
//只要一个类实现了这个Serializable接口,那么就表示这个类的对象可以被序列化.
public class User implements Serializable {
    //serialVersionUID 序列号
    //如果我们自己没有定义,那么虚拟机会根据类中的信息会自动的计算出一个序列号.
    //问题:如果我们修改了类中的信息.那么虚拟机会再次计算出一个序列号.

    //第一步:把User对象序列化到本地. --- -5824992206458892149
    //第二步:修改了javabean类. 导致 --- 类中的序列号 4900133124572371851
    //第三步:把文件中的对象读到内存. 本地中的序列号和类中的序列号不一致了.

    //解决?
    //不让虚拟机帮我们自动计算,我们自己手动给出.而且这个值不要变.

    private static final long serialVersionUID = 1L;

    private String username;
    private transient String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
```

测试类

```java
package com.itheima.convertedio;

import java.io.*;
import java.util.ArrayList;

public class ConvertedDemo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.写对象
        //2.修改javabean类
        //3.读对象

        //写对象 --- 序列化
        //method1();

        //读对象 --- 反序列化
       method2();

    }

    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));//参数为一个新的字节输入流对象
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void method1() throws IOException {
        User user = new User("zhangsan","qwer");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user);
        oos.close();
    }
}
```

### 3.4对象操作流练习【了解】(视频23) （10‘’）

- 案例需求

  创建多个学生类对象写到文件中,再次读取到内存中

- 实现步骤

  - 创建序列化流对象
  - 创建多个学生对象
  - 将学生对象添加到集合中
  - 将集合对象序列化到文件中
  - 创建反序列化流对象
  - 将文件中的对象数据,读取到内存中

- 代码实现

  学生类

  ```java
  package com.itheima.convertedio;

  import java.io.Serializable;

  public class Student implements Serializable {

    private static final long serialVersionUID = 2L;

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

  测试类(6,7)

  ```java
  package com.itheima.convertedio;

  import java.io.*;

  public class ConvertedDemo6 {
      public static void main(String[] args) throws IOException, ClassNotFoundException {
          Student s1 = new Student("杜子腾",16);
          Student s2 = new Student("张三",23);
          Student s3 = new Student("李四",24);

          ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
          oos.writeObject(s1);
          oos.writeObject(s2);
          oos.writeObject(s3);

          oos.close();
  ```


          ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
          Object obj;
        /*  while((obj = ois.readObject()) != null){
              System.out.println(obj);
          }*/
    
         while(true){
             try {
                 Object o = ois.readObject();
                 System.out.println(o);
             } catch (EOFException e) {
                 break;
             }
         }
          ois.close();
      }
  }
  ```

​```java
package com.itheima.convertedio;

import java.io.*;
import java.util.ArrayList;

public class ConvertedDemo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("杜子腾",16);
        Student s2 = new Student("张三",23);
        Student s3 = new Student("李四",24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //我们往本地文件中写的就是一个集合
        oos.writeObject(list);

        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }
        ois.close();
    }
}
  ```

## 4.Properties集合

### 4.1 Properties -概述【了解】（视频24）（2‘’）

1.Properties介绍

- 是一个Map体系的集合类
- 只存字符串

### 4.2Properties作为Map集合的使用【重点】（视频25）（7‘’）

Properties基本使用

```java
package com.itheima.propertiesio;


import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //增
        prop.put("小龙女","尹志平");
        prop.put("郭襄","杨过");
        prop.put("黄蓉","欧阳克");
        System.out.println(prop);

        //删
        //prop.remove("郭襄");
        //System.out.println(prop);

        //改
        //put --- 如果键不存在,那么就添加,如果键存在,那么就覆盖.
        prop.put("小龙女","杨过");
        System.out.println(prop);
        //查

        //Object value = prop.get("黄蓉");
        //System.out.println(value);

        //遍历
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("========================");

        //装的是所有的键值对对象.
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
```

### 4.2Properties作为Map集合的特有方法【重点】(视频26) （3‘’）

1.特有方法

| 方法名                                      | 说明                                       |
| ---------------------------------------- | ---------------------------------------- |
| Object   setProperty(String key, String value) | 设置集合的键和值，都是String类型，底层调用   Hashtable方法 put |
| String   getProperty(String key)         | 使用此属性列表中指定的键搜索属性                         |
| Set<String>   stringPropertyNames()      | 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串。//获得所有键后再配合getProperty，获得值。 |

示例代码

```java
package com.itheima.propertiesio;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) {
        //Object setProperty​(String key, String value) --- put
                    //设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");

        System.out.println(prop);
        //String getProperty​(String key)  --- get
                    //使用此属性列表中指定的键搜索属性

       /* String value = prop.getProperty("江苏");
        System.out.println(value);*/


        //Set<String> stringPropertyNames​()  --- keySet
                    //从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
```

### 4.3Properties-load【重点】（视频27）（6‘’）

- 和IO流结合的方法

  | 方法名                                | 说明                         |
  | ---------------------------------- | -------------------------- |
  | void   load(Reader reader)    //加载 | 将字符输入流中的数据加载到Properties对象中 |

- 示例代码

  ```java
  public class PropertiesDemo3 {
      public static void main(String[] args) throws IOException {
          //void load(Reader reader)                     将本地文件中的键值对数据读取到集合中
          //void store(Writer writer, String comments)   将集合中的数据以键值对形式保存在本地
          //读取
          Properties prop = new Properties();
          FileReader fr = new FileReader("day11\\prop.properties");
          //调用完了load方法之后,文件中的键值对数据已经在集合中了.
          prop.load(fr);//参数可以写字符输入流对象
          fr.close();

          System.out.println(prop);

      }
  }
  ```





### 4.4Properties-store【重点】(视频28) （3‘’）

和IO流结合的方法

| 方法名                                      | 说明                       |
| ---------------------------------------- | ------------------------ |
| void   store(Writer writer, String comments) | 将Properties集合中的数据存入字符输出流 |

示例代码


```java
package com.itheima.propertiesio;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        //void load​(Reader reader)                     将本地文件中的键值对数据读取到集合中
        //void store​(Writer writer, String comments)   将集合中的数据以键值对形式保存在本地


        Properties prop = new Properties();
        prop.put("zhangsan","123");
        prop.put("lisi","456");
        prop.put("wangwu","789");
    
        FileWriter fw = new FileWriter("prop.properties");
        prop.store(fw,null);
        fw.close();


    }
}
```


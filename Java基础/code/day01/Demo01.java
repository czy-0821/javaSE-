// 单行注释，public 起到限制作用，会要求class后面跟的类名与当前文件名一致!
public class Demo01{
	
	/*
		这是一段多行注释：
			main方法又叫主方法
			是程序执行的入口
			整个方法格式书写是固定的，不能改变的!
	*/
	public static void main(String[] args){
		
		/**
			这是一个文档注释
			System.out.println的效果是打印输出
		*/
		System.out.println("HelloWorld");
		
		System.out.println(123);		// 不是关键字
		System.out.println(true);		//  是关键字
		System.out.println(false);		//  是关键字
	}
}
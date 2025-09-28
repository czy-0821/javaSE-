public class Demo1Continue {
	/*
		continue : 跳过某次循环体内容的执行, 跳过当次循环,进入下次循环
		           当程序执行到continue时,本次循环的循环体剩下部分内容不执行,直接进入到步进表达式
		
		注意：使用是基于条件控制【否则没有意义】, 在循环内部使用.
		
		需求: 模拟电梯上行的过程 1-24层, 4层不停.
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 24; i++){
			
			if(i == 4){
				continue;
			}
			System.out.println(i + "层到了~");
			
		}
		
	}
	
}
import java.util.Scanner;
/*
	循环控制语句：
		break: 结束整个循环
		continue: 跳过本次循环，继续下次循环
*/
public class Demo09{
	public static void main(String[] args){
		// 场景1： 电梯从1~10， 到了6楼不要播报，因为没人按6楼，其他楼层都有人下，需要报个号
		for(int i = 1; i <= 10; i++){
			if(i == 6){
				continue;	
			}
			System.out.println(i + "层到了....");
		}
		
		System.out.println("-----------------------");
		
		// 场景2： 电梯从1~10， 到了3楼出现故障,后续无法运行了...
		for(int i = 1; i <= 10; i++){
			if(i == 3){
				break;	
			}
			System.out.println(i + "层到了....");
		}
	}
}
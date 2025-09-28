import java.util.Scanner;

/*
	(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入 
	(2)涨工资的条件如下： 
		工龄 工资涨幅 
			[10-15) +5000 // [ 是包括的意思 ) 是不包括的意思 [10-15) 代表 10岁到15岁 ,包含10,不包含15 
			[5-10) +2500 
			[3~5) +1000 
			[1~3) +500 
			[0~1) +200 
	(3)如果用户输入的工龄为10，基本工资为3000，那么程序运行后打印格式如下:
		"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
*/
public class Homework08{
	public static void main(String[] args){
		
		//1. 拿到用户输入的工龄和基本工资
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入工龄：");
		int workAge = sc.nextInt();
		System.out.println("请输入基本工资：");
		int baseSalary = sc.nextInt();
		
		//应涨薪工资
		int bonus = 0;
		
		//2. 判断工龄，修改涨薪
		if(workAge >= 10 && workAge < 15){
			bonus = 5000;
		}else if(workAge >= 5 && workAge < 10){
			bonus = 2500;
		}else if(workAge >= 3 && workAge < 5){
			bonus = 1000;
		}else if(workAge >= 1 && workAge < 3){
			bonus = 500;
		}else if(workAge >= 0 && workAge < 1){
			bonus = 200;
		}else{
			System.out.println("您的工龄不满足涨薪要求!");
		}
		
		//3. 打印最终结果
		System.out.println("您目前工作了"+workAge+"年，基本工资为 "+baseSalary+"元, 应涨工资 "+bonus+"元,涨后工资 "+(baseSalary + bonus)+"元");
	
	}
	
}
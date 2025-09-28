import java.util.Scanner;

public class Demo14{
	
	/*
		if-else if
	*/
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的分数：");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100){
			System.out.println("优秀");
		}else if(score >= 80 && score <= 89){
			System.out.println("良好");
		}else if(score >= 70 && score <= 79){
			System.out.println("中等");
		}else if(score >= 60 && score <= 69){
			System.out.println("及格");
		}else if(score >= 0 && score <= 59){
			System.out.println("请努力加油!");
		}else{
			System.out.println("成绩有误!");
		}
		
		System.out.println("end...");
	}
	
}
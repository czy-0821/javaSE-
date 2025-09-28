
import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("请输入班级人数:");
		int number = sc.nextInt();
		int[] arr = new int[number];
		int sum=0,max=0,min=100,count=0;
		double ave=0;
		System.out.println("请继续输入学生成绩:");
		for(int i=0;i<arr.length;i++){
			System.out.println("第"+(i+1)+"个学生成绩为:");
			arr[i] = sc.nextInt();
			sum+=arr[i];
			if(arr[i]>=max)max=arr[i];
			if(arr[i]<=min)min = arr[i];
			if(arr[i]<60)count++;
		}
		ave = sum/arr.length;
		System.out.println("班级总成绩为:"+sum+'\n'+"班级平均分为:"+ave+'\n'
		+"最高分为:"+max+'\n'+"最低分为:"+min+'\n'+"不及格人数为:"+count);
		
	}
}
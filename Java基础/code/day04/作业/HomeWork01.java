
/*：现某某班级安排了一场考试, 成绩分别是 10 20 30 40 50 60 , 请将数据存入数组, 并计
算出班级平均分*/


public class HomeWork01{
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60};
		int sum=0;
		for(int i = 0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("班级平均分为:"+(sum/arr.length));
		
	}
}
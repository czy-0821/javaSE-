public class ForForDemo{
	
	public static void main(String[] args)throws Exception{
		
		//核心规律: 内层循环跑一圈, 外层循环走一步
		
		//外层循环表示时针的范围
		for(int hour = 0; hour <= 23; hour++){
			//内层循环表示分针的范围
			for(int minute = 0; minute <= 59; minute++){
				for(int second = 0; second <= 59; second++){
					System.out.println(hour+"时"+minute+"分"+second+"秒");
					//睡一秒
					Thread.sleep(1000);
				}
			}
			
		}
		
		
	}
	
}

/*
	循环嵌套
*/
public class Demo11{
	public static void main(String[] args)throws Exception{
		
		while(true){
			for(int hour = 0; hour <= 23; hour++){
				// 分针跑一圈，时针走一步
				for(int minute = 0; minute <= 59; minute++){
					//秒针跑一圈，分针走一步
					for(int seconds = 0; seconds <= 59; seconds++){
						System.out.println(hour + " 时， " +minute+ " 分，" + seconds + " 秒 ");
						Thread.sleep(1000);		//让程序隔着停顿1秒
					}
				}
			}
		
		}

	}
}
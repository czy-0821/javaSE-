
/*
	ѭ��Ƕ��
*/
public class Demo11{
	public static void main(String[] args)throws Exception{
		
		while(true){
			for(int hour = 0; hour <= 23; hour++){
				// ������һȦ��ʱ����һ��
				for(int minute = 0; minute <= 59; minute++){
					//������һȦ��������һ��
					for(int seconds = 0; seconds <= 59; seconds++){
						System.out.println(hour + " ʱ�� " +minute+ " �֣�" + seconds + " �� ");
						Thread.sleep(1000);		//�ó������ͣ��1��
					}
				}
			}
		
		}

	}
}
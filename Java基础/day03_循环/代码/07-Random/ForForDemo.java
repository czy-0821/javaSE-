public class ForForDemo{
	
	public static void main(String[] args)throws Exception{
		
		//���Ĺ���: �ڲ�ѭ����һȦ, ���ѭ����һ��
		
		//���ѭ����ʾʱ��ķ�Χ
		for(int hour = 0; hour <= 23; hour++){
			//�ڲ�ѭ����ʾ����ķ�Χ
			for(int minute = 0; minute <= 59; minute++){
				for(int second = 0; second <= 59; second++){
					System.out.println(hour+"ʱ"+minute+"��"+second+"��");
					//˯һ��
					Thread.sleep(1000);
				}
			}
			
		}
		
		
	}
	
}
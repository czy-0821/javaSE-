public class Demo2Break {
	/*
		break : ��ֹѭ�������ݵ�ִ��
		ע�⣺ʹ���ǻ����������Ƶ�
				break���ֻ����ѭ����switch�н���ʹ��.
				
		����: ģ��20�깤����80��, 60������.
	*/
	public static void main(String[] args){
		
		for(int age = 20; age <= 80; age++){
			if(age == 60){
				break;
			}
			
			System.out.println("����ϰ�..");	
			
		}
		System.out.println("HelloJava");
	}
}
public class Demo1Continue {
	/*
		continue : ����ĳ��ѭ�������ݵ�ִ��, ��������ѭ��,�����´�ѭ��
		           ������ִ�е�continueʱ,����ѭ����ѭ����ʣ�²������ݲ�ִ��,ֱ�ӽ��뵽�������ʽ
		
		ע�⣺ʹ���ǻ����������ơ�����û�����塿, ��ѭ���ڲ�ʹ��.
		
		����: ģ��������еĹ��� 1-24��, 4�㲻ͣ.
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 24; i++){
			
			if(i == 4){
				continue;
			}
			System.out.println(i + "�㵽��~");
			
		}
		
	}
	
}
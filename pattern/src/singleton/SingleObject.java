package singleton;

public class SingleObject {

	//����SingleObject��һ������
	private static SingleObject instance = null;
	
	//�ù��캯��Ϊprivate,��������Ͳ��ᱻʵ����
	private SingleObject() {}
	
	//��ȡΨһ���õĶ���
	public static SingleObject getInstance() {
		synchronized (SingleObject.class) {
			if(instance == null)
				instance = new SingleObject();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
	
}

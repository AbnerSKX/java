package proxy;

import org.junit.jupiter.api.Test;

public class ProxyDemo {

	@Test
	void test() {
		 Image image = new ProxyImage("test_10mb.jpg");
		 
	      // ͼ�񽫴Ӵ��̼���
	      image.display(); 
	      System.out.println("");
	      // ͼ����Ҫ�Ӵ��̼���
	      image.display();  
	}
}

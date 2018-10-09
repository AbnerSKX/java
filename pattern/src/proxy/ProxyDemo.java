package proxy;

import org.junit.jupiter.api.Test;

public class ProxyDemo {

	@Test
	void test() {
		 Image image = new ProxyImage("test_10mb.jpg");
		 
	      // 图像将从磁盘加载
	      image.display(); 
	      System.out.println("");
	      // 图像不需要从磁盘加载
	      image.display();  
	}
}

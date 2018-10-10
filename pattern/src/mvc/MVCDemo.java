package mvc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MVCDemo {

	@Test
	void test() {
		 Student model = new Student();
		 model.setName("Robert");
		 model.setRollNo("10");
		 
		 StudentView view = new StudentView();
		 StudentController controller = new StudentController(model, view);
		 controller.updateView();
		 
		 controller.setStudentName("John");
		 controller.updateView();
	}

}

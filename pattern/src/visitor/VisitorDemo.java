package visitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VisitorDemo {

	@Test
	void test() {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}

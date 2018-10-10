package iterator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteratorDemo {

	@Test
	void test() {

		NameRepository nameRepository = new NameRepository();
		
		for(Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
			System.out.println("Name: " + iterator.next());
		}
	}

}

package interpreter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterpreterDemo {

	@Test
	void test() {
		 Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();
	 
	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " 
	      + isMarriedWoman.interpret("Married Julie"));
	}
	//����Robert �� John ������
	   public static Expression getMaleExpression(){
	      Expression robert = new TerminalExpression("Robert");
	      Expression john = new TerminalExpression("John");
	      return new OrExpression(robert, john);    
	   }
	 
	   //����Julie ��һ���ѻ��Ů��
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TerminalExpression("Julie");
	      Expression married = new TerminalExpression("Married");
	      return new AndExpression(julie, married);    
	   }
}
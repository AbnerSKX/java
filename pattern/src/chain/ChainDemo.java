package chain;

import org.junit.jupiter.api.Test;

public class ChainDemo {

	private static AbstractLogger getChainOfLoggers() {
		  AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
	      
	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);
	      
	      return errorLogger; 
	}
	@Test
	void test() {
		AbstractLogger loggerChain = getChainOfLoggers();
		 
	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");
	 
	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");
	 
	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	}
}

package chp12.exceptions;
import java.util.logging.*;
import java.io.*;

//class LoggingException extends Exception {
//	private static Logger logger = 
//			Logger.getLogger("LoggingException2");
//	public LoggingException() {
//		StringWriter trace = new StringWriter();
//		printStackTrace(new PrintWriter(trace));
//		logger.severe(trace.toString());
//	}
//}

public class LoggingExceptions2 {
	private static Logger logger = 
			Logger.getLogger("LoggingExceptions");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//其他异常加入到日志
		try {
			throw new NullPointerException();
		} catch(NullPointerException e) {
			logException(e);
		}
	}
}

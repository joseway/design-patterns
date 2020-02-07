package com.adaming.chain;

public abstract class AbstractLogger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void logMessage(int level, String message) {
		if(this.level <= level) {
			writeMessage(message);
		}
		if(nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}
	public abstract void writeMessage(String message);
	
	public void setNextLogger(AbstractLogger next) {
		this.nextLogger = next;
	}
}

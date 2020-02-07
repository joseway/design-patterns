package com.adaming.chain;

public class ConsoleLogger extends AbstractLogger{

	@Override
	public void writeMessage(String message) {
		System.out.println("Message a la console " + message);		
	}
	public ConsoleLogger(int level) {
		this.level = level;
	}

}

package com.adaming.chain;

public class ErrorLogger extends AbstractLogger{
	public ErrorLogger(int level) {
		this.level = level;
	}
	@Override
	public void writeMessage(String message) {
		System.out.println("Message d'erreur " + message);
	}

}

package com.adaming.chain;

public class FileLogger extends AbstractLogger{

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void writeMessage(String message) {
		System.out.println("Message lecture fichier " + message);
		
	}

}

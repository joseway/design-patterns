package com.adaming.chain;

public class ChainLoggerApp {
	public static void main(String[] args) {
		AbstractLogger log = loggers();
		log.logMessage(AbstractLogger.INFO, "Requete traitee");
		log.logMessage(AbstractLogger.DEBUG, "Oups, une erreur s'est produite");
		log.logMessage(AbstractLogger.ERROR, "Systeme a l'arret");
	}
	public static AbstractLogger loggers() {
		AbstractLogger al = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fl = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger cl = new ConsoleLogger(AbstractLogger.INFO);
		al.setNextLogger(fl);
		fl.setNextLogger(cl);
		
		return al;
	}
}

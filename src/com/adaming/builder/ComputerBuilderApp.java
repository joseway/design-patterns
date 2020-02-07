package com.adaming.builder;

public class ComputerBuilderApp {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("intel hdd", 16.0)
								//.setBluetoothEnable(true)
								.setGraphicsEnabled(true)
								.build();
		System.out.println(comp);
	}
}

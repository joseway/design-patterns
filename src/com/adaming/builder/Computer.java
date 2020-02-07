package com.adaming.builder;

public class Computer {
	private String hdd;
	private double ram;
	private boolean bluetoothEnabled;
	private boolean graphicsEnabled;
	
	public static class ComputerBuilder {
		private String hdd;
		private double ram;
		private boolean bluetoothEnabled;
		private boolean graphicsEnabled;
		
		public ComputerBuilder(String hdd, double ram) {
			this.hdd = hdd;
			this.ram = ram;
		}
		public ComputerBuilder setBluetoothEnable(boolean be) {
			this.bluetoothEnabled = be;
			
			return this;
		}
		public ComputerBuilder setGraphicsEnabled(boolean ge) {
			this.graphicsEnabled = ge;
			
			return this;
		}
		public Computer build() {
			Computer comp = new Computer();
			comp.bluetoothEnabled = this.bluetoothEnabled;
			comp.graphicsEnabled = this.graphicsEnabled;
			comp.hdd = this.hdd;
			comp.ram = this.ram;
			return comp;
		}
	}
	
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public boolean isBluetoothEnabled() {
		return bluetoothEnabled;
	}
	public void setBluetoothEnabled(boolean bluetoothEnabled) {
		this.bluetoothEnabled = bluetoothEnabled;
	}
	
	public boolean isGraphicsEnabled() {
		return graphicsEnabled;
	}
	public void setGraphicsEnabled(boolean graphicsEnabled) {
		this.graphicsEnabled = graphicsEnabled;
	}
	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", bluetoothEnabled=" + bluetoothEnabled + ", grapgicsEnabled="
				+ graphicsEnabled + "]";
	}
}

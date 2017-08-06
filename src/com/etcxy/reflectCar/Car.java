package com.etcxy.reflectCar;

public class Car {

	private int wheel;
	private String color;
	public Car() {
		super();
	}
	public Car(int wheel, String color) {
		super();
		this.wheel = wheel;
		this.color = color;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void run(){
		System.out.println("car go");
	}
	
	public static void back(){
		System.out.println("car come back..");
	}
	
	public void carryBack(String name){
		System.out.println("car come back with "+name);
	}
	
}

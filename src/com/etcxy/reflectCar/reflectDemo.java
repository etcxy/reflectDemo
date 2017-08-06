package com.etcxy.reflectCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class reflectDemo {

	public static void main(String[] args) throws Exception {

		getMethod_2();
	}

	private static void getMethod_2() throws Exception {
		Class clazz = Class.forName("com.etcxy.reflectCar.Car");
		//有参构造函数
		Constructor constructor = clazz.getConstructor(int.class, String.class);
		Object object = constructor.newInstance(4, "red");

		//调用方法，并传参
		Method method = clazz.getMethod("setWheel", int.class);
		method.invoke(object, 6);
		
		//调用方法，并打印出结果
		Method method2 = clazz.getMethod("getColor", null);
		Object invoke = method2.invoke(object, null);
		System.out.println(invoke);
	}

	private static void getMethod_1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("com.etcxy.reflectCar.Car");

		//无参构造函数
		Object object = clazz.newInstance();
		
		//clazz.getMethods 获取所有public的方法
		/*
		 * Returns an array containing Method objects reflecting all the public 
		 * methods of the class or interface represented by this Class object, 
		 * including those declared by the class or interface and those inherited
		 *  from superclasses and superinterfaces
		 */
		Method[] methods = clazz.getMethods();
		
		//clazz.getDeclaredMethods() 获取本类所有方法，包括private和protected
		/*
		 * Returns an array containing Method objects reflecting all the declared 
		 * methods of the class or interface represented by this Class object, 
		 * including public, protected, default (package) access, and private methods, 
		 * but excluding inherited methods.
		 */
		methods = clazz.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
	}
}

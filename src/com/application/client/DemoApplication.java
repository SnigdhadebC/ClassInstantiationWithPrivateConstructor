/**
 * 
 */
package com.application.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.application.model.CustomerBean;

/**
 * @author Deb
 *
 */
public class DemoApplication {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.application.model.CustomerBean");
			Constructor constructor[] = c.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			CustomerBean bean = (CustomerBean) constructor[0].newInstance("Snigdhadeb", "Chatterjee");
			System.out.println("First Name : " + bean.getFirstName() + "\nLast Name : " + bean.getLastName());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}

package com.hello.world.java;

import com.hello.world.bean.Person;
import com.hello.world.factory.PersonFactory;

public class Main {

	public static void main(String[] args) {
		Person person = PersonFactory.getPerson();
		person.setAge(22);
		person.setName("ndq");
		person.setId(001);
		
		System.out.println("Hello world");
		System.out.println("Hello ShangHai");
		System.out.println("Hello Ningdunquan");
		
		System.out.println(person);
	}
}

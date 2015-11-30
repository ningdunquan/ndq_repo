package com.hello.world.factory;

import com.hello.world.bean.Person;

public class PersonFactory {

	public static Person getPerson() {
		Person person = new Person();
		
		return person;
	}
}

package com.jsp.constructor.calling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private String email;
	
	public Employee(@Value(value ="1234" )int id,@Value(value = "PQRS") String name,@Value(value ="pqrs@mail.com" ) String email) {
		this.id=id;
		this.name= name;
		this.email= email;
		
	}
	
	public void printEmpDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}

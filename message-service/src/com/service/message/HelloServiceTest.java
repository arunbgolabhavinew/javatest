package com.service.message;


import org.junit.Assert;
import org.junit.Test;




public class HelloServiceTest {

	@Test
	public void should_return_hello_meesage()
	{
		//Given
		MessageService  service = new MessageService();
		String expected = "Hello from MessageService";
		
		//When
		String actual = service.getMessage();
		
		//Assertions.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
		
	}
}

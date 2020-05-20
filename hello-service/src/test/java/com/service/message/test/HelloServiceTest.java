package com.service.message.test;
import org.junit.Assert;
import org.junit.Test;

import com.service.message.HelloService;




public class HelloServiceTest {

	@Test
	public void should_return_hello_meesage()
	{
		//Given
		HelloService  service = new HelloService();
		String expected = "Hello from MessageService";
		
		//When
		String actual = service.getMessage();
		
		//Assertions.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
		
	}
}

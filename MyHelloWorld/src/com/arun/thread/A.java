package com.arun.thread;

public class A {
	
	public static Object k1 = new Object();
	public static Object k2 = new Object();
public void a()
{
	synchronized(k1)
	{
	System.out.println("I am in method a");
	b();
	}
}

public void b()
{
	synchronized(k2)
	{
	System.out.println("I am in method b");
	c();
	}
	
}

public void c()
{
	synchronized(k1)
	{
	System.out.println("I am in method c");
	}
	
}
}

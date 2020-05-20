package com.arun.thread;

public class LongWrapper {

	private long l;
	
	public LongWrapper(long value)
	{
		this.l=value;
	}
	
	public long getValue()
	{
		return this.l;
	}
	
	public void increment()
	{
		l=l+1;
	}
}

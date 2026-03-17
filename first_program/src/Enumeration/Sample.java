package Enumeration;

public enum Sample {
	A,B;
	static {
		System.out.println("Static block 1");
	}
	{
		System.out.println("Non static block 1");
	}
	static {
		System.out.println("Static block 2");
	}
	{
		System.out.println("Non static block 2");
	}
}

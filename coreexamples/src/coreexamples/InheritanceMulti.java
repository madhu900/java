package coreexamples;

public class InheritanceMulti {
	public void methodA()
	{
		System.out.println("class A method");
	}
}
	
 class InheritanceMultiSub extends InheritanceMulti{
    public void methodB()
	{
		System.out.println("class B method");
	}
}

 class InheritanceMultiSubLevel extends InheritanceMultiSub{
	public void methodC()
	{
		System.out.println("class c method");
	}
	}

	



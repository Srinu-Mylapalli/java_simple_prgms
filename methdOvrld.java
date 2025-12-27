class methdOvrld
{
	static void demo()
	{
		System.out.println("method one");
	}

	static void demo(int a)
	{
		System.out.println("method two");
		System.out.println("value of given parameter variable is: "+a);
	}

	static void demo(int a,int b)
	{
		System.out.println("method three");
		System.out.println("value of 1st given parameter is: "+a);
		System.out.println("value of 2nd given parameter is: "+b);
	}
	public static void main(String[] args)
	{
		int a=10,b=20;
		demo();
		demo(a);
		demo(a,b);
	}
}

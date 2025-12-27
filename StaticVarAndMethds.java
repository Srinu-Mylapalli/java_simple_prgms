class c1{
	//static int a=5;
	//int b=10,c=15;
	static void add(int a,int b){
		System.out.println("sum is : "+(a+b));
	}
	void sum(int a,int b,int c){
		System.out.println("sum is : "+(a+b+c));
	}

}




class StaticVarAndMethds{
	public static void main(String[] args){
		//int b=c1.a;
		c1 obj=new c1();
		//System.out.println(b);
		//System.out.println("a is : "+obj.a+" b is : "+obj.b+" c is : "+obj.c);

		c1.add(5,10);
		obj.sum(5,10,15);
	}
}


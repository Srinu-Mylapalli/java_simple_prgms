class StaticBlock{
	static{
		System.out.println("This is from static block");
	}
	//static String msg1;
}
class StaticBlockDemo{
	public static void main(String[] args){

		System.out.println("This is from main method");
		//System.out.println(StaticBlock.msg1);
		StaticBlock obj=new StaticBlock();
	}
}

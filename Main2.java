class Parent{
	//String msg;
	Parent(String msg){
		//this.msg=msg;
		System.out.println("Parent constructor "+msg);
	}
}

class Child extends Parent{
	Child(String msg){
		super(msg);
		System.out.println("Child constructor ");
	}
}

class Main2{
	public static void main(String[] args){
		Child c=new Child("hi from child");
	}
}


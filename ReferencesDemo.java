public class IntContainer{
	private int value;
	public IntContainer(int value){
		this.value =value;
	}

	public int getValue(){
		return value;
	}

	public void setValue(int value){
		this.value =value;
	}
}


public static ReferencesDemo{
	public static void main(String... args){
		IntContainer k=new IntContainer(42);
		IntContainer q=new IntContainer(44);

		swap(k,q);

		System.out.println("k= "+k.getValue());
		System.out.println("q= "+q.getValue());

	}
	static void swap(IntContainer a,IntContainer b){
		IntContainer temp=a;
		a=b;
		b=temp;
	
	}
}

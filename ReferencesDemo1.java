public class ReferencesDemo1{
	public static void main(String... args){
		IntContainer k= new IntContainer(42);
		IntContainer q= new IntContainer(44);

		swap(k,q);
		System.out.println("k= "+k.getValue());
		System.out.println("q= "+q.getValue());
	}

	static void swap(IntContainer a,IntContainer b){
		IntContainer temp =new IntContainer(a.getValue());
		a.setValue(b.getValue());
		b.setValue(temp.getValue());
	}
}

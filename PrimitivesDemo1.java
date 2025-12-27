public class PrimitivesDemo1{
	public static void main(String... arg){
		int k=42;
		int q=44;
		swap(k,q);
		System.out.println("k= "+k);
		System.out.println("q= "+q);
	}
	static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
}

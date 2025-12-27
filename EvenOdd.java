import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");

		int n=s.nextInt();
		if(n>=0){
		if(n%2==0){
			System.out.print("n is even");
		}
		else{
			System.out.print("n is odd");
		}
		}
		else{
			System.out.println("Please enter non-negative number");
	}
}
}

import java.util.Scanner;
class RecurFact{

	   static double fact(long n)                                                                    {
                        if(n<=1){
                                return 1;
                        }
                        else{                                                                                      return n*fact(n-1);
                        }

                }





	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to print factorial: ");
		long  n=s.nextLong();

		System.out.println("factorial of "+n+" by recursion is "+fact(n));
	}
}

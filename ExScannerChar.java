import java.util.Scanner;
class ExScannerChar
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the day of the week: ");
		char c=s.nextChar();
		switch (c){
			case '1':
				{
				System.out.println("Monday");
				}
			case '2':
				{
				System.out.println("Tuesday");
			}
		}
	}
}


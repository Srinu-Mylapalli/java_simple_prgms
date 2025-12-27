import java.util.Scanner;
class ExScannerObject
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		//String input
		System.out.print("Enter your name: ");
		String name=s.nextLine();
		System.out.print("your name is: \n"+name);

		//char input
		System.out.print("Enter a character: ");
		char c=s.next().charAt(0);

		System.out.print("a character is : \n"+c);

		//float input
		System.out.print("Enter a float value: ");
		float f=s.nextFloat();
		System.out.print("float value is : \n"+f);


		//Byte input
		System.out.print("Enter a byte value: ");
		byte b=s.nextByte();
		System.out.print("byte value is : \n"+b);


		//short input
		System.out.print("Enter a short value: ");
		short shrt=s.nextShort();
		System.out.print("short value is: \n"+shrt);


		//Long input
		System.out.print("Enter a long value: ");
		long l=s.nextLong();
		System.out.print("long value is : \n"+l);
	}
}

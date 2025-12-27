import java.util.Scanner;

class Test4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = scanner.nextInt();
scanner.nextLine(); // Consume the leftover newline
System.out.print("Enter your name: ");
String name = scanner.nextLine();
	}
}

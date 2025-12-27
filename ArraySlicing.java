import java.util.Arrays;

public class ArraySlicing{
	public static void main(String[] args){
		int[] num={10,20,30,40,50};
		int[] sliced=Arrays.copyOfRange(num,1,4);
		System.out.println(Arrays.toString(sliced));
	}
}

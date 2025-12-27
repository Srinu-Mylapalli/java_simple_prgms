import jqva.util.*;

public class ListSlicing{
	public static void main(String[] args){
		List<String> names=Arrays.asList("Apple","Banana","Mango","orange","Pomegranate","pineapple");
		List<String> sliced =names.subList(1,4);
		System.out.println(sliced);
	}
}

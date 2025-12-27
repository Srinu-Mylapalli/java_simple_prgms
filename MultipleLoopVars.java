class MultipleLoopVars{
	public static void main(String[] args){
		int i,j;

		for(i=5,j=15;i<j,i++,j--){
			System.out.println("i and j: "+i+" "+j);
		}
	}
}


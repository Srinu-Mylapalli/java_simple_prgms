class SimpleStack{
	char[] data; //this array holds the stack
	int tos; //index of top stack
	
	//construct an empty stack given it's size
	SimpleStack(int size){
		data=new char [size];//create the array to hold the stack
		tos=0;
	}

	//push a character onto the stack
	void push(char ch){
		if(isFull()){
			System.out.println(" --- Stack is full.");
			return;
		}
		data[tos]=ch;
		tos++;
	}

	//pop a character from the stack.
	char pop(){
		if(isEmpty()){
			System.out.println(" --- Stack is empty.");
			return (char) 0;// a placeholder value
			}
		tos--;
		return data(tos);
	}

	//Return true if the stack is full.
	boolean isFull(){
		return tos==data.length;
	}

	//Return true if the stack is empty.
	boolean isEmpty(){
		return tos==0;
	}
}

//Demonstrate the SimpleStack class.

class SimpleStackDemo{
	public static void main(String[] args){
		int i;
		char ch;
		System.out.println("Demonstrate SimpleStack\n");
		// construct 10-element empty stack.
		SimpleStack stack=new SimpleStack(10);
		System.out.println("push 10 items onto a 10-element stack.");
		//push the letters A through J onto the stack.
		System.out.print("pushing: ");
		for(ch='A';ch<'K';ch++){
			System.out.print(ch);
			stack.push(ch);
		}
		System.out.println("\npop  those 10 items from stack.");
		//now,pop the characters off the stack.
		//notice that order will be reverse of those pushed
		System.out.print("popping: ");
		for(i=0;i<10;i++){
			ch=stack.pop();
			System.out.print(ch);
		}

		System.out.println("\n\nnext,use isEmpty() and isFull()"+"to fill and empty the stack.");
		//push the letters until tje stack is full.
		System.out.print("pushing: ");
		for(ch='A';!stack.isFull();ch++){
			System.out.print(ch);
			stack.push(ch);
		}

		System.out.println();
		//now,pop the characters off the stack until it is empty.
		System.out.print("popping: ");
		while(!stack.isEmpty()){
			ch=stack.pop();
			System.out.print(ch);
		}
		System.out.println("\n\nnow,use a 4-element stack to generate "+"some errors.");
		//generate some error
	}
}


	class Animal{
		void Type(){
			System.out.println("This animal is a mammal");
		}
	}

	class Animal1 extends Animal{
		void Type1(){
		System.out.println("Mammals feed with milk to their offsprings");
		}
	}
	class Dog extends Animal1{
		void Type2(){
			System.out.println("This is a dog");
		}
	}
class Test{
	public static void main(String[] args){
		Dog d=new Dog();
		d.Type();
		d.Type1();
		d.Type2();







		}
	}


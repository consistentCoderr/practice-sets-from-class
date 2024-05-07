//Static block declaration and use

class A{
	static{
		System.out.println("A's Static Block");
	}
}

class SGGS extends A{
	static int x = 786;
	SGGS(float x){
		System.out.println("Inside SGGS Constructor");
	}
	static{
		x=78;
		System.out.println("SGGS Static block at start");
	}
	public static void main(String args[]){
		//A sggs = new A();
		 SGGS sggs1 = new SGGS(0.3f);
		System.out.println(sggs1.x);
	}
	static{
		x=78;
		System.out.println("SGGS Static block at end ");
	}  
}

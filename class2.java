class mother{
	public static int number = 12345;
	public mother(int number){
		System.out.println("inside mother constructor");
		System.out.println(this.number);
	}
}

class father extends mother{
	int balance=123;
	public father(float balance){
	super(10);
		System.out.println(balance+0.3);
		if(balance+0.3 == 0.5){
			System.out.println("inside if block");
			System.out.println(balance);
		}
		System.out.println("inside parameterized constructor");
		float x=balance=balance;
		System.out.println(x);
	}	
	static public void main(String args[]){
		father daughter = new father(0.3F);
		System.out.println(daughter.balance);
	}
}

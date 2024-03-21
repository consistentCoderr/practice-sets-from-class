class Father{
	int balance = 2300000;
	static String surname = "sawadh";
	public static void main(String args[]){
		int balance =200;
		System.out.println("hiii");  
		Father f = new Father();
		System.out.println(balance);		
		System.out.println(f);		
		System.out.println(f.balance);		
		System.out.println(surname);	
		System.out.println(f.surname);		
		Father son = new Father();
		System.out.println(son);		
		System.out.println(son.balance);	
		System.out.println(Father.surname);
		System.out.println(son.surname);	
		//System.out.println.(Father.balance);	//throws an error that non static variable cannot be access by static content
		son.balance = 45000;			
		System.out.println(son.balance);	
		Father daughter = new Father();
		System.out.println(daughter);		
		System.out.println(daughter.balance);	
		son.surname = "modi";
		System.out.println(son.surname);	
		System.out.println(Father.surname);
		System.out.println(daughter.surname);	
	}
}

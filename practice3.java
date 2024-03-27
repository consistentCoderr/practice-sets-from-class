class Father{
	int balance;
	static boolean status;
	static String surname;
	public static void main(String args[]){
		Father son = new Father();
		System.out.println(son.balance);		//00
		//System.out.println(Father.surname);		//error
		//System.out.println(Father.surname.length());	//error
		System.out.println(Father.status);		//false
		System.out.println(son.status);		//false
		son.balance = 500;				
		System.out.println(son.balance);		//non static variable cannot access by static content
		//System.out.println(Father.balance);		//non static variable cannot access by static content
		//String mysurname = son.getsurname(son);		//error
		//System.out.println(mysurname);			//error
		Father daughter = new Father();
		System.out.println(daughter.balance);		//00	
	}
	public String getsurname(Father obj){
			return obj.surname;
	}
}


//0
//null
//Exception in thread "main" java.lang.NullPointerException


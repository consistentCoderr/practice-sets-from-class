class college{
	college(){
		System.out.println("inside college constructor");
	}
}

class SGGS extends college{
	SGGS(int... a){
		System.out.println("Inside SGGS constructor " +a);
	}
	static public void main(String args[]){
		SGGS sggs1 = new SGGS(5);
		
	}
}

//init block declaration - invokes whenever we call constructor
// toString default  function
//try static for object declaration

class SGGS{
	static int x=786;
	int y = 2024;
	{
		System.out.println("Inside init block " +this);
	}
	SGGS(){
		System.out.println("Inside SGGS Constructor " +this);
	}
	public static void main(String args[]){
		System.out.println("inside main");
		SGGS sggs1 = new SGGS();
		System.out.println(sggs1);  //return and run by default toString function value 
		System.out.println("default toString() returns :"+ sggs1);
		System.out.println("class's toString returns : " +sggs1.toString());
	}
	
	public String toString(){
			return "y : = " +y;		
		}
}

class ex6{
	public static void main(String args[]){

		try{
			NumberFormatException ex = new NumberFormatException("number format exception");
			ex.initCause(new NullPointerException("this is the actual cause"));
			throw ex;
		}
		catch(NumberFormatException ex){
			System.out.println("inside catch");
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}
}

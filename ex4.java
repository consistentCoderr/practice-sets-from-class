// A Class that represents use-defined exception

class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
		System.out.println("inside constructor MyException");
	}
}


// A Class that uses above MyException
 class Main {
	// Driver Program
	public static void main(String args[])
	{
	
		System.out.println("Inside Main");
		try {
			// Throw an object of user defined exception
			throw new MyException("GeeksGeeks");
		}
		catch (MyException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}


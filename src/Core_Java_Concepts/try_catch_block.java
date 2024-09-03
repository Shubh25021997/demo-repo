package Core_Java_Concepts;

public class try_catch_block {
	
	public static void main(String[] args) {
		String value = "abcd";
		value = null;
	try{
		System.out.println(value.length());
		}
	catch(NullPointerException S) {
	    System.out.println("Exception caught: " + S.getMessage());
//	    e.printStackTrace(); 		//Print stack trace for debugging
		System.out.println("Something went wrong:");
		}
	finally{
		System.out.println("not went wrong!");
	}
		
		
	}

}

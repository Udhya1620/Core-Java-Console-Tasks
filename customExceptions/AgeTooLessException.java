package customExceptions;

@SuppressWarnings("serial")
public class AgeTooLessException extends Exception{
   
	
	public AgeTooLessException (String message) {
		super(message);
	}
}

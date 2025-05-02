package customExceptions;

@SuppressWarnings("serial")
public class AgeTooLargeException extends Exception{
	
   public AgeTooLargeException(String message) {
	   super(message);
   }
}

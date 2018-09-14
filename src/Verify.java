import org.springframework.security.crypto.bcrypt.BCrypt;

public class Verify {
	
    public static void main(String[] args) {
	switch(args.length) {
	case 2:
	    //Print the result
	    System.out.println(BCrypt.checkpw(args[0], args[1]));
	    break;
	default:
	    System.err.println("Usage:");
	    System.err.println("\tVerify [password] [saltedhash]");
	    return;
	}
    }
	
}

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Generate {

    public static void main(String[] args) {
	
	switch(args.length) {
	case 2:
	    break;
	case 1:
	    break;
	default:
	    System.err.println("Usage:");
	    System.err.println("\tGenerate [password] [salt]");
	    return;
	}

	//Generate a salt if none is specified
	String salt = args.length == 2 ? args[1] : BCrypt.gensalt();
	//Print the salted hash string
	System.out.println(BCrypt.hashpw(args[0], salt));
    }

}

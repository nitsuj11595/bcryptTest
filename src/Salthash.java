//import java.util.*;
import org.springframework.security.crypto.bcrypt.*;

public class Salthash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(args.length) {
		case 2: if(args[0].equals("generate")) break;
		case 3: if(args[0].equals("generate")) break;
				if(args[0].equals("verify")) break;
		default:
			System.err.println("Usage:");
			System.err.println("\tjava Salthash [pass] [saltedhash]");
			System.err.println("\tjava Salthash [pass] [salt]");
			System.err.println("\tjava Salthash [pass]");
			return;
		}
		//args[2] = BCrypt.gensalt(10);
		System.err.println(args[1]);
		System.err.println(args[2]);
		System.out.println(BCrypt.hashpw(args[1], args[2]));
	}

}

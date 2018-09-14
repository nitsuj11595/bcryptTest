package com;

import java.util.*;
import org.springframework.security.crypto.bcrypt.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter password: ");
		String pass = scanner.nextLine();
		System.out.println(BCrypt.hashpw(pass, BCrypt.gensalt(10)));
		scanner.close();
	}

}

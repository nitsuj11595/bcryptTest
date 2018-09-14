Quick implementation of BCrypt in Java and Javascript

## Javascript ##
See js/index.html

## Java ##
Compile and package into a runnable jar with maven
```
mvn -q package
```

### Generating salted hash ###

Try generating a hash string with:

```
java -cp target/bcryptTest.jar Generate [password]
```

The output will be something like this 

`$2a$10$Y7E3MIGEOoT4uaaOMG8kfeNDBrkKpTWAab5evLj/ybaMy9RN4ZGp2`


### Verifying passwords ###

To verify passwords, use 

```
java -cp target/bcryptTest.jar Verify [password] [hashstring]
```

Running from the CLI with require you to escape special characters, particularly '$'

For example,
```
java -cp target/bcryptTest.jar Verify "letmein" "\$2a\$10\$Y7E3MIGEOoT4uaaOMG8kfeNDBrkKpTWAab5evLj/ybaMy9RN4ZGp2"
```

will output true.  Any other password other than "letmein" should output false

# In Out
This will not be used on the actual robot, but is useful for other projects here.

For this we will use the scanner object. It will need to input System.in (remember System.out for printing?)
make one by putting
```java
Scanner scanner = new Scanner(System.in)
```
Now using the method `scanner.next()` will wait and then return the next line of input from the user. There are also methods like `nextInt()`, `nextDouble()` which return their respective types when called. 
```java
String input = scanner.next() //get the next line of input from the user 
```
Once the program is finished, it is important to call `scanner.close()` in order to tell the program to stop taking input.


Ex.
```java
Scanner scanner = new Scanner(System.in);
System.out.println("What is your name?")
String name = scanner.next();
System.out.println("Hello " + name + "!");
scanner.close();
```

# You Do
Make a simple calculator that asks for an operation ( +, -, *, / ) and the asks for two numbers, preforms the operation, than returns the output
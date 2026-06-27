# Get Method
A get method is like a do method except it gives something back. This is done throught the `return` Statement.

This can be a bit confusing so think about it like this. Something 'calls' the method. the method then runs some code and preforms the operation required before returning it. once returned, the data is sent back to the caller and is used in place.

The type of data returned is added to the start of the function (remember void? that was the 'data type' that was being returned, nothing!)

Ex.
```java
public String addHello(String OriginalString) {
    return "Hello " + OriginalString + "!";
}

String name = "Bella"
String greeting = addHello(name)
System.out.Println(greeting) // Hello Bella!
```

# You do
make a method that adds two numbers and returns it. then print the result of two numbers
# Typing
In Java, each variable you make needs an explicit type. A type is basically what type of data to expect in the variable

Some of the main types we will use are as follows:
- Boolean (Bool) - true/false, used for buttons and checks
- Integer (int) - a simple integer (no decimal)
- Double (double) - a decimaled number, used for many, many things
- Sting (String) - a bit of text
- A bunch of ather stuff - We will use much more complex typing with advanced objects that allow for more robust usage

Ex:
```java
Bool boolean = true
int integer = 18
double pi = 3.1415
String text = "Im a robot!"
ComplexObject object = new ComplexObject()
```

We can also preform what is called "type casting," which is when we have a variable of one type and turn it into another. this is realistically only usefull for converting ints to doubles and back.

```java
(double)(16) //16.0
(int)(18.95) // 18
```

Important to note that casting from double to int preforms truncation, or mathematical flooring (for positive numbers). this means it does not round, but simply discards the rest of the digits. note that it truncates towards 0 so negative numbers would be rounded up
```
16.35 -> 16
19.45 -> 19
53.9999923 -> 53
-5.8 -> -5
```

# You do
make a boolean, integer, double, and string then print them
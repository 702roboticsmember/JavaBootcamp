# Printing
Arrays are simply an ordered list of variables.
You define them by putting `[]` after the type. We can then define a list of elements between {braces}
```java
String names = {"bart", "bella", "bubble", "bary"};
```

We can get an item from an array by calling its name, then putting an index between the [Brackets]. But remember, Arrays start counting at 0, so the first element is at index 0

```java
names[0] // bart
names[3] // bary
names[1] // bella
```
We can get the length of the array with the `array.lenth` function. note that this number starts counting at 1, the length of the array will be 1 higher than the last index.
This is called an off by one error and it is common.
```java
names.length // 4
names[4] // error!
```


We can get a random item from the array with the `Math.random()`, which generates a random number from 0-1. we then multiply this be the length of the array and truncate it to get our random element

```java
String randomName = names[(int)(Math.random() * names.length)]
```

# You do
given an array of names, print the 3rd name and print a random name.
# For Loop
A for loop consists of 3 statements. the first is a simple variable decleration.
```java
int i = 0
```
This creates a variable,`i`, and sets it to 0

The second is a conditional, usually a limit.
```java
i<5
```
This means the loop will keep repeating until i >= 5

The third is a statement that runs at the end of each loop.
```java
i++
```
Thus, this loop will repeat five times. and the i variable will go 0,1,2,3,4.

Ex.
```java
for (int i = 0; i<5; i++) {
    System.out.println(i)
}
/* Output:
 * 0
 * 1
 * 2
 * 3
 * 4
 */
```

This is also useful for arrays because we can loop through each element of the array, with the conditional usually being `i<array.length`, and than getting the element by writing `int element = array[i]`.

# You Do
Write a for loop that prints out each element in an array of strings.
# Lambda
This challenge focuses on a specific type called Runnables. this type is essentially just a method that may be run. The shorthand to making these statements is called a lambda statement
```java
do(() -> System.out.println("hello"))
```
this example passes a runnable ( the lambda ) into the `do()` method.

To run runnables, simply call `.run()`

Ex.
```java
void runThis(Runnable toRun) {
    toRun.run()
}

runThis(() -> System.out.println("This was ran!"))
```

# You Do
Make a function that runs a runnable 5 times using a for loop
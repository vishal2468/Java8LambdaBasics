Java Lambda is a paradigm shift from the traditional OOP that we are used to in Java.

    • Understanding lambdas
    • Using lambdas
    • Functional interfaces
    • Method references
    • Collections improvements

### Why Lambdas?

    • Enables functional programming
    • Readable and concise code
    • Easier-to-use APIs and libraries
    • Enables support for parallel processing
<!-- although we have not discussed how , we will understand the points as we go on through the course -->
<br/>

### Why functional programming?


    • Functional Programming does not lets you do anything that cant be already done using OOPs but It lets us write more maintainable code , readable code (same reason as we dont write in machine code).
    • Its just an another tool in the toolbox.

### Problems in OOPs

    • Everything is an object
    • All code blocks are "associated" with classes and objects

<br/>
Write a code that can "perform any action".
How to do that in Java using OOPs?
<br/>
<br>

    You made many many poor people. I realize of course it’s no shame to be poor, but it’s no great honor either. Now, what would be so terrible if I had a small fortune?
<br>

Similarly, There is no shame in writing a interface and then then passing the object of implementation class as an argument. 
But , what would have been so terrible if we could simply pass the behaviour as an argument..
Lambda sets out to achieve just that.
<br>
Inline Values
ex. int a = 10;
<br>
So , is it possible to assign a block of code to a variable as a value?

``` java
blockOfCode={
    ...
    ...
}
```

``` java
aBlockOfCode = public void perform() {
System.out.print("Hello World!");
}
```
It makes sense to apply access specifier to a function only in context of a class.
<br>
We don't need the name either.
We dont need to specify the return type.

``` java
aBlockOfCode =()->{
    System.out.print("Hello World!");
}
```
even more optimizations can me made

-> show how we can send inline function as an argument.
<br>
-> show examples of different lambda functions.

    doubleNumber
    addNumbers
    safeDevide
    stringLengthCount

### Up-next:

    -> next we see how to use lambda function in out code( also create a new interface and remove it)
    -> we can also define a anonymous class.
    -> compare the diff between anonymous , lambda and the implemented class.
    -> show type inference using a new string length interface.
    -> show example of java provided functional interfaces using thread.
    -> also note that this tread class has been implemented long before java 8.

### Functional Interface
    Functional Interface has only one abstract method. It can have as many implemented methods , but only one abstract unimplemented methods.
    @FunctionalInterface

    Exercise1 do it without lambdas and with lambdas


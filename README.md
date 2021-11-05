# Assignment 22

There are several techniques for implementing the sqrt method in the Math class. One such technique is known as the Babylonian method. It approximates the square root of a number, n, by repeatedly performing a calculation using the following formula:

`nextGuess = (lastGuess + n / lastGuess) / 2`

When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. The initial guess can be any positive value (e.g., 1). This value will be the starting value for lastGuess. If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001, you can claim that nextGuess is the approximated square root of n. If not, nextGuess becomes lastGuess and the approximation process continues. 

You do not need to create a second class, but you should implement the following method that returns the square root of n.

`public static double sqrt(double n)`

### Sample Outputs

```
Enter a number to take the square root: 10
Margin of error: 0.0001
The square root of 10 is 3.162277660168379 
```

```
Enter a number to take the square root: 3.5
Margin of error: 0.01
The square root of 3.5 is 1.8708287126121879
```

```
Enter a number to take the square root: 16
Margin of error: 0.1
The square root of 16.0 is 4.000000636692939
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.


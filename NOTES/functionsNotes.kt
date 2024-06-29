// FUNCTIONS IN KOTLIN

/*

A function is a block of code which only runs when it is called.
You can pass data, known as parameters, into a function.
Functions are used to perform certain actions, and they are also known as methods.

PREDEFINED FUNCTIONS:
For example, println() is a function. It is used to output/print text to the screen:

fun main() {
  println("Hello World")
}

CREATING FUNCTIONS:

To create your own function, use the fun keyword,
and write the name of the function, followed by parantheses ():

fun myFunction() {
  println("I just got executed!")
}

CALL A FUNCTION:

To call a function in Kotlin, write the name of the function followed by two parantheses ().

In the following example, myFunction() will print some text (the action), when it is called in main function:

fun main() {
  myFunction() // Call myFunction
}

// Outputs "I just got executed!"

fun main() {
  myFunction()
  myFunction()
  myFunction()
}

// I just got executed!
// I just got executed!
// I just got executed!

-------------------------------------------------

FUNCTION PARAMTERS:

Information can be passed to functions as parameter.

Parameters are specified after the function name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.
Just note that you must specify the type of each parameter (Int, String, etc).

The following example has a function that takes a String called fname as parameter.
When the function is called, we pass along a first name,
which is used inside the function to print the full name:

fun myFunction(fname: String) {
  println(fname + " Doe")
}

fun main() {
  myFunction("John")
  myFunction("Jane")
  myFunction("George")
}

// John Doe
// Jane Doe
// George Doe

MULTIPLE PARAMETERS:

You can have as many parameters as you like:

fun myFunction(fname: String, age: Int, pay: Double) {
    println("$fname is $age years old, and needs to pay $pay")
}

fun main() {
    myFunction("John", 35, 43.12)
    myFunction("Jane", 32, 32.12)
    myFunction("George", 15, 43.00)
}

// John is 35 years old, and needs to pay 43.12
// Jane is 32 years old, and needs to pay 32.12
// George is 15 years old, and needs to pay 43.0

--------------------------------------------------------

RETURN VALUES

In the examples above, we used functions to output a value.
In the following example, we will use a function to return a value and assign it to a variable.

To return a value, use the return keyword,
and specify the return type after the function's parantheses (Int in this example):

fun myFunction(x: Int): Int {
  return (x + 5)
}

fun main() {
  var result = myFunction(3)
  println(result)
}

// Outputs 8 (3+8)

USING TWO PARAMTERS

fun myFunction(x: Int, y: Int): Int {
  return (x + y)
}

fun main() {
  var result = myFunction(3, 5)
  println(result)
}

// 8 (3 + 5)

---------------------------------------------

SHORTCUT METHOD
SHORTER SYNTAX FOR RETURN VALUES:

Instead of using "return" keyword,

There is also a shorter syntax for returning values.
You can use the = operator without specifying the return type.
Kotlin is smart enough to automatically find out what it is:

fun myFunction(x: Int, y: Int) = x + y

fun main() {
  var result = myFunction(3, 5)
  println(result)
}

// 8 (3 + 5)



 */
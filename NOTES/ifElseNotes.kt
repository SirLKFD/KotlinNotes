// IF/ELSE IN KOTLIN

/*

BASICALLY THE SAME IN C#:

Kotlin supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Kotlin has the following conditionals:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use when to specify many alternative blocks of code to be executed, AKA SWITCH STATEMENT IN C AND C#

IF:
Use if to specify a block of code to be executed if a condition is true.

if (20 > 18) {
  println("20 is greater than 18")
}

We can also test variables:

val x = 20
val y = 18
if (x > y) {
  println("x is greater than y")
}

ELSE:
Use else to specify a block of code to be executed if the condition is false.

val time = 20
if (time < 18) {
  println("Good day.")
} else {
  println("Good evening.")
}

// Outputs "Good evening."

ELSE IF:

val time = 22
if (time < 10) {
  println("Good morning.")
} else if (time < 20) {
  println("Good day.")
} else {
  println("Good evening.")
}

// Outputs "Good evening."

IF ELSE AS EXPRESIONS:

In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):
NOTE: When using if as an expression, you must also include else (required).

val time = 20
val greeting = if (time < 18) {
  "Good day."
} else {
  "Good evening."
}
println(greeting) // displays Good day

OMMIT CURLY BRACES IN IF ELSE:
You can ommit the curly braces {} when if has only one statement:

  val time = 20
  val greeting = if (time < 18) "Good day." else "Good evening."
  println(greeting)




 */
// INTROUCTION TO KOTLIN PROGRAMMING LANGUAGE

// var = can be changed
// val = aka constant, cannot be changed

/*

SYNTAX:

fun main() {
  println("Hello World")
}

ASSUME THAT println is inside in fun main() function.

DATA TYPES:
val myNum = 5             // Int, Byte, Short, Int and Long
val myDoubleNum = 5.99    // Double, Float
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Hello"      // String

OR

val myNum: Int = 5                // Int, Byte, Short, Int and Long.
val myDoubleNum: Double = 5.99    // Double, Float
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String

Variables can be written as:

Smart Detection Style:
var name = "John" // automatically detects string
val birthyear = 1975 // automatically detects int

OR

However, it can be in manual style too:
var name: String = "John"
val birthyear: Int = 1975

NOTE:

NOT ALLOWED:
var name
name = "John"
println(name)

ALLOWED:
var name: String
name = "John"
println(name)

Display Variables:
val name = "John"
println("Hello " + name)

==

val firstName = "John "
val lastName = "Doe"
val fullName = firstName + lastName
println(fullName)

val x = 5
val y = 6
println(x + y) // displays 11

SCIENTIFIC NUMBERS:
A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10:

val myNum1: Float = 35E3F
val myNum2: Double = 12E4
println(myNum1) // displays 35000.0
println(myNum2) // displays 120000.0

BOOLEANS:
The Boolean data type and can only take the values true or false:
val isKotlinFun: Boolean = true
val isFishTasty: Boolean = false
println(isKotlinFun)   // Outputs true
println(isFishTasty)   // Outputs false

CHAR:
The Char data type is used to store a single character.
A char value must be surrounded by single quotes, like 'A' or 'c':

val myGrade: Char = 'B'
println(myGrade) // displays B

STRING:
The String data type is used to store a sequence of characters (text).
String values must be surrounded by double quotes:

val myText: String = "Hello World"
println(myText) // displays Hello World

TYPE CONVERSION:
To convert a numeric data type to another type, you must use one of the following functions:
toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

val x: Int = 5
val y: Long = x.toLong()
println(y)




*/
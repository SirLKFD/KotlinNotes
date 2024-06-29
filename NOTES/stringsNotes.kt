// STRINGS IN KOTLIN:

/*

As previously said in Intro Notes,
 you do not have to specify that the variable should be a String.
 Kotlin is smart enough to understand that the greeting variable in the example above
 is a String because of the double quotes.

var greeting = "Hello" // SMART STYLE
var greeting: String = "Hello" // MANUAL STYLE

ACCESS A STRING:
To access the characters (elements) of a string, you must refer to the index number inside square brackets.
String indexes start with 0.

var txt = "Hello World"
println(txt[0]) // displays H
println(txt[2]) // displays l

STRING LENGTH
A String in Kotlin is an object, which contain properties and functions that
can perform certain operations on strings, by writing a dot character (.) after the specific string variable.
For example, the length of a string can be found with the length property:

var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is: " + txt.length) // displays 26 in txt.length

STRING FUNCTIONS:
There are many string functions available, for example toUpperCase() and toLowerCase():

var txt = "Hello World"
println(txt.toUpperCase())   // displays "HELLO WORLD"
println(txt.toLowerCase())   // displays "hello world"

COMPARING STRINGS:
The compareTo(string) function compares two strings and returns 0 if both are equal:

var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2))  // Outputs 0 (they are equal) else returns random numbers...

FINDING A STRING IN A STRING:
The indexOf() function returns the index (the position)
 of the first occurrence of a specified text in a string (including whitespace):

 var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate"))  // Outputs 7 else if not found, returns random numbers

STRING CONCATENATION:
The + operator can be used between strings to add them together to make a new string.
This is called concatenation:

var firstName = "John"
var lastName = "Doe"
println(firstName + " " + lastName) // displays John Doe instead of JohnDoe

You can also use the plus() function to concatenate two strings:

var firstName = "John "
var lastName = "Doe"
println(firstName.plus(lastName)) // displays JohnDoe

-------------------------------------------------------------------

STRING INTERPOLATION:

nstead of concatenation, you can also use "string templates",
which is an easy way to add variables and expressions inside a string.
Just refer to the variable with the $ symbol:

var firstName = "John"
var lastName = "Doe"
println("My name is $firstName $lastName")

String Interpolation is a popular feature of Kotlin,
as it reduces the amount of code. For example,
you do not have to specify a whitespace between firstName and lastName,
like we did in the concatenation example.




 */


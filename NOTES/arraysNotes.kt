// ARRAYS IN KOTLIN

/*

Arrays are used to store multiple values in a single variable,
instead of creating separate variables for each value.

To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

ACCESS THE ELEMENTS OF AN ARRAY:
You can access an array element by referring to the index number, inside square brackets.

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(cars[0])

// Outputs Volvo

CHANGE AN ARRAY ELEMENT:
To change the value of a specific element, refer to the index number:

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
cars[0] = "Opel"
println(cars[0])

// Now outputs Opel instead of Volvo

ARRAY LENGTH / SIZE:
To find out how many elements an array have, use the size property:

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(cars.size)
// Outputs 4

CHECK IF AN ELEMENT EXISTS:
You can use the in operator to check if an element exists in an array:

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars) {
  println("It exists!")
} else {
  println("It does not exist.")
}

// displays It exists!

LOOP THROUGH AN ARRAY:
Often when you work with arrays, you need to loop through all of the elements.

You can loop through the array elements with the for loop,
which you will learn even more about in the next chapter.

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars) {
  println(x)
}

// displays Volvo BMW Ford Mazda

 */
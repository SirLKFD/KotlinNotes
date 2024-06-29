// CLASSES AND OBJECTS IN KOTLIN

/*

Everything in Kotlin is associated with classes and objects,
along with its properties and functions.
For example: in real life, a car is an object.
The car has properties, such as brand, weight and color, and functions, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

package Classes

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

val c1 = Car()

fun main() {
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}

// Outputs Ford Mustang 1969


------------------------------------

MULTIPLE OBJECTS:

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

val c1 = Car()
val c2 = Car()

fun main() {
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)
}

// Outputs Ford Mustang 1969
// Outputs BMW X5 1999



 */
// CONSTRUCTORS IN KOTLIN

/*

In Kotlin, there's a faster way of doing this, by using a constructor.

A constructor is like a special function,
and it is defined by using two parantheses () after the class name.
You can specify the properties inside of the parantheses (like passing parameters into a regular function).

The constructor will initialize the properties when you create an object of a class.
Just remember to specify the type of the property/variable:

class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)

  println(c1.brand)
    println(c1.model)
    println(c1.year)

}

Outputs Ford Mustang 1969

------------------------------------------------------------------------

Now it's even easier to specify multiple objects of one class:

class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  val c2 = Car("BMW", "X5", 1999)
  val c3 = Car("Tesla", "Model S", 2020)
}





 */
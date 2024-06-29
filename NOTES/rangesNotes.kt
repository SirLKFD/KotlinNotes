// RANGES IN KOTLIN

/*
With the for loop, you can also create ranges of values with "..":

for (chars in 'a'..'x') {
  println(chars)
}

// displays letters from a to x (IN REALITY)

for (nums in 5..15) {
  println(nums)
}


fggf

// displays whole numbers from 5 to 15 (IN REALITY)

CHECK IF A VALUE EXISTS:
You can also use the in operator to check if a value exists in a range:

val nums = arrayOf(2, 4, 6, 8)
if (2 in nums) {
  println("It exists!")
} else {
  println("It does not exist.")
}

// displays It exists

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars) {
  println("It exists!")
} else {
  println("It does not exist.")
}

// displays It exists

BREAK OR CONTINUE A RANGE:
You can also use the break and continue keywords in a range/for loop:

for (nums in 5..15) {
  if (nums == 10) {
    break
  }
  println(nums)
}

// displays 5 6 7 8 9

for (nums in 5..15) {
  if (nums == 10) {
    continue
  }
  println(nums)
}

// excludes 10 in the loop
// displays 5 6 7 8 9 11 12 13 14 15


 */
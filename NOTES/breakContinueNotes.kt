// BREAK/CONTINUE IN KOTLIN

/*

BREAK:
The break statement is used to jump out of a loop.

var i = 0
while (i < 10) {
  println(i)
  i++
  if (i == 4) {
    break
  }
}

// displays 0 1 2 3

CONTINUE:


The continue statement breaks one iteration (in the loop),
if a specified condition occurs, and continues with the next iteration in the loop.

AKA IT WILL SKIP

var i = 0
while (i < 10) {
  if (i == 4) {
    i++
    continue
  }
  println(i)
  i++
}

// displays 0 1 2 3 5 6 7 8 9

This example skips the value of 4:



 */
import java.math.BigInteger

val big = new BigInteger("12345")

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
// Is the same as (the compiler transform the previous expression to...)
greetStrings.update(0, "Hello")
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

// The elements of the array are mutable
greetStrings(0) = "Bye"

greetStrings.foreach(print)

val numNames = Array("one", "two", "three")
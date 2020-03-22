// List Contatenation
val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " where not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new List.")

// List add component (prepend)
val twoThree = List(2, 3)
var oneTwoThree = 1 :: twoThree
println(oneTwoThree)

oneTwoThree = 0 :: oneTwoThree

println(oneTwoThree)

// The operation '::' is applied to the right operand (twoThree)
// because it ends with a semicolon
// The :: operator is named 'cons' operator. It prepends a new element to the
// beginning of an existing list and returns a new list

// Another way to create a list

val listCreatedWithCons = 6 :: 7 :: 8 :: Nil
println(listCreatedWithCons)

// Lists are always immutable

//Prints the first element of a list
println(listCreatedWithCons(0))

val stringList = List("Juan", "Pepe", "Eriberto")

// Add "X" to the end of every single string in a List
val newList = stringList.map(s => s + "X")
println(newList)

// Make a string separated by , from a list
println(newList.mkString(", "))
// List Contatenation
val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " where not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new List.")

// List add component (prepend)
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

// The operation '::' is applied to the right operand (twoThree)
// because it ends with a semicolon
// The :: operator is named 'cons' operator

// Another way to create a list

val listCreatedWithCons = 6 :: 7 :: 8 :: Nil
println(listCreatedWithCons)

// Lists are always immutable
import scala.collection.mutable
import scala.collection.immutable.HashSet

//immutable set: append, add or remove operations will create and return a new collection
// leaving the original one intact

val jetSet = Set("Boeing", "Jetsmart")
val mixSet = Set(1, "Jose", "Ricardo", 0.2)
val numSet = Set(1, 1, 1, 1)

println(jetSet)

//mutable set: append, and or remove operations will modify the original collection in place

val movieSet = mutable.Set("Hitch", "Harry Potter")
movieSet += "Shrek"

println(movieSet)

// immutable hashset

var hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet)
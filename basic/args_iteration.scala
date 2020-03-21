import scala.collection.mutable.ListBuffer

println("While Style")

// Type inference gives i the type scala.Int
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}

println("For Style")

/*
Esta es otra sintaxis para iterar sobre un arreglo
arg es un val, no un var. Si bien cambia de valor en cada iteración,
su valor es inmutable dentro del cuerpo del for.
* */
for (arg <- args)
  println(arg)

println("Functional Style:")

args.foreach((arg: String) => println(arg))

println("More concise style:")

args.foreach(println)

// Array to List (toList)

var listBOfArgs = new ListBuffer[String]()

args.foreach((arg: String) => listBOfArgs += arg)

val listOfArgs = listBOfArgs.toList

println("Now we're printing the args converting array to list...")
listOfArgs.foreach(println)
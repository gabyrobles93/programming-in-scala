// Imperative way ...

def printArgs(args: Array[String]) = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

// More functional style

def printArgs2(args: Array[String]) = {
  for (arg <- args)
    println(arg)
}

// Even more functional style. This is not purely fuctional because it has side effects
// (print the standard output).

def printArgs3(args: Array[String]) = {
  args.foreach(println)
}

// The telltale sign of a function with side effect is that its result type is Unit.
// If a function isn't returning any interesting value, them the only way that function
// Can make a difference in the world is through some kind of side effect.


// This returns the formatted string
def formatArgs(args: Array[String]) = args.mkString("\n")

val res = formatArgs(args)
assert(res == "zero\none\ntwo")
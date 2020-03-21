import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()

treasureMap += (1 -> "Go to island.")

// El método -> aplicado sobre el entero "2" retorna una tupla del tipo (int, String) que se asocia al mapa
treasureMap += (2).->("Find big X on ground.")

// Es equivalente a...
treasureMap.+=((3).->("Dig."))

println(treasureMap(2))

val romanNumeral = Map (
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))
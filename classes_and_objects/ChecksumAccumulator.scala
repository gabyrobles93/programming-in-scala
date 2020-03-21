import scala.collection.mutable

class ChecksumAccumulator {

  private var sum = 0

  def add(b: Byte) = sum += b

  def checksum() : Int = ~(sum & 0xFF) + 1
}

// Singleton object: the Class Companion Object
// If it exists, you can't create a variable of type ChecksumAccumulator
// Rather, the type named ChecksumAccumulator is defined by the singleton object's companion class
object ChecksumAccumulator {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String) : Int = {
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      s.foreach(c => acc.add(c.toByte))
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}

// Invocation a method of the Singleton Object
val cs = ChecksumAccumulator.calculate("Se le calculará el checksum a este String xD")

println("Checksum: " + cs)

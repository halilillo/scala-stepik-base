package lectures.week1basics

object StringOperations extends App {

  val aString: String = "Hello, world!"
  println(aString.length)
  println(aString.charAt(1))
  println(aString.substring(0, 2))
  println(aString.split(" ").toList)
  println(aString.replace("!", "."))
  println(aString.toLowerCase)
  println(aString.toUpperCase)
  println("abcd".reverse)
  println("abcd".take(1))

  val aNumber = "42".toInt
  println((aNumber))
  println(aNumber.getClass)

  println('1' +: "42" :+ '3')
  println('a' +: "bc" :+ 'd')
  println("a" ++ "bc" :++ "d")

  val aStr = "42".+:('1')
  println(aStr.:+('3'))

  val name = "John"
  val surname = "Smith"
  println(s"Hello, $name")
  println(s"Hello, ${name + surname}")
}

package lectures.week1basics

object Expressions extends App {
  val aVal = 1 + 2 * 3
  println(aVal)

  val aCondition = true

  val ifExpressionValue = if(aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue)

  val someVal: Unit = println("I just want to print")

  val aCodeBlock = {
    val someVal = 1
    val y = 2

    if (someVal + y > 1) true else false

    "String to return"
  }
  println(aCodeBlock)
}

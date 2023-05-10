package lectures.week1basics

object Functions extends App {
  def aPerson(name:String, surname:String): String = {
    s"$name $surname"
  }
  println(aPerson("John", "Smith"))

  def callByValue(x: Long): Unit = {
    println(s"call bu value: x1 = $x")
    println(s"call bu value: x2 = $x")
  }

  def callVyName(x: => Long): Unit = {
    println(s"call bu name: x1 = $x")
    println(s"call bu name: x2 = $x")
  }
  callByValue(System.nanoTime())
  println("")
  callVyName(System.nanoTime())

  def aBossFunction(): String = {
    def aHelperFunction(): String = "i'm here to help"
    aHelperFunction()
  }
}

package lectures.week2oop

object Inheritance extends App{
  class Person {
    protected def greet: String = "hello"
  }

  class Student extends Person {
    println(greet)
  }
  val student = new Student
  println(student)

  class Pizza private {
    override def toString = "This is pizza"
  }

  object Pizza {
    val pizza = new Pizza

    def getInstance: Pizza = {
      pizza
    }

  }

  val pizza = Pizza.getInstance
  println(pizza)

}





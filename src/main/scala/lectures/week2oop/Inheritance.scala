package lectures.week2oop

import lectures.week2oop.Inheritance.Person1

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
  class Person1(name:String, age:Int) {
    val gender = "n/a"
    def greet: String=s"Hello"
    def this() = this("UnknownPerson", 0)
  }
  class Student1(name:String, age:Int, id:Int, override val gender: String) extends Person1(name,age) {
    override def greet: String = s"Hello, $name"
  }
  val student1 = new Student1("James", 24, 1,"m")
  println(student1.greet)
  println(student1.gender)
}

class Student2(name: String, age: Int, id: Int, studGender: String) extends Person1 {
  override val gender: String = studGender

  override def greet: String = s"Hello, $name"
}

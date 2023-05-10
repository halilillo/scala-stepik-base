package lectures.week2oop

object ClassesOOP extends App{
  val student = new Student(4,"Bob")
  println(student.name)
  println(student.uni)
  println(student.getId("Pam", 2))
  println(student.getId)
  val i: Instructor = new Instructor(1, "vasya", "pupkin")
  println("@@@@@@@@@")
  println(i.fullName)

}
class Student(id:Int, val name:String) {
  val uni = "University"

  println("Student class")
  def getId(name:String, id: Int): String = s"${this.name} has ID ${this.id} and $name has ID $id"
  def getId: String = s"here is $name's ID $id'"
}

class Instructor(val id: Int, val name:String, val surname:String) {
  def fullName: String = this.name.take(1).toUpperCase + this.name.substring(1,this.name.length) + " " +
            this.surname.take(1).toUpperCase ++ this.surname.substring(1,this.surname.length)
}

class Course(courseID: Int, title:String,val releaseYear:String, instructor: Instructor) {
  def GetID: String = this.courseID.toString + this.instructor.id
  def isTaughtBy(instructor:Instructor): Boolean = if ((this.instructor.id == instructor.id)&
                                                        (this.instructor.name == instructor.name)&
                                                        (this.instructor.surname == instructor.surname)) true else false

  def copyCourse(newReleaseYear:String):Course = {
    new Course(this.courseID, this.title, newReleaseYear, this.instructor)
  }
}

class Button(label: String) {
  def click():String = s"button -${this.label}- has been clicked"
}

class RoundedButton(label: String) extends Button(label) {
  override def click(): String = s"rounded ${super.click()}"
}

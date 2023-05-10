package lectures.week1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <=0) 1
    else n * factorial(n-1)
  }
  println(factorial(3))

  def factorialWithTailRecursion(n: Int): Int = {
    def loop(x: Int, accumulator: Int): Int = {
      if(x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }
    loop(n, 1)
  }
  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc:String=word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }
    loop(n)
  }

  def powerOfTwo(n: Int): BigInt = {
    def loop(n: Int, acc: BigInt=2): BigInt = {
      if (n<=1) acc
      else loop(n-1, acc*2)
    }
    loop(n)
  }


  println(repeatWord("kaktus", 5))
  println(powerOfTwo(10))
  //val s = scala.io.StdIn.readLine().split(" ")//.foreach(w => println(s"# $w"))//.filter(_.nonEmpty)
  val i = "kaktus kaktus kaktus kaktus d kak"

  println(i.split(" ").map(_.trim). reverse.mkString(" "))

}

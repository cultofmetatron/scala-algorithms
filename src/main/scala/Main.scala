import Ordering.Implicits._
import sorting.Sort

object Main extends App {

  def printArray(i: Array[Int]) = {
    i.foreach((item:Int) => print(item + ", "))
    println("")
  }

  println("hello world");

  printArray(Sort.merge(Array(1, 5, 10), Array(1, 3, 5)))
  printArray(Sort.merge(Array(0, 2, 4), Array(1, 3, 5)))
  //printArray(Sort.merge(Array(1, 3, 7), Array(6, 15, 20)))
  //printArray(Sort.merge(Array(6, 6, 6), Array(6, 6, 6)))
  //printArray(Sort.merge(Array(2, 4, 6), Array(4, 3, 5)))
  

}


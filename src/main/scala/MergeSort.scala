package sorting {
  import Ordering.Implicits._
 
  object Sort {
    def mergeSort[T](aList: Array[T]):Int = {
      5
    }

    def merge[T : Ordering: reflect.ClassTag](arr1: Array[T], arr2: Array[T]): Array[T] = {
      def loop(arr1: Array[T], arr2: Array[T], result: Array[T], i: Int, j: Int):Array[T] = {
        println("from the top " + i + ' ' + j)
        if ((i >= arr1.length) && (j >= arr2.length)) {
          println("all done: " + i + " " + j)
          result
        } else if (j <= arr2.length && i <= arr1.length  && arr1(i) <= arr2(j)) {
          println("i: " + i + " " + j)
          val newResult =  result :+ arr1(i)
          loop(arr1, arr2, newResult , i + 1, j)
        }
        else if ( i < arr2.length && arr1(i) >= arr2(j)) {
          println("j: " + i + " " + j)
          val newResult = result  :+ arr2(j)
          loop(arr1, arr2, newResult, i, j + 1)
        }
        else {
          println("not suppossed to print")
          return result //to be resolved to an error later
        }
      }
      loop(arr1, arr2, Array[T]() ,0, 0)
    }


  }


}

import scala.annotation.tailrec

object ScalaTraining {

  def numberSum(a: Int, b: Int): Int = {
    if(b == a +1) 0
    else b - 1 + numberSum(a, b - 1)
  }

  def numberSumTailRec(a: Int, b: Int): Int = {
    @tailrec
    def numberSumAcc(a: Int, b: Int, acc: Int): Int = {
      if (b == a) acc
      else numberSumAcc(a, b-1, acc + b)
    }
  numberSumAcc(a,b, a)
  }

  def concat(str: String, n: Int): String = {
    if (n == 1) str
    else str + concat( str: String, n -1)
  }

  def concatTailRec(str: String, n: Int): String = {
    @tailrec
    def concatAcc(str: String, n: Int, acc: String): String = {
      if( n == 1) acc
      else concatAcc(str, n -1, acc + str)
    }
    concatAcc(str, n, str)
  }

  def stringLength(str: String): Int = {
    if (str.isEmpty) 0
    else 1 + stringLength(str.drop(1))
  }

  def stringLengthTailRec(str: String): Int = {
    @tailrec
    def stringLengthAcc(str: String, acc: Int): Int = {
      if (str.isEmpty) acc
      else stringLengthAcc(str.drop(1), acc + 1)
    }
    stringLengthAcc(str, 0)
  }

  def fibonacci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciTailRec(n: Int): Int = {
    @tailrec
    def fibonacciAcc(n: Int, acc1: Int, acc2: Int): Int = {
      if (n == 0) 0
      else if (n == 1) 1
      else fibonacciAcc(n-1,acc1 ,  acc1+ acc2)
    }
    fibonacciAcc(n, 0, 1)
  }


//  def prime(num: Int): Int = {
//
//  }

//  def countCharacters(s: String): Map[Char, Int] = {
//
//  }







  def main(args: Array[String]): Unit ={
//    println("hello Me")
//    println(numberSum(3, 5))
//    println(numberSumTailRec(5, 7))
//    println(concat("hello", 7))
//    println(concatTailRec("hello", 3))
//    println(stringLengthTailRec("something"))
//    println(stringLength("something"))
    println(fibonacci(10))
    println(fibonacciTailRec(10))
//    println(fibonacciTailRec(5))
  }
}


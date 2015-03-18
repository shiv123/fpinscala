package fpinscala.gettingstarted

/**
 *
 * Created by sramasubra on 3/18/15.
 */
object GettingStartedSuite {

  def testAbs: Boolean = {
    MyModule.abs(-12) == 12 && MyModule.abs(13) == 13 && MyModule.abs(0) == 0
  }

  def testFactorial: Boolean = {
    MyModule.factorial(0) == 1 && MyModule.factorial(1) == 1 && MyModule.factorial(6) == 720
  }

  def testFibonacci: Boolean = {
    MyModule.fib(0) == 0 && MyModule.fib(1) == 1 && MyModule.fib(2) == 1 && MyModule.fib(6) == 8
  }

  def testIsSorted: Boolean = {
    PolymorphicFunctions.isSorted(Array(1, 2, 3, 4, 5, 6, 8), (x: Int, y: Int) => x < y) &&
      !PolymorphicFunctions.isSorted(Array(1, 2, 3, 4, 5, 6, 8), (x: Int, y: Int) => x > y) &&
      !PolymorphicFunctions.isSorted(Array(1, 2, 3, -4, 5, 6, 8), (x: Int, y: Int) => x < y) &&
      PolymorphicFunctions.isSorted(Array('a', 'b', 'c', 'd'), (x: Char, y: Char) => x < y)
  }

  def formatMessage(a: Boolean, msg: String) = {
    if(a) println(msg + " works!")
    else println(msg + " does not work!")
  }
  def main(args: Array[String]): Unit = {
    formatMessage(testAbs, "1. Abs")
    formatMessage(testFactorial, "2. Factorial")
    formatMessage(testFibonacci, "3. Fibonacci")
    formatMessage(testIsSorted, "4. IsSorted")
  }
}



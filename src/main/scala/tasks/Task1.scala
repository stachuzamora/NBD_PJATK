package tasks

import scala.annotation.tailrec

class Task1 extends Task {
  override def runTask(): Unit = {

    val daysList = List(
      "Poniedzialek",
      "Wtorek",
      "Sroda",
      "Czwartek",
      "Piatek",
      "Sobota",
      "Niedziela"
    )

    // for loop
    println(Console.BLUE + "For loop: " + Console.RESET)
    for (i <- daysList.indices) println(daysList(i))
    println()
    //    for (i <- 0 until daysList.length) println(daysList(i))

    // for loop with days starting with "P"
    println(Console.BLUE + "For loop with days starting with \"P\":" + Console.RESET)
    for (i <- daysList.indices) if(daysList(i).head.equals('P')) println(daysList(i))
    println()

    // foreach
    println(Console.BLUE + "For each loop:" + Console.RESET)
    daysList.foreach(x => println(x))
    println()

    // while
    println(Console.BLUE + "While loop" + Console.RESET)
    var listCounter = 0
    while (listCounter != daysList.length) {
      println(daysList(listCounter))
      listCounter += 1
    }
    println()

    // recursive func
    @tailrec
    def recursivePrint(list : List[Any]): Unit = {
      if (list.nonEmpty) {
        println(list.head)
        recursivePrint(list.tail)
      }
    }
    println(Console.BLUE + "Recursive function" + Console.RESET)
    recursivePrint(daysList)
    println()

    // recursive func reverse

    println()

    // foldl and foldr
    val foldL = daysList.foldLeft("")((total : String, day : String) => total + day + "\n")
    println(Console.BLUE + "Using foldLeft" + Console.RESET)
    println(foldL)
    println()

    val foldR = daysList.foldRight("")((total : String, day : String) => total + "\n" + day)
    println(Console.BLUE + "Using foldRight" + Console.RESET)
    println(foldR)
    println()

    // foldl with days starting with "P"
    val foldLIf = daysList.foldLeft("")((total : String, day : String) => if (day.head.equals('P')) total + day + "\n" else total)
    println(Console.BLUE +"Using foldl with days starting with \"P\"" + Console.RESET)
    println(foldLIf)
  }
}

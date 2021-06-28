package tasks

class Task10 extends Task {
  override def runTask(): Unit = {

    val listOfDoubles = List(6.5, -15, -12, 12, 10, 6, -10, -3, 0, -1, 5, 8, 20)

    def getAbsoluteValues(list: List[Double], range: (Int, Int)): List[Double] = {
      list.filter(_ >= range._1).filter(_ <= range._2).map(Math.abs)
    }

    println("Original list:")
    println(listOfDoubles.toString())
    println("After applying function:")
    println(getAbsoluteValues(listOfDoubles, (-5,12)))
  }
}

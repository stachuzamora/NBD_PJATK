package tasks

class Task9 extends Task {
  override def runTask(): Unit = {

    val integerList = List(0, 5, 153, 4, 4, 7, 0, 1, 56, 43, 20, 6, 24, 39, 0, 4, 0)

    def increaseAllElements(list: List[Int], increaseBy: Int): List[Int] = {
      list.map(x => x + increaseBy)
    }
    println("Original list:")
    println(integerList.toString())
    println("After applying function: ")
    println(increaseAllElements(integerList, 1))
  }
}

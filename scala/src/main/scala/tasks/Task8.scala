package tasks

class Task8 extends Task {
  override def runTask(): Unit = {

    val integerList = List(0,0,0,5,153,4,4,7,0,1,56,43,20,6,24,39,0,4,0)

    def removeElement(list: List[Int], elementToDelete : Int): List[Int] = {
      list.filter(_ != elementToDelete)
    }
    println("Original list: ")
    println(integerList.toString())
    println("After applying function: ")
    println(removeElement(integerList, 0))
  }
}

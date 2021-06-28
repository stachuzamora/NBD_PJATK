package tasks

class Task3(val tuple3: (Any, Any, Any)) extends Task {
  override def runTask(): Unit = {

    def printTuple3(tuple3: (Any, Any, Any)): Unit = {
      print("First tuple element: ")
      println(tuple3._1)
      print("Second tuple element: ")
      println(tuple3._2)
      print("Third tuple element: ")
      println(tuple3._3)

    }

    printTuple3(this.tuple3)

  }
}

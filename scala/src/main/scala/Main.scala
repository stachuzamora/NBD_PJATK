import tasks._

import java.time.LocalDateTime

object Main {

  def main(args: Array[String]): Unit = {

   val tasks = List(
     new Task1,
     new Task2,
     new Task3((12, "Jakiś string", LocalDateTime.now())),
     new Task4,
     new Task5(List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela", "Siema")),
     new Task6,
     new Task7,
     new Task8,
     new Task9,
     new Task10
   )

    tasks.foreach(task => {
      println(Console.RED + "tasks.Task : " + task.getClass.getSimpleName + Console.RESET)
      task.runTask()
      println()
    })
  }

}

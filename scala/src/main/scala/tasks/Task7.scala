package tasks

import classes.Person

class Task7 extends Task{
  override def runTask(): Unit = {

    val vader = new Person("Anakin", "Skywalker")
    val neo = new Person("Thomas", "Anderson")
    val frodo = new Person("Frodo", "Baggins")
    val harry = new Person("Harry", "Potter")
    val starLord = new Person("Peter", "Quill")
    val r2d2 = new Person("R2", "D2")

    val list = List(vader, neo, frodo, harry, starLord, r2d2)

    def matchGreeting(person: Person) = person.lName match {
      case "Anderson" | "Baggins" => s"Hello, ${person.fName}"
      case "Potter" => s"Welcome, ${person.fName} ${person.lName}"
      case "Skywalker" => s"Hi, are you my father? ${person.fName} ${person.lName}"
      case _ => "Welcome stranger"
    }

    list.foreach(person => println(s"Greeting of ${person.fName} ${person.lName}: ${matchGreeting(person)}"))

  }
}

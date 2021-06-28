package tasks

class Task5(var listToCheck : List[String]) extends Task{
  override def runTask(): Unit = {

    def daysMatching(day : String) = day match {
      case "Poniedzialek" => "Praca"
      case "Wtorek" => "Praca"
      case "Sroda" => "Praca"
      case "Czwartek" => "Praca"
      case "Piatek" => "Praca"
      case "Sobota" => "Weekend"
      case "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }

    listToCheck.foreach(item => println(item + ": " + daysMatching(item)))
  }
}

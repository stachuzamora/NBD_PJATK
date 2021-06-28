package tasks

class Task4 extends Task{

  val products = Map(
    "coke" -> 5,
    "whisky" -> 80,
    "cereals" -> 10,
    "beer" -> 8
  )

  override def runTask(): Unit = {

    println("First optional: get \"whisky\" price: " + products.get("whisky"))
    println("So we get a value wrapped in \"Some\" class")
    println("For not existing key: get \"vodka\" price:  " + products.get("vodka"))
    println("Proper way could be to use .getOrElse -> e.g. products.getOrElse(\"whisky\", \"No such product\")")
    println("So for the first optional we get -> get \"whisky\" price: " + products.getOrElse("whisky", "No such product"))
    println("And for the not existing one -> get \"vodka\" price: " + products.getOrElse("vodka", "No such product"))

  }
}

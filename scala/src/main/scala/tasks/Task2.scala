package tasks

class Task2 extends Task {
  override def runTask(): Unit = {

    val products = Map(
      "coke" -> 5,
      "whisky" -> 80,
      "cereals" -> 10,
      "beer" -> 8,
      "laptop" -> 3500,
      "keyboard" -> 199
    )

    val productsSale = products.transform((_, v) => v * 0.9)

    println("Original map")
    products.foreach(println)
    println()
    println("After 10% discount: ")
    productsSale.foreach(println)
  }

}

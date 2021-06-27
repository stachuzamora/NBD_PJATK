package tasks

import classes.BankAccount

class Task6 extends Task{
  override def runTask(): Unit = {

    val bankAccount1 = new BankAccount
    val bankAccount2 = new BankAccount(2000)

    println(s"First bank account balance: ${bankAccount1.getAccountBalance}")
    println("First bank account, no money -> withdraw 20")
    bankAccount1.withdraw(20)
    println("Deposit 1000 to first account")
    bankAccount1.deposit(1000)
    val firstWithdraw = bankAccount1.withdraw(500)
    println(s"Withdrawn amount from first account: $firstWithdraw")
    println(s"First bank account balance: ${bankAccount1.getAccountBalance}")

    println(s"Second bank account balance: ${bankAccount2.getAccountBalance}")
    println("Withdraw 100 -> amount withdrawn:" + bankAccount2.withdraw(100))
    println(s"Second bank account balance ${bankAccount2.getAccountBalance}")

  }
}

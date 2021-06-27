package classes

class BankAccount() {

  private var _accountBalance = 0.0

  def getAccountBalance: Double = {
    _accountBalance
  }

  def this(startBalance: Double) {
    this
    _accountBalance = startBalance
  }

  def withdraw(amount: Double): Double = {
    if (this._accountBalance - amount >= 0) {
      this._accountBalance -= amount
      amount
    } else {
      println("You don't have enough money on your account")
      0
    }
  }

  def deposit(amount: Double): Unit = {
    if (amount > 0) _accountBalance += amount
  }


}

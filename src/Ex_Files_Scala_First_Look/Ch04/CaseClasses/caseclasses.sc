object caseClasses {
  println("Welcome to the Scala worksheet")

  case class Money(val amount: Int = 1, val currency: String = "USD") {
    //define a function called '+' to add two money objects
    def +(other: Money): Money = Money(amount + other.amount)
    def -(other: Money): Money = Money(amount - other.amount)
  }
  //creates a money object with 1 USD
  val defaultAmount = Money()
  //creates a money object with 5 USD
  val fiveDollars = Money(5)
  //creates a money object with 5 USD
  val fiveDollars2 = Money(5, "USD")
  //creates a money object with 1 EUR
  val euros = Money(currency = "EUR")

  //copy to make a new Money object
  val tenDollars = euros.copy(10)
  val tenDollars2 = tenDollars.copy(currency = "USD")


  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"))

  //use the + definition above
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD") })
  println("add 10 - 15: " + {Money(15, "USD") - Money(10, "USD") })
}
caseClasses
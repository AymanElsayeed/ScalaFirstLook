object CallBy {
    def something() = {
      println("inside calling something")
      5 // return value
    }
  def callByValue(x: Int) : Unit = {
    println("call by value: ")
    println("x1 = " + x)
   println("x2 = " + x)
  }

  def callByName(x: => Int): Unit = {
    println("call by name: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }


  callByValue(something())

  callByName(something())

}

CallBy
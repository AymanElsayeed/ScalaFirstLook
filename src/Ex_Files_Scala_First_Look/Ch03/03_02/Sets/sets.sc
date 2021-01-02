object sets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val fruit = Set("apple", "orange", "banana")
  fruit("apple")
  fruit("potato")

  var g = Map(1 -> "mMilk", 2 -> "Bread")
  g(1)
  g = g + (5->"Juice")
  println(g)
  g.get(5)

  g.getOrElse(1, "not exists")
}
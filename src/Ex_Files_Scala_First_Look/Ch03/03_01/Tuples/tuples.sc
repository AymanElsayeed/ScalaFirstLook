object tuples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val tuple1 = (1, false, "scala")
  val tuple2 = "computer" -> "Dell Pavilion Desktop"
  tuple1._1
  tuple2._2
  println(tuple1)
  val t = "a" -> 25

  def div10(n:Int):(Int, Int) = (n/10, n%10)

  val (tens, ones) =  div10(85)
  println("tens digit: " + tens)
  println("ones digit: " + ones)
}
object higher {

  val double_it = (i:Int) => i*2

  def highOrderFunction(x:Int, f:Int=>Int) = f(x)

  val results = highOrderFunction(4, double_it)

  println(s"results: $results")

}

higher
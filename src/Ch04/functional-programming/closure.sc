object closure{

  val a = 10

  val multiplier = (x : Int) => x*a

  def cut_it(x:Int): Double = {x/a}

  println(multiplier(10))

  println(cut_it(100))
}

closure
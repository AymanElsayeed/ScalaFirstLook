object patternMatching{

  def max(x: Int, y: Int) = x>y match {
    case true => x
    case false => y
  }

  println(max(1 ,5))
  println(max(6 ,2))
}

patternMatching
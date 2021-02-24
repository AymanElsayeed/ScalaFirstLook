object tuples {

  val tuple1 = (1, false, "scala", 1.5, 1.8F)
  val tuple2 = "computer" -> "Dell Pavilion Desktop"

  println(tuple1)

  val(a, b, c, d, e) =  tuple1
  println(a,b,c,d,e)

  var ele_1 = tuple1._1
  println(ele_1)

  var ele_2 = tuple2._2
  println(ele_2)

  val p1 = Array(0,1,2)
  val p2 = Array(5,4,3)
  val pairs = p1.zip(p2)
  for((a,b) <- pairs) print(a+b)
  println

  def div10(n:Int):(Int, Int) = (n/10, n%10)

  val (tens, ones) =  div10(85)
  println("tens digit: " + tens)
  println("ones digit: " + ones)

}

tuples

object decision {

  var a = 12
  val b = 5

  if ( a%2 == 0 ){println(s"even number $a")}
  else{ println(s"odd number $a")}

  val is_even = if(a%2==0) "yes" else "no"
  println(s"is $a even $is_even")

  val is_odd = if(b%2!=0) "yes" else "no"
  println(s"is $b odd: $is_odd")
}

decision